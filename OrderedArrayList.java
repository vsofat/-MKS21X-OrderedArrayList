import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
      super(); // automatically calls it if you don't add this code
    }
  public NoNullArrayList(){
      super(startingCapacity);
    }
  public String set(int index, String value){
    if (value == null){
       throw new IllegalArgumentException();
    }
    return super.set(index,value);
    }
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(element);
    }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(index, element);
    }


/*  is an ArrayList of T that cannot take a null as a value.

   Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                      otherwise call the old add method.


   Only have 2 constructors:  default + startingCapacity.


OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
   This is a NoNullArrayList that maintains all elements in a sorted order upon insertion.

   Override both add methods -> find the correct index where the new element should be added,
                                then add() the new element into that position
                                (hint: 1.compareTo 2.helper method)

   Override set(index,value) -> remove() the element at index, then add() the new value.

   Only have 2 constructors:  default + startingCapacity.

There are three main tricky parts to this assignment:
1) finding the correct index to add to in OrderedArrayList is the obvious one.
2) using the super methods at the correct time (e.g. in ordered array list, once you know where to put it, use the super.add method)
3) How to make it compile properly... because we want our list to accept a generic type. */

}
