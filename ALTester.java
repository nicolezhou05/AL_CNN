import java.util.ArrayList;

public class ALTester {
  public ArrayList<Integer> test;

  public ALTester() {
    test = new ArrayList<Integer>(23);
    for( int i = 0; i < 23; i++ ) {
      test.add( (int)( 50 * Math.random() ) );
    }
  }

  public String toString() {
    return test.toString();
  }


}
