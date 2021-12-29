import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
*Program produces an output file using information contained in a ballot object.
*/

public class ResultWriter{

	/**
	*Prints infomation from a ballot object to output file.
	*@param filename is the name of the output file.
	*@param ballot is the name of the relevant ballot.
	*/

	public static void writeResults(String filename, Ballot ballot)
	throws IOException {

		//Creating list of candidates from given ballot...
		ArrayList<Candidate> given_candidates = ballot.getCandidates();

		//Initializing file and printwriter...
		File my_output = new File(filename);
		PrintWriter my_writer = new PrintWriter(my_output);

		//Creating the title line and printing it to the file...
		String title_line = "RESULTS - " + ballot.getOfficeName();
		my_writer.println(title_line);

		//Creating the line of dashes and printing it to the file...
		String dash = "-";
		int title_line_length = title_line.length();


		String line_of_dashes = dash.repeat(title_line_length);
		my_writer.println(line_of_dashes);

		//Finding the longest candidate line...
		String curr_tag;
		int tag_length;
		int max_length = 0;

		for (Candidate i: given_candidates) {
			curr_tag = i.toString() + String.valueOf(i.getVoteCount());
			tag_length = curr_tag.length();

			if (tag_length > max_length) {
				max_length = tag_length;
			}
		}

		//Setting number of spaces between each candidate and their number of votes...
		int raw_votes;
		String votes;
		int votes_digits;	//What we're trying to extract

		int standard_spaces = 12;
		int useful_length = max_length + standard_spaces;	//Longest tag plus twelve spaces
		int diff_length;	//Number of spaces for a given candidate

		String space = " ";
		String line_of_spaces;

		for (Candidate i: given_candidates) {
			curr_tag = i.toString();
			tag_length = curr_tag.length();

			raw_votes = i.getVoteCount();
			votes = String.valueOf(raw_votes);	//Storing voteCount as string
			votes_digits = votes.length();

			diff_length = useful_length - (tag_length + votes_digits);
			line_of_spaces = space.repeat(diff_length);

			my_writer.println(curr_tag + line_of_spaces + votes);
		}

		//Determining the winner...
		int increment_var = 0;
		int stop_var = given_candidates.size() - 1;

		Candidate winner = given_candidates.get(increment_var);
		Candidate comp_candidate;

		while (increment_var < stop_var) {

			comp_candidate = given_candidates.get(increment_var + 1);
			winner = winner.compareCandidates(comp_candidate);

			++increment_var;
		}

		//Writing the winner to the file...
		my_writer.println("WINNER: " + winner.toString());

		//Closing the file...
		my_writer.close();

	}
}
