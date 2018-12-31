import java.util.ArrayList;
import java.util.List;

public class bubblesort{


    public static void main(String[] args){
        Integer size = 10;
        List<Integer> theList = new ArrayList<>(new Double(size*Math.random()).intValue());

        for(Integer i = 0; i < size; i++){
            theList.add(new Double(7*size*Math.random()).intValue());
        }

        // bubble sort it
        Boolean swapped = false;
        Integer rightBuffer = 0;
        for(int i = 0; i < theList.size()-1 - rightBuffer; i++){
            if(theList.get(i) > theList.get(i+1)){
                swap(theList,i, i+1);
                swapped = true;
            }
            if(i == theList.size()-2 - rightBuffer){
                if (swapped == false){
                    break;
                }
                i = -1;
                rightBuffer++;
                swapped = false;

            }
            System.out.println(theList);

        }
        
    }

    public static void swap(List<Integer> someList,Integer a,Integer b){
        Integer temp = someList.get(a);
        someList.set(a, someList.get(b));
        someList.set(b,temp); 
    }

}

