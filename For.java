class For
{
       public static void main(String[ ] args)
        {
           int a = 0, b=1, n = 17;
           for(int i = 1 ; i<=n ; i++)
           {
               System.out.print("A is " +a+  "and B is " +b);
               int c = a+b;
               a=b;
               b=c;
               System.out.print("C is " +c);
          }
       }
}
               
             