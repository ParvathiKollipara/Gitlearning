class Fibonacci_Series
{
       public static void main(String[ ] args)
       {
           int n = 10;
           int start = 1, end = n;
           int n1 = 0, n2 = 1, n3 =0;
           while(start<=end)
           {
               n3 = n1+n2;
               n1 = n2;
               n2 = n3;
               System.out.print(n1+" "+n2+" "+n3);
                start++;
            }
          
         }
}
   