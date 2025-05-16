class Tersqrt
{
 public static void main(String[] args)
 {
  int num=24;
  int sqrt = (int)Math.sqrt(num);
  String result = (sqrt*sqrt == num) ? "Perfect square" : "Not a Perfect square";
  System.out.println( num + " is " + result); 
  }
}
