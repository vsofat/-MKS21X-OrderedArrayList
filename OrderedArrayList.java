import java.util.ArrayList;
import java.util.List;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public int FindIndex(T element){
  		for(int index = 0; index < this.size(); index++){
  			if (this.get(index).compareTo(element) > 0){
  				return index;
  			}
  		}
  		return -1;
  	}
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("ERROR: given value is null and can't be set");
    }
    T result = remove(index);
    add(element);
    return result;
    }
  public boolean add(T element){
    if (element == null) {
      throw new IllegalArgumentException("ERROR: given value is null and can't be added");
    }
    for (int i = 0; i < size(); i++) {
      if (compareTo(get(i)) <= 0) {
        super.add(i, element);
        return true;
      }
    }
    return super.add(element);
    }
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("ERROR: given value is null and can't be added");
            }
    add(element);
    }
  }
