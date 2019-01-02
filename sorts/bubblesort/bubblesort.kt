import java.util.Arrays
import java.util.Random
import java.time.Instant
import java.util.Collections

fun main(args: Array<String>){
    
    // our random maker
    val randomSize = Random(Instant.now().toEpochMilli());
    
    // make a rando sized array
    var listy = IntArray(100,{_ -> randomSize.nextInt(1000)})
    
    // set the limit for the right side of the search
    var max = listy.size - 2
    for(i in 0..max){
        for( cursor in 0..max-i){
            if( listy[cursor] > listy[cursor+1]){
                swap(listy, cursor, cursor+1);
            }
        }
    }

    // see what we have
    printArray(listy)
}

// swap the values at two indices
fun swap(arr: IntArray, b: Int, c: Int){
    var temp = arr[b];
    arr[b] = arr[c]
    arr[c] = temp
}

fun printArray(arr: IntArray){
    for (index in arr.indices){
        println(arr[index])
    }
}