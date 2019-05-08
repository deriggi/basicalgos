let one = [1,4,7,8,21,29]
let two = [3,6,7,9,19,30]

function merge(a,b){
    let cursorA = 0;
    let cursorB = 0;
    let merged = [];

    let i = 0;

    while(cursorA < one.length || cursorB < two.length){
        
        console.log("\t" + one[cursorA] + " " + two[cursorB])

        if( a[cursorA]  < b[cursorB] ){
            merged.push( a[cursorA] )
            cursorA++
            console.log("a"+ cursorA)    
        }
        else if( b[cursorB] < a[cursorA]){
            merged.push(b[cursorB])
            cursorB++
            console.log("b" + cursorB)
        }
        else if(b[cursorB] == a[cursorA]){
            console.log("tied")
            merged.push(b[cursorB])
            merged.push(a[cursorA])
            cursorA++;
            cursorB++;
            console.log("b" + cursorB)
            console.log("a"+ cursorA)    

        }
        else if(b[cursorB] == undefined){
            merged.push(a[cursorA])
            cursorA++
        }

        else if(a[cursorA] == undefined){
            merged.push(b[cursorB])
            cursorB++
        }

        
        
    }

    return merged;

}

let m = merge(one,two)

console.log(m);