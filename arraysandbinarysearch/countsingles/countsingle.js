let someList = [1, 2, 3, 3, 3, 5, 6, 7, 8, 9]

someList.sort(function(a,b){
    return a-b;
});

let singles = [];

// is there a cooler way to do this?

for (var i = 1; i < someList.length-1; i++) {
    if (someList[i] !== someList[i-1] && someList[i] !== someList[i+1]) {
        singles.push(someList[i]);
    }
}

if(someList[0] !== someList[1]){
    singles.push(someList[1]);
}

if(someList[someList.length-1] !== someList[someList.length-2]){
    singles.push(someList[ someList.length-1 ]);
}

console.log(singles);

