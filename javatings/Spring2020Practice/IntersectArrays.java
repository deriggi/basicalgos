import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class IntersectArrays{

    private void intersect(String[] arr1, String[] arr2){
        // sort arr1
        // sort arr2
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // iterate through arr1
        // iterate through arr2

        int l = 0;
        int r = 0;

        List<String> intersections = new ArrayList<>();
        while( l <= arr1.length - 1 && r <= arr2.length - 1 ){
            if( arr1[l].equals(arr2[r]) ){
                intersections.add(arr1[l]);
                l++;
                r++;
            }else{
                l++;
            }
        }

        System.out.println("found " + intersections.size());
    }

    public void identifyDuplicates(String[] arr1){
        Arrays.sort(arr1);

        // for each, remove the second
        int c = 0;
        HashMap<String, Integer> dupes = new HashMap<>();

        while( c < arr1.length -1 ){
            if( arr1[c] == arr1[ c+1 ]){
                if(dupes.get( arr1[c] ) == null){
                    dupes.put(arr1[c],1);
                }

                dupes.put( arr1[c], dupes.get(arr1[c])+1 );      
            }

            c++;

        }

        System.out.println(dupes.size() + " are the number of dupes");
    }

    // remove duplicates
    public void removeDuplicates(String[] arr){
        Arrays.sort(arr);
        printArray(arr);

        // iterate backwards and remove
        for( int i = arr.length - 1; i > 0; i-- ){
            if(arr[i].equals(arr[i-1])){
                arr[i] = null;
            }
        }
        printArray(arr);

    }

    private void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        

    }

    // remove an element by shifting all elements down
    private void deleteElementX(String[] arr, Integer target){
        printArray(arr);

        for(int i = target+1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        // gots to set the last to null
        arr[arr.length-1] = null;

        printArray(arr);
    }

    public void printStacky(Stack<String> st){
        for(int i = 0; i < st.size(); i++){
            System.out.print(st.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }


    // is palindrome
    public void isPalindrome(String[] arr){
        printArray(arr);
        Stack<String> stacky = new Stack<>();

        
        for(int i = 0; i < arr.length/2; i++){
            stacky.push(arr[i]);
        }
        printStacky(stacky);

        int cursor;
        if(arr.length%2 != 0){
            // odd
            cursor = new Double(Math.floor(arr.length/2)+1).intValue();
        }
        else {
            cursor = arr.length/2 ;
        }

        boolean isPal = true;
        while(cursor < arr.length && stacky.size() > 0   ){
            if(!stacky.pop().equals(arr[cursor++])){
                isPal = false;
            }
        }
        System.out.println("pali : " + isPal);
        printStacky(stacky);
    }

    // fix plali
    // find with obstacles
    // flood plain


    
    public static void main( String[] args) {
        System.out.println("will it run from here");
        String[] a1 = {"x", "b", "T", "r", "x", "r"};
        String[] a3 = {"x", "b", "T", "T", "b", "x"};
        String[] a4 = {"x", "b", "T", "r", "T", "c", "x"};


        String[] a2 = {"w", "s", "T", "r"};

        // new IntersectArrays().intersect(a1,a2);
        // new IntersectArrays().identifyDuplicates(a1);
        // new IntersectArrays().removeDuplicates(a1);
        // new IntersectArrays().deleteElementX(a1, 2);
        new IntersectArrays().isPalindrome(a3);



    }



    
}