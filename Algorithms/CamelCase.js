function main() {
    var s = readLine();
    var count = 1;
    for(x of s){
        if(x === x.toUpperCase())
            count++;
    }
    console.log(count);

}
