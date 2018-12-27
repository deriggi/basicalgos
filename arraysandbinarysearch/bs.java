import java.util.Arrays;

public class bs{

    public static void main(String[] args){
        System.out.println("hola mundial");
        int[] arr = new int[new Double(Math.floor(Math.random()*1000)).intValue()];
        int length = arr.length;
        for(int i= 0; i < length; i++){
            arr[i] = new Double(Math.floor(Math.random()*length)).intValue();
        }

        double flooredIndex = Math.floor(Math.random()*length);
        int flooredIndexInt = new Double(flooredIndex).intValue();
        int target = arr[flooredIndexInt];
        System.out.println("searching for " + target);
        Arrays.sort(arr);
        int javaAnswer = Arrays.binarySearch(arr,target);
        System.out.println( javaAnswer + " java answer" );
        System.out.println(arr[javaAnswer]);
        System.out.println(arr[0] + " "  + arr[length-1]);
        
        int left = 0;
        int right = length -1;
        int middle = -1;
        int iterations = 0;
        while(left <= right){
            
            middle = (left+right)/2;
            System.out.println(left + " " + middle + " " + right + " " + target + " " + flooredIndexInt);
            if(arr[middle] == target){
                System.out.println(middle);
                break;
            }
            if(arr[middle] > target){
                right = middle - 1;
            }else if(arr[middle] < target){
                left = middle + 1;
            }
            iterations++;
            
        }

        System.out.println( arr[middle] + " " + target);
        // System.out.println(Math.(length) + " log of length");
        System.out.println(iterations +" iterations");
    }
}