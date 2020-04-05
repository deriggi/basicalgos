function pt(n){
    const board = [];
    for(let i = 1; i < n; i++){
        board[i] = []
        for(let j = 0; j < i; j++){
            if(j == 0 || j == i-1){
                
                board[i][j] = 1;
            }else{
                board[i][j] = board[i-1][j-1] + board[i-1][j]
            }

            
        }
    }

    console.log(board);
}

function bubblesort(){
    let a = [10,4,23,1,4,66,3, 33, 22, 66, 101, 2];
    let max = a.length - 1;
    while(max > 0){
        for(let i = 0; i < max; i++){
            if(a[i] > a[i + 1]){
                // swap
                swap(a,i,i+1);
            }
        }   
        max--;
    }

    console.log(a);
}

function reverseString(somethingToReverse){
    if(somethingToReverse.length <= 1){
        console.log(somethingToReverse);
        return somethingToReverse
    }
    
    return reverseString(somethingToReverse.substring(1)) + somethingToReverse.substring(0,1);
}


function swap(a,s1,s2){
    const temp = a[s1];
    a[s1] = a[s2];
    a[s2] = temp;
}

function checkDiagonals(board){
    for(var r = 0; r < board.length; r++){
        for(var c = 0; c < board[r].length; c++){
            let full = board[r][c] & board[r+1][c+1] & board[r+2][c+2];
            if(full){
                console.log("full");
                break;
            } 
        }
        break;
    }
}

// let b = [];
// b.push([1,0,0]);
// b.push([0,0,0]);
// b.push([0,0,1]);
// checkDiagonals(b);


// console.log(reverseString("hello"));

// fibonacci 
// binary search
// merge sort
// quick sort
// balance parens
// traverse a tree with a queue
// pascal triangle
// pt(8);



function cando(s){
    let stack = [];
    if(s.length % 2 == 0){
        console.log("even");
        
    }else{
        console.log("odd");
        let middle = Math.floor(s.length/2);
        
        console.log("middle is " + middle);
        console.log("middle character is " + s[middle]);
        
        for(let i = 0; i < middle; i++){
            stack.push( s[i] );
        }
        
        let isPali = true;
        for(let j = middle + 1; j < s.length; j++){
            const popped = stack.pop();

            if(popped != s[j]){
                isPali = false;
            }

            console.log(popped + " " + s[j]);
        }

        // console.log(stack);
        console.log(isPali);
        // push until middle
        // pops should equal
    }
}



function binSars(target, arr){
    l = 0; 
    r = arr.length-1;
    m = Math.floor(l + r)/2;

    while (l < r){
        if(arr[m]  < target){
            l =  m + 1;
        }else if(arr[m] > target){
            r = m-1;
        }

        if(arr[m] == target){
            console.log("found " + arr[m] + " at " + m);
            break;
        }

        m = Math.floor((l + r)/2);
    }
}

binSars(11, [1, 3, 4, 6, 7, 9, 11, 13, 15, 16, 17, 18]);
// cando("abcba");