package election;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Manages all election objects.
 *
 * @author {Your Name Here}
 */
public class RunElection {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    /*
     * This section is from the previous practical.
     */
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/candidates.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String name;
    Candidate candidate;
    Ballot ballot = new Ballot();
    while (input.hasNext()) {
      name = input.nextLine();
      candidate = new Candidate(name);
      ballot.addCandidate(candidate);
    }
    /*
     * This section is from the previous practical.
     */
    /*
     * TODO Read vote.tally in the "inputs" directory
     */
    /*
     * TODO Implement loop to read votes and cast ballots using the input
    */
    /*
     * TODO Print final ballot and winner
     */
  }
}