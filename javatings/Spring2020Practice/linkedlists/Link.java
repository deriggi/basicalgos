package linkedlists;

public class Link{
    public static void main(String[] args){
        System.out.println("hi there");
        // Link one = new Link(32);
        // Link two = new Link(2);

        // one.next = two;
        // printList(one);

        makeRandoList(10);



    }

    private static Link makeRandoList(int size){
        Link head = new Link( rint(100) );

        Link cursor = head;
        for(int i = 0; i < size; i++){
            cursor.next = new Link( rint(100) );
            cursor = cursor.next;
        }

        printList(head);
        return head;

    }

    private static Integer rint( int size ){

        return (int)(Math.floor(Math.random() *size ));

    }

    public static void printList(Link fromNode){
        while(fromNode != null){
            System.out.println(fromNode.data());
            fromNode = fromNode.next();
        }
    }

    public Link(Integer data){
        this.data = data;
    }

    public String toString(){
        return this.data == null ? "" :  this.data.toString();
    }

    private Link next;
    private Integer data;

    public Integer data(){
        return data;
    }

    public Link next(){
        return next;
    }

}