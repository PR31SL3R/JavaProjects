public class ActualLinkedList {
    Node first;

    public ActualLinkedList(){
        this.first=null;
    }

    public void add(LinkedList data){
        if(first == null){
            Node dataNode = new Node(data);
            first = dataNode;
        }
        else {
            Node current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void addFront(LinkedList data){
        Node current = first;
        first = new Node(data);
        first.next = current;
    }

    public void remove(int index){
        Node current = first;

        for (int i = 0; i < index; i++){
            System.out.println(i);
            if(i==index-1){
                System.out.println("hej");
                current.next = current.next.next;
            }
            current = current.next;
        }



                //Node current = first;
                //System.out.println(index);
                //System.out.println(current.data.getName());

                //current.next = current.next.next;

        }



    @Override
    public String toString(){
        String returnString ="";
        if(first==null){
            returnString = "[]";
            return returnString;
        }
        Node current = first;
        returnString = "[";
        while(current != null){
            returnString = returnString + current.data.getName() + " " + current.data.getAge() + ",";
            current = current.next;
        }
        returnString = returnString + "]";
        return returnString;
    }

    public int sizeCounter(){
        int size = 0;
        Node current = first;
        while(current != null){
            size ++;
            current = current.next;
        }

        return size;
    }

    public String getNode(int index){
        int i = 0;
        Node current = first;
        while(current != null){
            if(i==index){

                return current.data.getName();

            }
            i++;
            current = current.next;

        }
        return "Not found";
    }




}
