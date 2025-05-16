class Test
{
      public static void main(String[ ] args)
      {
            int num = 2442, rem = 0, sum =0, quo = 0, temp = num;
            while(num!=0)
            {
                rem = num%10; 
                sum = sum + rem;
                num = num/10;
             }
             System.out.println("Sum is " +sum+ "\nOutput: ");
            num = temp;
            while(num!=0)
            {
                rem = num%10;
                System.out.print((sum / rem) + " ");
                num = num/10;
            }
         
       }
}