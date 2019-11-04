package election;

/** Creates a Candidate object.
 *
 * @author Douglas Luman
 */
public class Candidate {
  
  private int votes = 0;
  public final String name;
  
  /** Constructor.
   *
   * @param name Candidate's name
   */
  public Candidate(String name) {
    this.name = name;
  }
  
  /** Adds votes for a candidate.
   *
   */
  /*
   * TODO - Implement a method called addVote which takes no parameters
   *      - Returns nothing
   *      - Increments a candidate's vote count by 1
   */
  
  /** Retrieves running vote total for candidate object.
   *
   */
  public int getVotes() {
    return this.votes;
  }
  
  /** Creates string representation of object.
   *
   */
  /*
   * TODO Implement a toString method to provide the format requested in the README.
   */
}