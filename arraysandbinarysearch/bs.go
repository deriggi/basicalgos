package main
import "fmt"
import "math/rand"
// import "math"
import "sort"
import "time"

func main() {

    const randomSize = 1000
    var a [randomSize] int;
    for i := 0; i < len(a); i++{
        a[i] = rand.Intn(randomSize);
    }
    fmt.Println(a[randomSize-20:])
    sort.Ints(a[:]);
    fmt.Println(a[randomSize-20:])

    rand.Seed(time.Now().UTC().UnixNano());
    

    randomTarget := a[rand.Intn(randomSize)];
    fmt.Println(randomTarget);
    left := 0
    right := len(a) -1
    var middle int
    for left <= right {
        
        middle = (left+right)/2  
        
        if a[middle] == randomTarget{
            break
        }
        if a[middle] > randomTarget {
            right = middle - 1
        }else{
            left = middle + 1
        }
        

    }
    
    fmt.Println(randomTarget)
    fmt.Println(a[middle])

}