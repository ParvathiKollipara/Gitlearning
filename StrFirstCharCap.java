import java.util.Scanner;
class StrFirstCharCap
{
     public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter String");
         String str = s.nextLine();
         StrFlCap s = new StrFlCap();
         s.FirstLastCap(str);
     }
}
class StrFlCap
{
  void FirstLastCap(String str)
  {
    //String s = "Hello All Good Morning";
    String res ="";
    String str[] = str.split();
    for(String t: str)
    {
         String s2 = t;
         s3=s2.tocharAt(0.toUpperCase());
         s4=s2.tocharAt(s2.length.toUpperCase());
         System.out.println(s3);
         System.out.println(s4);
     }
  }
}