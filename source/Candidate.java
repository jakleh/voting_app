/**
*Program creates candidate objects that specify a candidate's information (name and party) and its associated methods.
*/

public class Candidate implements Comparable<Candidate>{

	//Private fields

	/**
	*Name of candidate.
	*/
	private String name;

	/**
	*Candidate's party.
	*/
	private String affiliation;

	/**
	*Number of votes received by the Candidate.
	*/
	private int voteCount;

	//Candidate constructor

	/**
	*Constructor for Candidate object.
	*@param name is the name of the Candidate.
	*@param affiliation is the name of the Candidate's party.
	*The vote count is initialized to zero.
	*/
	public Candidate(String name, String affiliation){
		this.name = name;
		this.affiliation = affiliation;
		voteCount = 0;
	}

	//Getter methods for name, affiliation

	/**
	*Returns the name of the candidate.
	*@return a String representing the name of the Candidate.
	*/
	public String getName(){
    return name;
	}

	/**
	*Returns the Candidate's party.
	*@return a String representing the name of the Candidate's party.
	*/
	public String getAffiliation(){
    return affiliation;

	}

	//Setter and getter methods for voteCount

	/**
	*Sets the vote count for a Candidate object.
	*@param voteCount is the number of votes to be assigned to the Candidate.
	*/
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	/**
	*Returns the number of votes received by a candidate.
	*@return an int representing the number of votes received by a candidate.
	*/
	public int getVoteCount(){
    return voteCount;
	}

	//Method for incrementing voteCount

	/**
	*Increments the number of votes received by a candidate.
	*/
	public void tallyVote(){
		voteCount += 1;

	}

	//Overriding compareTo method...
	@Override
	public int compareTo(Candidate candidate) {
		return getVoteCount() - candidate.getVoteCount();
	}

	//Method for comparing Candidates

	/**
	*Returns the Candidate object that has received more votes.
	*@param comparison is the Candidate being compared.
	*@return the Candidate object with the most votes.
	*/
	public Candidate compareCandidates(Candidate comparison) {
		if (compareTo(comparison) > 0) {
			return this;
		}
		else {
			return comparison;
		}
	}

	//Specifying how Candidate object is printed

	/**
	*Specifies how the Candidate object is printed.
	@return a String that specifies the Candidate and their affiliation.
	*/
	@Override
	public String toString(){
    return String.format(getName() + " - " + getAffiliation());
	}
}
