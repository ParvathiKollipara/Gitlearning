class RightRotation
{
     public static void main(String[] args)
     {
          int a[] = {10, 20, 30, 40, 50, 60};  // {60, 10, 20, 30, 40, 50}
          int temp = a[a.length-1];
          int x;
          for(x=a.length-1; x>0; x--)
          {
              a[x] = a[x-1];
          }
         a[x] = temp;
        for(int t: a)
        {
           System.out.println(t);
         }
      }
}

