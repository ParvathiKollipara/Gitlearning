class ForFactors
{
      public static void main(String[ ] args)
      {
           int factor = 69, count=0;
           for(int i = 1; i<=69 ; i++)
           {
              if(factor% i == 0)
              {
                   count++;
                   System.out.println( i );
                   System.out.println(count== 2 ? "Prime Number" : "Not a Prime Number");

              }
           }
      }
}
