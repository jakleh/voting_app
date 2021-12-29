
import java.util.ArrayList;

/**
*Program creates ballot objects that specify a list of candidates and the office for which they're running.
*/
public class Ballot{

	//Private fields

	/**
	*List of candidates.
	*/
	private ArrayList<Candidate> candidateList;

	/**
	*Name of the relevant office.
	*/
	private String officeName;

	//Ballot constructor

	/**
	*Ballot constructor
	*@param officeName is the name of the office.
	*/
	public Ballot(String officeName){
		this.officeName = officeName;
		this.candidateList = new ArrayList<Candidate>();
	}

	//Getter method for officeName

	/**
	*Returns the name of the office for a given ballot.
	*@return a String representing the office name.
	*/
	public String getOfficeName(){
    return officeName;
	}

	//Method for adding Candidate object to candidateList

	/**
	*Adds Candidate objects to candidateList; prevents duplicate candidates from being added.
	*@param c is the Candidate to be added (unless it is a duplicate).
	*/
	public void addCandidate(Candidate c){
		int truth_value = 0;
		for (Candidate i: candidateList) {
			if (i.getName() == c.getName() && i.getAffiliation() == c.getAffiliation()) {
				++truth_value;
			}
		}
		if (truth_value == 0) {
			candidateList.add(c);
		}
	}

	//Getter method for candidateList

	/**
	*Returns the list of candidates for a Ballot object.
	*@return an array list representing the list of candidates.
	*/
	public ArrayList<Candidate> getCandidates(){
    return candidateList;
	}
}
