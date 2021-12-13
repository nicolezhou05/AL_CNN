import java.util.ArrayList;

public class ALTester {
  // public ArrayList<Integer> test;

  public ALTester() {
    // test = new ArrayList<Integer>(23);
    // for( int i = 0; i < 23; i++ ) {
    //   test.add( (int)( 50 * Math.random() ) );
    // }
  }

  public static boolean isSorted(OrderedArrayList test) {
    for (int i = 0; i < test.size() - 1; i++ ) {
      if (!(test.get(i) <= test.get(i+1))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSorted(ArrayList<Integer> test) {
    for (int i = 0; i < test.size() - 1; i++ ) {
      if (!(test.get(i) <= test.get(i+1))) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ArrayList<Integer> test0 = new ArrayList<Integer>(23);
    for( int i = 0; i < 23; i++ ) {
      test0.add( (int)( 50 * Math.random() ) );
    }

    System.out.println(test0);
    isSorted(test0);
    System.out.println(isSorted(test0));

    //Testing sorted
    OrderedArrayList test1 = new OrderedArrayList();
    for(int i = 0 ; i < 23 ; i++) {
      test1.addLinear((int)( 50 * Math.random() ));
    }
    System.out.println(test1);
    isSorted(test1);
    System.out.println(isSorted(test1));
  }


}
