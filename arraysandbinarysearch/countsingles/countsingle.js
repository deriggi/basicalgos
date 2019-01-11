let someList = [1, 1, 3, 3, 3, 5, 6, 7, 8, 9]

let singles = [];
for (var i = 1; i < someList.length-1; i++) {

    // is there a cooler way to do this?
    if (someList[i] !== someList[i-1] && someList[i] !== someList[i+1]) {
        singles.push(someList[i]);
    }
    
    
}

console.log(singles);

