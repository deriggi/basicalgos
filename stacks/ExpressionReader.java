import java.util.Stack;
import java.util.Scanner;

public class ExpressionReader{
    final static Stack parenStack = new Stack();
    final static Stack dataStack = new Stack();

    final static String openParen = "(";
    final static String closedParen = ")";


    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equals("exit")){
            input = scanner.nextLine();
            for(int i = 0; i < input.length() ; i++){
                final String theChar = input.substring(i,i+1);
                if(theChar.equals(openParen)){
                    parenStack.push(theChar);   
                }else if(theChar.equals(closedParen)){
                    parenStack.pop();
                }    
            }
        }
        
        System.out.println( String.format("%1$s is the size of the paren stack", parenStack.size() ));
        scanner.close();

    }
}