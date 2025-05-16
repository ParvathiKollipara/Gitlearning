import java.util.Scanner;
class TwoDArray
{
        public static void main(String[] args)
        {
              Scanner s = new Scanner(System.in);
              System.out.println("Enter no of rows");
              TwoDArray t = new TwoDArray();
              t.printLeftDiagonal();
         }
             void printLeftDiagonal()
             {
               int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
              for(int r=0; r<=a.length-1; r++)
              {
                   for(int c=0; c<=a[r].length-1; c++)
                   {
                       if(r==c)
                       {
                           System.out.print(a[r][c]);
                       }
                      else{
                     System.out.print(" ");
                     }
                 }
            System.out.println();
            } 
       }
}