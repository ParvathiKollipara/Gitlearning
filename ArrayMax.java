class ArrayMax
{ 
      public static void main(String[] args)
      {
              int a[] = {2, 5, 3, 1, 6, 9, 15};
              int max = a[0];
              for(int i=1; i<=a.length-1; i++)
              {
                   if(a[i] > max)
                   {
                       max=a[i];
                   }
              }
          System.out.println("Maximum element of an array is " +max);
       }
}