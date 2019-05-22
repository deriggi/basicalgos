function recursiveMult(x,y){

    const n = x.toString().length;
    console.log("n is  " + n);
    
    if(n == 1){
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

let answer =recursiveMult("3141592653589793238462643383279502884197169399375105820974944592" , "2718281828459045235360287471352662497757247093699959574966967627");
console.log(answer.toString());