import java.time.temporal.Temporal;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList test = new LinkedList("Bob",23);
        LinkedList test1 = new LinkedList("Bob1",24);
        LinkedList test2 = new LinkedList("Bob2",25);
        LinkedList test3 = new LinkedList("Bob3",26);
        LinkedList test4 = new LinkedList("Bob4",27);
        LinkedList test5 = new LinkedList("Bob5",28);
        LinkedList test6 = new LinkedList("Bob6",29);

        //System.out.println(test1.getName());
        Node myNode = new Node(test);

        ActualLinkedList list = new ActualLinkedList();
        //System.out.println(list.first);


        list.add(test);
        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);
        list.add(test5);
        //list.addFront(test6);
        list.remove(3);
        System.out.println(list.toString());

        //System.out.println(list.sizeCounter());
        //System.out.println(list.getNode(0));


    }
}
