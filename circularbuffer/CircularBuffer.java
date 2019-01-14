public class CircularBuffer{
    
    public static void main(String[] args){
        String[] arr = new String[]{"A", "B", "C", "D"};
        System.out.println("to the right");
        // rotateRight(arr);

        System.out.println("to the left");
        rotateLeft(arr);
        System.out.println("to the left");
        rotateLeft(arr);
        System.out.println("to the left");
        rotateLeft(arr);

        System.out.println("to the right");
        rotateRight(arr);
        System.out.println("to the right");
        rotateRight(arr);
        System.out.println("to the right");
        rotateRight(arr);
        
        Boolean valid = arr[0].equals("A")?true:false;
        System.out.println(valid);    
    }

    public static void rotateRight(String[] arr){
        // save right most
        String endo = arr[arr.length-1];

        // rotate up to the right
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1]; 
        }
        arr[0] = endo;

        printArray(arr);
    }

    public static void rotateLeft(String[] arr){
        // save left most
        String endo = arr[0];

        // rotate up to the right
        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            arr[i] = arr[i+1]; 
        }
        arr[arr.length-1] = endo;

        printArray(arr);
    }

    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }



}