function rev(s){

    if(s.length == 0){
        return s;
    }

    return rev(s.substring(1)) + s[0];
}

