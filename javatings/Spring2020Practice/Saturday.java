import java.util.Arrays;

public class Saturday{

    public static void main(String[] args){
        System.out.println("starting");
        String[] testerArr = {"z","S", "Z", "k", "w", "e", "N",  "w", "Z" };
        
        Saturday doThis = new Saturday();

        doThis.rotateLeft( testerArr );
        // doThis.rotateRight( testerArr );
        // doThis.removeDupes( testerArr );

    }

    public void removeDupes(String[] arr){
        java.util.Arrays.sort(arr);

        // from 0 to second to last element compare n with n+1 and remove n if need to
        for(int i = 0; i < arr.length-1; i++){
            if( arr[i].equals(arr[i+1]) ){
                System.out.println(arr[i] + " is a dupe with " + arr[i+1]);
                arr[i] = "";
            }
            
        }

        printArray(arr);

    }

    public void rotateRight(String[] arr){
        // put n-1 element into a temp, shift all to the right from right to left
        System.out.print(" ");
        printArray(arr);

        String temp = arr[arr.length-1];
        for(int i = arr.length-2; i >=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        printArray(arr);
    }

    public void rotateLeft(String[] arr){
        
        System.out.print(" ");

        printArray( arr );
        
        // put 0 element into a temp, shift all to the left from right to left starting at element 1;
        String temp = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
        printArray( arr );
            
    }

    private void printArray(String[] arr){
        for( int i =0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


}