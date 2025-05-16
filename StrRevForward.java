import java.util.Scanner;
class StrRevForward
{
   public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        StrForward a = new StrForward();
        a.calForward(str);
  }
}
class StrForward
{
    void calForward(String str)
    {
           //String s = "Hello";
           String rev = "";
           for(int x=0; x<=str.length()-1; x++)
           {
               rev = str.charAt(x)+rev;
            }
           System.out.println(rev);
    }
}