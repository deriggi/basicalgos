package april5;

import java.util.Arrays;

public class FindSum {

    public static void main(String [] args){
        System.out.println("doing things");
        FindSum fs = new FindSum();
        
        // Integer[] arr = {1,4,6,8,9,0};
        // int target = 13;
        // fs.findSum(arr, target);

        Integer[] soMany  = {12,4,5,7,2,34,55,6,88,8};
        // Arrays.sort(soMany);
        // fs.binarySearch(soMany, 900);

        fs.findSum3(soMany, 36);
    }

    // naive approach
    private void findSum(Integer[] arr, Integer target){
        for(int i = 0; i  < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(j == i){continue;}
                if(arr[i] + arr[j] == target){
                    System.out.println( arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]) );
                }
                
            }
        }
    }

    private void findSum2(Integer[] arr, Integer target){
        // sort the array
        Arrays.sort(arr);
        for( int i = 0; i < arr.length; i++){
            Integer value = arr[i];
            Integer need = target  - value;
            // need to find need
            Integer location = binarySearch(arr, need);
            if(location != -1){
                System.out.println(arr[location] + " " + arr[i]  + " = " + target);
            }
        }
    }

    private void findSum3(Integer[] arr, Integer target){
        Arrays.sort(arr);
        Integer l = 0, r = arr.length-1;
        while(l <= r){
            System.out.println("line");
            Integer sum = arr[l] + arr[r];
            if(sum < target){
                l++;
            }else if(sum > target){
                r--;
            }else if(sum == target){
                System.out.println(arr[r] + " " + arr[l] + " = " + target);
                break;
            }
        }

    }

    private Integer binarySearch(Integer[] arr, Integer target){
        Integer l =0; 
        Integer r = arr.length-1;
        Integer m = (l+r/2);
        while(l <= r){
            if(arr[m] > target){
                r = m-1;
            }
            else if(arr[m] < target){
                l = m+1;
            }
            else if(arr[m] == target){
                System.out.println("found! at " + m );
                return m;
            }
            m = (l+r)/2;
        }

        System.out.println("not found");
        return -1;
    }

}
