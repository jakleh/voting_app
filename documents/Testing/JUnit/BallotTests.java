import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallotTests{
      private Ballot testBallot;
      private Candidate c1;
      private Candidate c2;
      private Candidate comparisonCandidate;
      private int listSize;

      @BeforeEach
      public void setUp(){
        testBallot = new Ballot("President");
        c1 = new Candidate("Joe", "Dems");
        c2 = new Candidate("Joe", "Dems");
      }

      //Test getOfficeName method
      @Test
      public void testGetOfficeName() {
        assertEquals("President", testBallot.getOfficeName());
      }

      //Test addCandidate and getCandidates methods
      @Test
      public void testAddCandidate() {
        testBallot.addCandidate(c1);
        testBallot.addCandidate(c2);

        listSize = testBallot.getCandidates().size();
        comparisonCandidate = testBallot.getCandidates().get(listSize - 1);

        assertEquals(c1, comparisonCandidate);
      }

    }
