import java.io.FileNotFoundException;
class TestException
{
    public static void main(String[] args)
    {
     TestException e = new TestException();
     e.m1();
    }
      public void m1()
      {
           int a = 10, b=0;
           String s = null;
           int arr[] = new int[10];
           try
          {
              //System.out.println(a/b);
              //System.out.println(s.length());
              System.out.println(arr[11]);
          }catch(ArithmeticException ae)
           {
              System.out.println("Catch block");
           }catch(NullPointerException e)
            {
                 e.printStackTrace();
            }catch(IndexOutOfBoundsException i)
             {
                     System.out.println("Index Exception");
             }                
          finally
         {
             System.out.println("Final Block");
          }
    }
}
 
      