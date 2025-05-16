class RPattern
{
       public static void main(String[] args)
       {
            int rows=4, cols =4, temp=0;
            for(int r=1; r<=rows; r++)
            {
                 for(int c=1; c<=r; c++)
                 {
                    if(r==c)
                    {
                        System.out.print(temp+" ");
                    }
                    else
                    {
                        System.out.print(r+" ");
                    }
                 }
             System.out.println();
          }
      }
}