import java.util.Scanner;
class Inav{
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        InavNumber i = new InavNumber();
        int num = s.nextInt();
        int result =  i.sumOfDigits(num);
        int res = i.reduceToSingleDigit(num);
       System.out.println(i.calInav(res));
   }
}
     
class InavNumber 
{
    
       int sumOfDigits(int num)
       {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
       System.out.println(sum);
       return sum;
    }

        int reduceToSingleDigit(int num) 
       {
        while (num >= 10) 
        {
            num = sumOfDigits(num);
        }
       return num;
    }

      String calInav(int num)
     {
       
        if (reduceToSingleDigit(num) == 1) 
             return "Inav Number";
       else
             return "Not a Inav Number";
      }
}