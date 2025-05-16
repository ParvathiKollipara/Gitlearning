class RightAnglePattern6
{
       public static void main(String[] args)
       {
            int rows=4, cols =4;
            for(int r=1; r<=rows; r++)
            {
                // int temp =r;
                 for(int c=1; c<=r; c++)
                 {
                       int temp =c;
                      if( c==1 || c==r || r==rows)
                      {
                          System.out.print(temp+" ");
                          temp++;
                      }
                      else{
                          System.out.print(" ");
                      }
                }
            System.out.println();
         }
    }
}
