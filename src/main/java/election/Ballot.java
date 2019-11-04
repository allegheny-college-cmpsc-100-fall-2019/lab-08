package election;

import java.util.ArrayList;

/** Creates a ballot object to hold all valid Candidates.
 *
 * @author Douglas Luman
 */
public class Ballot {
  
  private ArrayList<Candidate> form;

  /** Constructor.
   *
   */
  public Ballot() {
    form = new ArrayList<Candidate>();
  }
  
  /** Adds a candidate to the ballot, if not already there.
   *
   * @param candidate Candidate object to add
   */
  public void addCandidate(Candidate candidate) {
    Candidate searchResult = searchCandidates(candidate.name);
    if (searchResult == null) {
      this.form.add(candidate);
    }
  }
  
  /** Retrieves candidate objects by name.
   *
   * @param name Candidate name
   */
  public Candidate getCandidate(String name) {
    Candidate searchResult = searchCandidates(name);
    if (searchResult != null) {
      return searchResult;
    }
    return null;
  }
  
  /** Retrieves the Candidate object of the winner.
  *
  */
  /*
   * TODO - Implement getWinner method to find the maximum vote getter
   *      - This method should return a Candidate object
   *      - This method should use a for loop
   */
  
  /** Fills out a ballot.
   *
   * @param name Candidate name to vote for
   */
  /*
   * TODO - Implement castBallot method, taking 1 parameter, the candidate being voted for
   *      - Allow this method to add write-ins to the ballot
   *      - Allow this method to cast ballots for the write-ins
   *      - This method will use if logic (or switch) to determine whether a vote is for a write-in
   */
  
  /** Searches a ballot form by candidate name and retrieves position.
   *
   * @param name Candidate name
   * @return Candidate Returns Candidate object or null if not found
   */
  private Candidate searchCandidates(String name) {
    Candidate candidate;
    for (int i = 0; i < this.form.size(); i++) {
      candidate = this.form.get(i);
      if (candidate.name.equals(name)) {
        return candidate;
      }
    }
    return null;
  }
  
  /** Prints a complete ballot to the screen.
   *
   */
  public String toString() {
    int index = 0;
    String ballot = "Current ballot for pond representative:" + "\n\n";
    Candidate candidate;
    for (int i = 0; i < this.form.size(); i++) {
      candidate = this.form.get(i);
      ballot += String.format("%-20s%5d",candidate.name,candidate.getVotes());
      if (i != this.form.size()) {
        ballot += "\n";
      }
    }
    return ballot;
  }
}