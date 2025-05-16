class ReverseRPattern1
{
    public static void main(String[] args)
    {
         int rows =5, cols =5;
         for(int r =1; r<=rows; r++)
         {
             for(int c=rows; c>=r; c--)
             {
                if(r==c || r==1 ||c == rows)
                      System.out.print("# ");
                else
                     System.out.print(" ");
             }
          System.out.println();
       }
       for(int r=1; r<=rows; r++)
       {
           for(int c=1; c<=r; c++)
           {
               if(r==c || c==1 || r == rows)
                   System.out.print("# ");
               else
                    System.out.print(" ");
            }
          System.out.println();
       }
   }
}