package DoublyLinkedList;

public class Link<T> {

    private T data;
    public Link next;
    public Link previous;


    Link(Link previous, T data, Link next){
        this.next=next;
        this.data=data;
        this.previous=previous;
    }


    public T getData(){
        return data;
    }
}
