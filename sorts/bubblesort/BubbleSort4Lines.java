import java.util.List;
import java.util.ArrayList;

public class BubbleSort4Lines{
    public static void main(String[] args){
        
        Integer randomBigSize = new Double(Math.random()*100).intValue();

        List<Integer> listy = new ArrayList<>(randomBigSize);
        for(int j = 0; j < randomBigSize; j++){
            listy.add(new Double(Math.random()*1000).intValue());
            
        }
        System.out.println(listy.size());
        for(int right = 0; right  <  listy.size()-1; right++ ){
            for(int i = 0; i < listy.size()-1 - right; i++ ){
                if(listy.get(i) > listy.get(i+1)){
                    swap(listy,i,i+1);
                }
            }
        }
        System.out.println(listy);
    }

    public static void swap(List<Integer> someList, Integer a, Integer b){
        Integer temp = someList.get(a);
        someList.set(a,someList.get(b));
        someList.set(b,temp);
    }
}