class RightAnglePattern5
{
       public static void main(String[] args)
       {
            int rows=4, cols =4, temp=1;
            for(int r=1; r<=rows; r++)
            {
                 for(int c=1; c<=r; c++)
                 {
                    if(c==1 || c==2 || c==3 || c== rows)
                    {
                       System.out.print(temp+"  ");
                       temp++;
                     }
                 }
             System.out.println();
          }
      }
}