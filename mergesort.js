function mergesort(a){
    console.log(a.length + " is length")
    // sorted
    if(a.length ==1){
        return a;
    }
    
    let halfway = Math.floor(a.length/2);
    console.log(halfway + " is halfway");
    let firstHalf = a.slice(0,halfway);
    let secondHalf = a.slice(halfway);

    console.log(firstHalf);
    console.log(secondHalf);
    // merge(firstHalf,secondHalf);
    let C = mergesort(firstHalf)
    let D = mergesort(secondHalf)
    return merge(C, D);
    // let firstHalf = mergesort(a.slice(0,n/2))    
}

function merge(c, d){
    let i = 0; 
    let j = 0;
    let max = Math.max(c.length,d.length);
    console.log(max  + " is max");
    let merged = [];

    while(i < c.length || j < d.length ){

        console.log("merge loop " + i +" " + j + " " + c.length + " " + d.length)
        if(c[i] < d[j]){
            merged.push(c[i]);
            i++;
        }else if( c[i] > d[j]){
            merged.push(d[j]);
            j++;
        }else{
            merged.push(d[j]);
            merged.push(c[i]);
            i++;
            j++;
        }
    }


    // console.log("merged " + merged + " length " + merged.length + " " +(c.length + d.length));
    console.log("length preserved")
    console.log(merged.length === (c.length + d.length));
    console.log(merged + "\n")
    return merged 
}

let unsorted = [2,5,8,4,0,9,3,6,7,9,1]
console.log("length is " + unsorted.length);
mergesort(unsorted)