function main() {
    var x1_temp = readLine().split(' ');
    var x1 = parseInt(x1_temp[0]);
    var v1 = parseInt(x1_temp[1]);
    var x2 = parseInt(x1_temp[2]);
    var v2 = parseInt(x1_temp[3]);
    var v = v1 - v2;
    
    var answer = (v > 0 && (x2-x1) % v == 0) ? "YES" : "NO";
    console.log(answer);    
}
