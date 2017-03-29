function main() {
    var s_temp = readLine().split(' ');
    var s = parseInt(s_temp[0]);
    var t = parseInt(s_temp[1]);
    var a_temp = readLine().split(' ');
    var a = parseInt(a_temp[0]);
    var b = parseInt(a_temp[1]);
    var m_temp = readLine().split(' ');
    var m = parseInt(m_temp[0]);
    var n = parseInt(m_temp[1]);
    apple = readLine().split(' ');
    apple = apple.map(Number);
    orange = readLine().split(' ');
    orange = orange.map(Number);

    solve(apple, a);
    solve(orange, b);
    
    function solve(myArray, tree) {
        var count = 0;
        for(d of myArray) {
            if(tree + d >= s && tree + d <= t)
                count++;
        }
        console.log(count);
    }
}
