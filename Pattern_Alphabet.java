class Pattern_Alphabet
{
      public static void main(String[] args)
      {
           int rows =4, cols =4;
           for(int r=0; r<rows; r++)
           {
               char ch = (char)('A' + r);
               for(int c=0; c<cols; c++)
               {
                    System.out.print(ch+"  ");
                   ch++;
               }
                 System.out.println();
          }
    }
}                