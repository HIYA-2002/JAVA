public class Linkedlist {
    Node head;
    private int size;
    Linkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    //Delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        size--;
        head=head.next;
    }

    //Delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public int getSize(){
        return size;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();

        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}
