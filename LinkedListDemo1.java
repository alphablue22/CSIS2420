package week4;

public class LinkedListDemo1
{

  public static void main(String[] args)
  {
    LinkedList ll = new LinkedList();
    //ll.printList();
    ll.append(2);
    ll.append(4);
    ll.append(6);
    ll.append(8);
    ll.append(10);
    ll.Prepend(0);
    ll.Delete(1);
    ll.Search(3);
    ll.Length();
    ll.printList();
  }

}
