import java.util.Scanner;
class Power_Number
{
     public static void main(String[] args)
     { 
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number");
       Power p = new Power();
       p.num = s.nextInt();
       p.calDigitExtract();
      
      }
}
 class Power
{
     int num,rem,sum,rev,pro=1;
     void calDigitExtract()
     {      
        while(num>0)
        {
            rem = num%10;
            rev=rev*10+rem;
            sum= sum+rem;
            pro=pro*rem;
            num = num/10;
         }
       System.out.println("Sum is " +sum);
      System.out.println("Product is " +pro);
      System.out.println(sum==pro?"Power Number" : "Not a Power Number");
     }

}  