import java.util.Scanner;
class Inav_Number
{
     public static void main(String[] args)
     {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a  number");
      Inav i = new Inav();
      i.num = s.nextInt();
      i.calSum(); 
      }
}
class Inav
{
     int num,sum,rem,sum1,sum2;
     void calSum()
     {
        while(num>0)
        {
           rem=num%10;
           sum=sum+rem;
           if(sum==0 || sum ==9)
           {
               sum1=sum+rem;
           }
           num=num/10;
           if(sum1==0 || sum1== 9)
          {
             sum2=sum1+rem;
          }
       }
      System.out.println(" Total Sum of a number  is " +sum1+" " +sum2);
      System.out.println(sum1==1?"Inav Number" : "Not a Inav Number");
    }
}