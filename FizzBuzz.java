class FizzBuzz
{
     public static void main(String[] args)
     {
        int n = 9;
        if( n%3== 0 && n%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(n%3==0)
        {
            System.out.println("Fizz");
         }
        else if(n%5==0)
        {
            System.out.println("Buzz");
        }
        else{
           System.out.println("Number is" +n);
        }
   }
}




         
 