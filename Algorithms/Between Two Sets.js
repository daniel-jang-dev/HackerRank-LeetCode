function main() {
    var n_temp = readLine().split(' ');
    var n = parseInt(n_temp[0]);
    var m = parseInt(n_temp[1]);
    a = readLine().split(' ');
    a = a.map(Number);
    b = readLine().split(' ');
    b = b.map(Number);
    var l = a[0];
    for(x of a) 
    {
        l = lcm(l, x);
    }
    var g = b[0];
    for(x of b)
    {
        g = gcd(g, x);
    }
    
    var count = 0;
    for(i = 1 ; i <= g/l ; i++){
        if( g % (i*l) == 0)
            count++;
    }
    console.log(count);
    
    
    function gcd(a,b) {
        if(a < b)
            return gcd(b, a);
        else if(a == b || b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
    function lcm(a, b) {
        return a * b / gcd(a, b);
    };

}
