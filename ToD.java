class ToD
{
      public static void main(String[] args)
      {
          Scanner s = new Scanner(System.in);
          int a[][] = new int[5][3];
          for(int r=0; r<=a.length-1; r++)
          {
               for(int c=0; c<=a[r].length-1; c++)
               {
                   
                    System.out.print(a[r][c]+" ");
                }
              System.out.println();
           }
      }
}