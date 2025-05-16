class WhileFizzBuzz
{
       public static void main(String[ ] args)
       {
            int start = 1, end = 100;
            while(start<=end)
            {
                 if(start%3 == 0 && start%5 == 0)
                 {
                     System.out.println("FizzBuzz");
                 }
                 else if(start%3 == 0)
                 {
                      System.out.println("Fizz");
                 }
                 else{
                        System.out.println("Buzz");
                }
             start++;
       }
   }
}
