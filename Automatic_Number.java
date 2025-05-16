import java.util.Scanner;
class Automatic_Number
{
     public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
       Automatic a = new Automatic();
       a.num= s.nextInt();
       a.calSquare();
       a.calDigit();
      }
}
class Automatic
{
     int num,pro;
     void calSquare()
     {
       pro = num*num;
       System.out.println(pro);
      }
     void calDigit()
     {
         int lasttwodigit=pro%100;
         System.out.println(lasttwodigit);
        System.out.println(lasttwodigit==num?"Automatic Number": "Not a Automatic Number");
      }
}
    