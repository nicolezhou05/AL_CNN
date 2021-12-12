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
      hold += _data.get(i) + ",";
    }
    if ( hold.length() > 1 )
      //shave off trailing comma
      hold = hold.substring( 0, hold.length()-1 );
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
  public void addLinear(Integer newVal)
  {
    if (size() == 0){
      _data.add(newVal);
    } else {
      for (int i = 0; i < size(); i++){
        if (newVal <= _data.get(i)){
          _data.add(i, newVal);
          return;
        }
      }
      _data.add(newVal);
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal) {
    int left = 0;
    int right = size() - 1;
    while (left < right ) {
      int mid = left + (right - 1 ) / 2;
      if (_data.get(mid) == newVal) {
        _data.add(newVal);
      }
      else if (_data.get(mid) < newVal ) {
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }
  }

  // public void midRec(Integer newVal, int size) {
  //   int left = 0;
  //   int right =
  // }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    /*-----v-------move-me-down-----------------v--------
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
