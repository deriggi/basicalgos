function recursiveMult(x,y){

    const n = x.toString().length;

    console.log("n is  " + n);
    if(n == 1){
       console.log("just one char");
       return x*y;
    }

    let a = x.toString().slice(0,n/2);
    let b = x.toString().slice(n/2);

    let c = y.toString().slice(0,n/2);
    let d = y.toString().slice(n/2);

    console.log(a + " " + b + " " + c + " "  + d);

    let ac = recursiveMult(a ,c);
    let ad = recursiveMult(a, d);
    let bc = recursiveMult(b, c);
    let bd = recursiveMult(b, d);

    return Math.pow(10,n)*ac + Math.pow(10,n/2)*(ad + bc) + bd;
    
    
}   

let answer =recursiveMult(5678 , 1234);
console.log(answer);