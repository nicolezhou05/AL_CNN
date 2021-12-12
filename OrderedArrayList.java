import java.util.ArrayList;

public class OrderedArrayList {

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList() {
    _data = new ArrayList<Integer> (10);
  }

  public String toString() {
    String hold = "{";
    for ( int i = 0; i < _data.size(); i++ ) {
      hold = hold + _data.get(i) + ",";
    }
    hold = hold + "}";
    return hold;
  }

  public Integer remove( int i ) {
    return _data.remove(i);
  }

  public int size() {
    return _data.size();
  }

  public Integer get( int i ) {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal) {
    if (newVal == 0 ) {

    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  // public void addBinary(Integer newVal)
  // {
  //
  // }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();
    /*-----v-------move-me-down-----------------v--------

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
