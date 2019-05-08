function m(a,b){

    let sumLines = [];
    
    for(var i = b.length-1; i >= 0; i-- ){
        
        let carry = 0;
    
        // pad the partial product
        let padding = b.length-1 - i;
        let partialProduct = [];
        for(var p = 0; p < padding; p++){
            partialProduct.unshift(0);
        }

        // make a product
        for(var j = a.length-1; j >= 0; j--){

            let product =  b[i]*a[j] + carry;
               
            if( product > 9 && j > 0 ) {
                // get the higher order carry
                carry = parseInt(product/10);
                let ones = product % 10;
                partialProduct.unshift(ones);
            
            }else if(product > 9 && j == 0){
                console.log("end and " + product);                
                carry = parseInt(product/10);
                let ones = product % 10;
                partialProduct.unshift(ones);
                partialProduct.unshift(carry);

            }else{

                partialProduct.unshift(product);
                carry = 0;
            }

            console.log(b[i] +" " +a[j] + " " + product + " " + padding + " " + j);
        }
        console.log(partialProduct);
        sumLines.push(partialProduct);
        console.log(" ");

    }
    console.log(sumLines);
    return sumLines;

}

function addSumLines(partialProducts){

    console.log("doing sum of partial products")
    let maxLength = 0;

    for(var j = 0; j < partialProducts.length; j++){
        if(partialProducts[j].length > maxLength){
            maxLength = partialProducts[j].length;
        }
    }
    console.log("max length is " + maxLength);

    let columnCursor = 0;
    let result = [];

    let carry = 0;
    while(columnCursor < maxLength){
        
        let sum = 0;
        
        for(var row = 0; row < partialProducts.length; row++){
            
            // for each row, add up this column
            // get last element of each row
            let c = (partialProducts[row].length - 1) - columnCursor;
            if(partialProducts[row][c]){
                console.log(partialProducts[row][c]);
                sum += partialProducts[row][c] ;
                
            }
        }
        sum += carry;
        console.log("sum:" + sum);
        if(sum > 9 && columnCursor < maxLength-1){
            carry = parseInt(sum/10)
            console.log("carry: " + carry + " ones: " + sum%10 );
            result.unshift(sum%10)
        }else if(sum <= 9 && columnCursor < maxLength-1){
            result.unshift(sum);
            carry = 0;
        }else{
            result.unshift(sum);
        }

       
        console.log(" ");
        columnCursor++;
        
    }
    console.log(result.join(""));
}

// test case
// addSumLines(m("2345098","2345098"));
addSumLines(m("3141592653589793238462643383279502884197169399375105820974944592","2718281828459045235360287471352662497757247093699959574966967627"))

// addSumLines(m("2345098","98"));

// console.log((parseInt(959870987/10)));
// console.log(8969980978%10)