function diamond(n){
    for (var i = 0; i < n; i++){
        let line = "";

        let max = i;
        if(i > n/2 ){
            max  = n-i; 
        }
        for(var j = 0; j < max; j++){
            line += "*";
            
        }
        console.log(line);
    }
}

diamond(20);