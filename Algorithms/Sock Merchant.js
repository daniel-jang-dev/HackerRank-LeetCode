function main() {
    var n = parseInt(readLine());
    c = readLine().split(' ');
    c = c.map(Number);
    
    c.sort((a,b)=>a-b);
    var count = 0;
    var check;
    do{
        check = 0;
        for(var i = 0 ; i < c.length-1 ; i++)
        {
            for(var j = i+1 ; j < c.length ; j++)
            {
                if(c[i] == c[j])
                {
                    count++;
                    check++;
                    c.splice(j, 1);
                    c.splice(i, 1);
                    break;
                }
            }
        }
    }while(check != 0)
        
    console.log(count);
}
