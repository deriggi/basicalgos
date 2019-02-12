function m(a,b){
    let sumLines = [];
    let over = 0;
    for(var i = a.length-1; i >=0; i--){
        console.log(a[i] + " times " + b);
        let product = (parseInt(a[i]) * parseInt(b) + over);
        console.log(product)
        let strProduct =product.toString();
        
        if(i > 0){
            sumLines.unshift(strProduct[strProduct.length-1]);    
        }else{
            sumLines.unshift(strProduct);
        }

        if(strProduct.length > 1){
            over = parseInt(strProduct[0]);
        }else{
            over = 0;
        }

    }
    console.log(sumLines.join(""));
}

m("29999","5")
