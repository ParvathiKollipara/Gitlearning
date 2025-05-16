class Unique
{
       public static void main(String[] args)
       {
          Unique u = new Unique();
         u.unique(new int[]{10, 20, 30, 40, 50, 50, 60, 10, 20, 30});
       }
       void unique(int a[])
       {
           int b[] = new int[a.length];
          for(int x=0; x<=a.length-1; x++)
          {
              if(b[x] == 1)
                  continue;
             int count =1;
             for(int y = x+1; y<=a.length-1; y++)
             {
                   if(a[x] == a[y])
                   {
                        count++;
                         b[y] = 1;
                    }
              }
            if(count == 1)
                System.out.println("Unique elements are " +a[x]);
           else 
               System.out.println("Duplicate elements are " +a[x]);
 
            }
      }
}