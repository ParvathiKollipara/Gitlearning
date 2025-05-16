import java.util.Scanner;
class OneDAccess
{
        public static void main(String[] args)
        {
              Scanner s = new Scanner(System.in);
              System.out.println("Enter no of rows");
              OneDAccess o = new OneDAccess();
              o.arrayAccess();
        }
           void arrayAccess()
           {  
               int a[] = {1, 40, 50,38, 20, 15, 10};
               for(int t:a)
               {
                    System.out.println(t);
                }
              int b[][] = {{1,2,3}, {4,9,7, 5,3}, {2,4,5,7,9}};
              for(int t[]: b)
              {
                   for(int t2: t)
                   {
                        System.out.print(t2+" ");
                   }
              }
           }
           void TwoDRightDiagonal()
           {
                
            
       }
}
 