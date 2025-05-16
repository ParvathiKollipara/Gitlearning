class FirstHalf
{
       public static void main(String[ ] args)
       {
            int n = 54362, rem = 0, sum =0, count =0, first_half = 0, second_half = 0, temp = n;
            while(n>0)
            {
               rem = rem%10;
               count++;
               n = n/10;
            }
            System.out.println("Count is " +count);
         n = temp;
          if(count%2 == 0)
          {
              count = count/2;
              int power = (int)(Math.pow(10, count));
              first_half = n/100;
              second_half = n%100;
             System.out.println("First half is " +first_half);
             System.out.println("Second half is" +second_half);
             sum = first_half + second_half;
           }
            else{
               first_half = n/10;
               second_half = n%10;
               System.out.println("First half is " +first_half);
               System.out.println("Second half is" +second_half);
               sum = first_half + second_half;
          }
           System.out.println("Sum is " +sum);
            
     }
}
           
              