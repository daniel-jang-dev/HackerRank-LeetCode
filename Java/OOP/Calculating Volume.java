//Write your code here
class Calculate {
  Scanner scan;
  Display output = new Display();
  Calculate() throws IOException{
    scan = new Scanner(System.in);
    if(scan == null)
    {
      throw new IOException("dummy");
    }
  }
  public int get_int_val() {
    int n = scan.nextInt();
    if(n <= 0)
      throw new NumberFormatException("All the values must be positive");
    return n;
  }
  public double get_double_val() {
    double d = scan.nextDouble();
    if(d <= 0)
      throw new NumberFormatException("All the values must be positive");
    return d;
  }
  static Volume do_calc() {
    return new Volume();
  }
}
class Volume {
  public double get_volume(int a) {
    return a * a * a;
  }
  public double get_volume(int l, int b, int h) {
    return l * b * h;
  }
  public double get_volume(double r) {
    return 2.0 / 3 * Math.PI * r * r * r;
  }
  public double get_volume(double r, double h) {
    return Math.PI * r * r * h;
  } 
}
class Display {
  public void display(double volume) {
    System.out.printf("%.3f\n",volume);
  }
}
