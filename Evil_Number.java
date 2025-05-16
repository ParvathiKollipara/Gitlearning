import java.util.Scanner;
class Evil_Number
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number");
       Evil e = new Evil();
       e.num=s.nextInt();
       e.calSqrt();
       e.calDigitExtract();       
     } 
}
class Evil
{
    int num, pro=1, sum, rem;
     void calSqrt()
     {
       pro = num*num;
      System.out.println(pro);
     }
  

     void calDigitExtract()
     {
        while(pro>0)
        {
          rem=pro%10;
          pro=pro/10;
          sum = sum+rem;
        }
         System.out.println("Sum is " +sum);
        System.out.println(sum==num?"Evil_Number":"Not a Evil Number");
      }
     
}

