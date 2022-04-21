package DoublyLinkedList;

public class DoublyLinkedList<T> {

    private int size=0;
    Link head;

    public void addFront(T data){
        if(head==null){
            head=new Link(null,data,null);
        }

        else{

            Link newLink=new Link(null,data,head);
            head.previous=newLink;
            head=newLink;

        }
    }

    public void addRear(){

    }


    public void print(){
        Link current=head;

        while(current!=null){
            System.out.println(current.getData());
            current=current.next;
        }
    }
}
