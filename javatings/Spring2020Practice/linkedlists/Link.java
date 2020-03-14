package linkedlists;

public class Link{
    public static void main(String[] args){
        System.out.println("hi there");
        // Link one = new Link(32);
        // Link two = new Link(2);

        // one.next = two;
        // printList(one);


        Link head = makeRandoList(10);
        printList(head);

        System.out.println();
        deleteNodeN(head, 1);
        printList(head);



    }

    private static Link makeRandoList(int size){
        Link head = new Link( rint(100) );

        Link cursor = head;
        for(int i = 0; i < size; i++){
            cursor.next = new Link( rint(100) );
            cursor = cursor.next;
        }

        
        return head;

    }

    private static void deleteNodeN(Link head, int i){
        int counter = 0;
        Link cursor = head;
        Link prev = head;

        while(counter++ < i && cursor != null){
            prev = cursor;
            cursor = cursor.next;
        }

        prev.next = cursor.next;
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