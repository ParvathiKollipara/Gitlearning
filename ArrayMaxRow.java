class ArrayMaxRow
{
      public static void main(String[] args)
      {
         ArrayMaxRow a = new ArrayMaxRow();
         a.Max();
   
       }
              void Max()
              {
                  int a[][] = {{1,2,3}, 
                                   {4,5,6,9}, 
                                   {3,5,10}, 
                                   {23, 34, 67},
                                   {24, 34}};
                  for(int r=0; r<=a.length-1;r++)
                  {
                      int max = a[r][0];
                      for(int c=1; c<=a[r].length-1; c++)
                      {
                           if(a[r][c] > max)
                           {
                                 max = a[r][c];
                            }
                       }
                    System.out.println("Maximum element in each row " +r+ ":"  +max);
                 }
            }
}