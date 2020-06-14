import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice1 {

    public static void main(final String[] args) {
        System.out.println("hi");

        // new Practice1().balanceParensArrayList("([({)]})");
        // new Practice1().bubbleSort(new int[] {5,1, 5, 1, 3, 68 });
        // new Practice1().rockPaperScissors(new Character[] {'r', 'p', 's', 'p', 'p', 'r', 's', 'r'});
        new Practice1().removeDuplicates(new int[] {1,4,4,3,6,8,1,1});
    }

    private void removeDuplicates(int[] arr){
        Arrays.sort(arr);
        
        List<Integer> singles= new ArrayList<>();
        for( int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                i++;
            }else{
                singles.add(arr[i]);
            }
        }
        printArray(singles.toArray());

    }

    private void balanceParensArrayList(final String in) {
        HashMap<Character, Character> closeOpenMap = new HashMap<>();
        closeOpenMap.put(']', '[');
        closeOpenMap.put('}', '{');
        closeOpenMap.put(')', '(');

        final List<Character> stack = new ArrayList<>();
        

        for(int i = 0; i < in.length(); i++){
            if(closeOpenMap.containsKey(in.charAt(i)) && stack.get(stack.size()-1).equals( closeOpenMap.get( in.charAt(i) ) )){
                //pop
                stack.remove(stack.size()-1);
            }else{
                stack.add(in.charAt(i));
                System.out.println("size is now " + stack.size());
            }
            
        }
        System.out.println(stack.size() + " is the stack size now");

    }

    private void bubbleSort(int[] arr){
        
        for(int buffer = 1; buffer < arr.length; buffer++){
            for(int i = 0; i < arr.length - buffer; i++){
                if( arr[i] > arr[i+1] ){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        printArray(arr);

    }

    // rock paper scissors tournament
    // play each pair against eachother
    // odds lose
    private void rockPaperScissors(Character[] arr){
        Map<Character, Character> winMap = new HashMap<>();
        winMap.put('r','s');
        winMap.put('p','r');
        winMap.put('s','p');

        List<Character> winners = new ArrayList<Character>(); 
        for( int i = 0; i < arr.length - 1; i+=2){
            if(winMap.get(arr[i]).equals(arr[i+1])){
                winners.add(arr[i]);
                System.out.println(arr[i] + " wins vs " + arr[i+1]);
            }else{
                winners.add(arr[i+1]);
                System.out.println(arr[i+1] + " wins vs " + arr[i]);
            }
        }
        
        if(winners.size() > 1){
            System.out.println(winners.size() + " winners");
            rockPaperScissors(  winners.toArray(new Character[winners.size()]));
        }else{
            System.out.println("winner is ");
            printArray(winners.toArray());       
        }
         
    }

    private void printArray(Object[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
   
    private void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
        

    
}