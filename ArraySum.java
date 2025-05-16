class ArraySum
{
      public static void main(String[] args)
      {
         ArraySum a = new ArraySum();
         a.sum();
       }
       void sum()
      {
          int a[][] = {{1,8,6},{4,6,45}};
          int b[][] = {{7, 8,6},{ 9,1,5}};
          int sum[][] = new int[2][3];
          System.out.println("Sum of 2D Arrays ");
          for(int r=0; r<=a.length-1; r++)
          {
               for(int c=0; c<=a[r].length-1; c++)
               {
                   sum[r][c] = a[r][c]+b[r][c];
                   System.out.print(sum[r][c]+" ");
                }
            System.out.println();
         }
    }
}