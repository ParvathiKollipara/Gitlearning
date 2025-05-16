class ForNumber
{
      public static void main(String[ ] args)
      {
          int num = 24435, rem =0, sum =0, count =0;
          for(; num!=0;)
          {
              count++;
              rem = num%10;
              int power = (int)Math.pow(rem, count);
              sum = sum + power;
              num = num/10;
             System.out.println(rem);
          }
        System.out.println("The result is " +sum);
     }
}

          
