package arraylists;


import java.util. * ;
public class ConcurrentModificationException {
  public static void main(String[] args) {
    ArrayList < Integer> list = new ArrayList <Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    Iterator <Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer value = iterator.next();
      System.out.println("The value of the List is:" + value);
      if (value.equals(3)) list.remove(value);
    }
  }
}