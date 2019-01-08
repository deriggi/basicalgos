
function shiftRight(arr){
    // save n-1 to a temp
    let lastElement = arr[arr.length-1]
    
    const n = arr.length;
    // shift from n-2 to 0

    for(var i = n - 2; i >= 0; i-- ){
        arr[i+1] = arr[i]; 
    }
    arr[0] = lastElement
    return arr;
}

let myArray =  ['a','b','c', 'd'];
console.log(shiftRight(myArray));