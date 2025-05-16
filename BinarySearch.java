class BinarySearch
{
       public static void main(String[] args)
       {
            int a[] = {10,40,5, 39, 88, 38};
            for(int x=0; x<=a.length-2; x++)  // 0<=4  [0 1 2  3 4 5]
            {
               for(int y = x+1; y<=a.length-1; y++) // [ 1 2 3 4 5 6]
               {
                   if(a[x]<a[y])  
                   {
                        int t = a[x]; 
                        a[x] = a[y];
                        a[y]=t;
                     }
                }

            }
           System.out.println("Descending order is");
           for(int t: a)
           {
           System.out.print(t +" ");
           }
            int search = 38, f = 0, l=a.length-1, m =0;
            while(f<=l)
            {
                m =(f+l)/2;
                if(search == a[m])
                {
                    System.out.println("\nElement found");
                    return;
                 }
                else if(search>a[m])
                {
                   l=m-1;            
               }
                else{
                   f=m+1;
                }
            }
          System.out.println("Element not found");
       }
}
