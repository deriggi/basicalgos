

function bubbleSort(s){
    let arr = [];
    for(var i = 0; i < s; i++){
        arr.push(Math.random()*s*4);
    }
    console.log(arr);

    // way prettier with nested for loops!
    for (var right = 0; right < arr.length-1; right++){
        for(var i =0; i< arr.length-1 - right; i++ ){
            if(arr[i] > arr[i+1]){
                swap(arr,i,i+1)
            }
        }
    }

    console.log(arr);
}

function swap(arr,a,b){
    let temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

bubbleSort(10)