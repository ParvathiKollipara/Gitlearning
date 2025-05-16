class LeftRotation
{
      public static void main(String[ ] args)
     {
         int a[] = {10, 20, 30, 40, 50, 60}; // {20, 30, 40, 50, 60, 10}
         int temp = a[0];
         int x;
         for(x=0; x<=a.length-2; x++)
         {
            a[x] = a[x+1];
         }
        System.out.println(x);
        a[x] = temp;
        for(int t:a)
       {
           System.out.println(t);
        }
    }
}