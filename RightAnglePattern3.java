class RightAnglePattern4
{
       public static void main(String[] args)
       {
            int rows=4, cols =4;
            for(int r=1; r<=rows; r++)
            {
                 for(int c=1; c<=r; c++)
                 {
                       System.out.print(c+" ");
                       c++;
                 }
             System.out.println();
          }
      }
}