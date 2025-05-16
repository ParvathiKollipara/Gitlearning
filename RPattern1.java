class RPattern1
{
       public static void main(String[] args)
       {
            int rows=4, cols =4;
            char a= 'A';
            for(int r=1; r<=rows; r++)
            {
                 int t=r;
                 for(int c=1; c<=r; c++)
                 {
                         System.out.print(t+""+a +" ");
                         t++;
                 }
                a++;
               System.out.println();
            }
      }
}