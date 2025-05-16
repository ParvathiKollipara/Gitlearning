class R1
{
    public static void main(String[] args)
    {
        int rows =5, cols =5;
        for(int r=1; r<=5; r++)
        {
            for(int c=5; c<=6-r; c--)
            {
             System.out.print(c+" ");
             }
        System.out.println();
      }
   }
}