function main() {
    var n = parseInt(readLine());
    for(var a0 = 0; a0 < n; a0++){
        var grade = parseInt(readLine());
        if(grade >= 38 && grade%5 > 2 )
        {
            grade = Math.ceil(grade / 5) * 5;
        }
        console.log(grade);
    }
}
