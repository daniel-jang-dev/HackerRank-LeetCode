function main() {
  var n = parseInt(readLine());
  height = readLine().split(' ');
  height = height.map(Number);
  // sort reverse order
  height.sort((a,b) => b-a);
  var count = 0;
  var maxHeight = height[0];
  for(x of height)
  {
    if(x == maxHeight)
    count++;
  }
  process.stdout.write(count);
}
