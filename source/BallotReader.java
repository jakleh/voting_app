
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
*Program reads an input file that contains election information and stores that information in a ballot object.
*/

public class BallotReader{

	/**
	*Returns a ballot after reading info from input file.
	*@param filename is the name of the input file.
	*@return a Ballot containing information from the input file.
	*/

	public static Ballot readBallot(String filename)
	throws IOException {

		//Inputting file...
		File myObj = new File(filename);
		Scanner file_scnr = new Scanner(myObj);

		//Putting lines into array of size 5...
		String[] line_array = new String[5];

		int list_index = 0;
		while (file_scnr.hasNextLine()) {
			line_array[list_index] = file_scnr.nextLine();
			++list_index;
		}

		//Variable that stores first line of input file
		String name_of_ballot = line_array[0];

		//Creating a ballot using the ballot name from the first line of input...
		Ballot ballot = new Ballot(name_of_ballot);

		String rough_line = line_array[1];
		String rough_num = rough_line.charAt(0) + "";
		int num_candidates = Integer.parseInt(rough_num);

		//Array for splitting the candidate info
		String[] candidate_info = new String[2];

		String candidate_name;
		String candidate_party;

		int current_index;

		//Adding candidates to the ballot...
		for (int i = 0; i < num_candidates; i++) {
			current_index = (i + 2);	//Must start at third line...
			candidate_info = line_array[current_index].split(";");

			candidate_name = candidate_info[0];
			candidate_party = candidate_info[1];

			ballot.addCandidate(new Candidate(candidate_name, candidate_party));

		}

		return ballot;

	}
}
