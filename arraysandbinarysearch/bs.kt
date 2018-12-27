import java.util.Arrays
import java.util.Random
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.Instant

fun main(args: Array<String>) {
    // a new random generator
    val random = Random(Instant.now().toEpochMilli());
    var randLength = random.nextInt(1000);
    
    // random length
    var x =  IntArray(randLength,{i -> random.nextInt(1000)})
    x.sort()

    // random target
    val target = x[random.nextInt(randLength)];
    var left = 0
    var right = randLength-1
    var middle: Int =0

    // print the target
    println("$target is the target")

    // loop until we converge
    while (left <= right){

        // define the middle
        middle = ( (left + right)/2 )
        if(x[middle] == target){
            break;
        }

        if(x[middle] > target){
            right = middle - 1;
        }else{
            left = middle + 1
        }
    }

    // print what we have
    val mid = x.get(middle)
    println("$target and $mid")
}