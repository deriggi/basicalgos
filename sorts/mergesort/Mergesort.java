public class Mergesort {

    public static List<Integer> mergeSort(List<Integer> unsorted){
        
        // base case
        if(unsorted.size() <= 1){
            return unsorted;
        }

        Integer midPoint = unsorted.size()/2;
        List<Integer> a = mergeSort(subList(0,midPoint));
        List<Integer> b = mergeSort(unsorted.subList(midPoint, unsorted.size()-1));

        return merge(a, b);
        
    }

    public static void merge(List<Integer> a, List<Integer> b) {
        List<Integer> merged = new ArrayList<Integer>();
        // track two cursors
    }
}