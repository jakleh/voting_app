import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CandidateTests{
      private Candidate c1;
      private Candidate c2;

      @BeforeEach
      public void setUp(){
        c1 = new Candidate("Hillary", "Dems");
        c2 = new Candidate("Snoop", "Ballers");
      }

      @Test
      public void testCandidateName(){
        //Test getName method
        assertEquals("Hillary", c1.getName());
      }

      @Test
      public void testCandidateAffiliation(){
        //Test getAffiliation method
        assertEquals("Ballers", c2.getAffiliation());
      }
      @Test
      public void testTallyVote(){
        //Test getVoteCount and tallyVote methods
        for (int i = 0; i < 12; i++){
          c1.tallyVote();
        }
        assertEquals(12, c1.getVoteCount());
      }

      @Test
      public void testCompareTo() {
        //Test compareTo method
        c1.setVoteCount(12);
        c2.setVoteCount(12);

        assertEquals(0, c1.compareTo(c2));
      }

      @Test
      public void testCompareCandidates() {
        //Test compareCandidates method
        c2.setVoteCount(13);

        assertEquals(c2, c1.compareCandidates(c2));
      }



}
