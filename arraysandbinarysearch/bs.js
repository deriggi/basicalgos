let someArray = [];
for(var i = 0; i < 10; i++){
    someArray.push(i*Math.random());
}
console.log(someArray);
/// get a random element
let randomIndex = Math.floor((someArray.length-1)*Math.random());
console.log("random index is " + randomIndex);

let target=  someArray[randomIndex];
console.log("target is",target);
someArray.sort(function(a, b) {
    return a - b;
  });

console.log(someArray);

let left = 0;
let right = someArray.length-1;
let m = Math.floor((right + left)/2);
let iterations = 0;
while(someArray[m] !== target){
    m = Math.floor((right + left)/2);
    if(someArray[m] == target){
        break;
    }
    if(target < someArray[m]){
        right = m-1;
        
    }else{
        left = m+1;
    }
    
    console.log("ends are " + left + " " + right + " " + m);
    iterations++;
}
console.log("found " + target + " as " + someArray[m]  + " after " + iterations);



