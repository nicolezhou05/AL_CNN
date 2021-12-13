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

  public boolean isSorted() {
    for (int i = 0; i < test.size(); i++ ) {
      if (!(test.get(i) <= test.get(i+1))) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ALTester test0 = new ALTester();
    System.out.println(test0);
    test0.isSorted();
    System.out.println(test0.isSorted());

    
  }


}
