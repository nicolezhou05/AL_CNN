import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer> (23);
  }

  public String toString()
  {
    return _data.toString();
  }

  public Integer remove( int i )
  {
    return _data.remove(i);
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
    return _data.get(i);
  }

  public void add(Integer newVal) {
      _data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    boolean inserted = false;
    if (size() == 0){
      _data.add(newVal);
    } else {
      for (int i = 0; i < size(); i++){
        if (newVal <= _data.get(i)){
          _data.add(i, newVal);
          inserted = true;
          break;
          //return; can include instead of using boolean inserted
        }
      }
      if (inserted == false){
      _data.add(newVal);
    }
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
public void addBinary(Integer newVal) {
  if (size() == 0){
    _data.add(newVal);
  }
  else {
    int left = 0;
    int right = size() - 1;

    while (true) {

      int mid = (int)((left + right) / 2);
      int midVal = _data.get(mid);

      if(midVal == newVal) {
        _data.add(mid, newVal);
        break;
      }
      else if((right - left) < 1){
        if (newVal > midVal){
          _data.add(mid + 1, newVal);
          break;
        } else{
          _data.add(mid, newVal);
          break;
        }
      }
      else if(newVal > midVal){
        left = mid + 1;
      } else{
        right = mid - 1;
      }
    }
  }
}

  // main method solely for testing purposes
  public static void main( String[] args )
  {


    OrderedArrayList Franz = new OrderedArrayList();
    System.out.println(Franz);

    //testing linear search
    for( int i = 0; i < 15; i++ )
    Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );


    // testing binary search
    Franz = new OrderedArrayList();
    System.out.println(Franz);

    for( int i = 0; i < 15; i++ )
    Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
    =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
