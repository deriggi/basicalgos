import java.util.Scanner;

public class Stacky{
    private Integer[] arr = new Integer[10];
    private int N = 0;

    public void push(Integer i){
        arr[N++] = i;
    }

    public Integer pop(){
        return arr[--N];
    }

    public void print(){
        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] agrs){
        System.out.println("will it print");
        Stacky s = new Stacky();
        s.push(2);
        s.push(5);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.pop());
        

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("exit")){
            input = scanner.nextLine();
            for(int i = 0; i < input.length() ; i++){
                System.out.println(input.charAt(i));
            }

        }
        scanner.close();
    }
    // implement a linked list
    /// implement a stack as a linked list
    // implement a queue as a linked list
}