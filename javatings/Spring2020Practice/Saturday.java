import java.util.Arrays;

public class Saturday{

    public static void main(String[] args){

        System.out.println("starting");
        String[] testerArr = {"z","S", "Z", "k", "w", "e", "N",  "w", "Z" };
        String[] testerArr2 = {"z","b", "Z", "9", "w", "e", "5",  "5", "Z" };
        Saturday doThis = new Saturday();

        doThis.intersect(testerArr, testerArr2);

        // doThis.intersectArraysWithoutReshuffling(testerArr, testerArr2);
        // doThis.rotateLeft( testerArr );
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

    // matches intersections on position only
    public void intersectArraysWithoutReshuffling(String[] arr1, String[] arr2){
        int c1 = 0;
        int c2 = 0;
        
        String[] matchy = new String[arr1.length];

        while( c1 <= arr1.length - 1 && c2 <= arr2.length - 1) {
            if( arr1[c1].equals(arr2[c2]) ){
                matchy[c1] = arr1[c1];
            }
            c1++;
            c2++;
        }
                
        printArray(matchy);
        
    }

    // interset based on characters
    private void intersect(String[] arr1, String[] arr2){

        int c1 = 0; 
        int c2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String[] intersection = new String[arr1.length];
        int interIndex = 0;

        while(c1 <= arr1.length && c2 < arr2.length){
            
            if( arr1[c1].equals(arr2[c2]) ){
                intersection[interIndex++] = arr1[c1];
                c1++;
                c2++;
            }
            else if( arr1[c1].compareTo(arr2[c2]) < 0 ){
                c1++;
            }
            else if( arr1[c1].compareTo(arr2[c2]) > 0 ){
                c2++;
            }

        }

        printArray(intersection);

    }


    // tic tac toe?


    private void printArray(String[] arr){
        for( int i =0; i < arr.length; i++){
            String toPrint = arr[i] == null ? "" : arr[i];

            System.out.print(toPrint);
            System.out.print(", ");
        }
        System.out.println();
    }


}