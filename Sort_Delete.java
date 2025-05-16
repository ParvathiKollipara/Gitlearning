class Sort_Delete
{
     public static void main(String[] args)
     {
          int a[] ={20, 5, 43, 39, 24, 50};
          for(int x=0; x<=a.length-2; x++)
         {
            for(int y=x+1; y<=a.length-1; y++)
            {
                if(a[x]>a[y])
                {
                    int temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                 }
               }
           }
        for(int t:a)
        {
           System.out.print(t+" "
);  // [5, 20, 24, 39, 43, 50]
        }
        int search = 50, f = 0, l=a.length-1,m =0;
        while(f<=l)
        {
           m = (f+l)/2;
           if(search==a[m])
           {
                System.out.println("\nElement is found and delete the search element 24 at index 2\n");
                for(int x=m; x<=a.length-2; x++) 
                {
                    a[x] = a[x+1];
                }
               a[a.length-1] =0;
              System.out.println("Array after deletion");
              for(int x=0; x<=a.length-1; x++)  // [5, 20,39, 43,50,0]
              {
                   System.out.println(a[x] +"  ");
              }
              return;
           }
            else if(search>a[m])
            {
                 f=m+1;
            }
           else{
                l = m-1;
            }
       }
         System.out.println("\nElement not found");
        for(int x=a.length-1; x>3; x--) //[5, 20, 44, 39,43,50]
         {
                a[x] =a[x-1];
         }
         a[3] = search;
         System.out.println("Array after insertion");
        for(int t: a)
        {
            System.out.println(t);
        }
     }
}

        