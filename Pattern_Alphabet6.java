class Pattern_Alphabet6
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
          for(int i=2; i<=6; i++)
          {
              System.out.print(i+"  ");
           }
           System.out.println();
           char ch1 = 'F';
           for(int i=0; i<cols; i++)
           {
               System.out.print(ch1+"  ");
               ch1++;
            }
           System.out.println();
          for(int i=4; i<=8; i++)
          {
               System.out.print(i+"  ");
           }
      }
}