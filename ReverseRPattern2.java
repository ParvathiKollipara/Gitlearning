class ReverseRPattern2
{
    public static void main(String[] args)
    {
         int rows =5, cols =5;
         for(int r =1; r>=rows; r++)
         {
             for(int c=1; c<=r; c++)
             {
                  System.out.print("# ");
             }
          System.out.println();
       }
       for(int r=rows; r>=; r--)
       {
           for(int c=r; c>=1; c--)
           {
               System.out.print("# ");
            }
          System.out.println();
       }
   }
}