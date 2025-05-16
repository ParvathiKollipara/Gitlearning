class Pattern_Alphabet5
{
  public static void main(String[] args)
  {
       int cols = 5;
       char ch = 'A';
       for(int i=0; i<cols; i++)
       {
           System.out.print(ch+"  ");
           ch++;
       }
      System.out.println();

      System.out.print("#  ");
      for(int i=3; i<=5; i++)
     {
          System.out.print(i+"  ");
     }
      System.out.print("#  ");
     System.out.println();
     
      System.out.print("#  ");
      for(int i=4; i<=6; i++)
      {
           System.out.print(i+"  ");
      }
       System.out.print("#  ");
     System.out.println();
     
      char ch1 = 'F';
       for(int i=0; i<cols; i++)
       {
           System.out.print(ch1+"  ");
           ch1++;
       }
   }
}

     