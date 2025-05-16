class SecMax
{
     public static void main(String[] args)
     {
          int firstmax = -1, firstmin = 100;
          int secmax = -1, secmin = 100;
          int a[] = new int[] {50,5,89,50,20,20};
          for(int x = 0; x<=a.length-1; x++)
          {
              if(a[x] > firstmax)
             {
                  secmax = firstmax;
                  firstmax = a[x];
             }
             else if(a[x] <firstmax && a[x] > secmax)
             {
                 secmax = a[x];
              }
             if(a[x]<firstmin)
            {
                 secmin = firstmin;
                 firstmin = a[x];
           }
            else if(a[x] >firstmin && a[x] <secmin)
           {
                  secmin = a[x];
            }
        }
         System.out.println("Second min element is :" +secmin);
         System.out.println("Second max element is:" +secmax);

   }
} 