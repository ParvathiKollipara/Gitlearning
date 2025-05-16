class Main
{
     public static void main(String[] args)
     {
         Main m = new Main();
         System.out.println(m.m1());
       
     }
      public String m1()
      {
            try
            {
                 System.out.println(10/0);
                 return "try";
            }catch(Exception e)
            {
                    return "catch";
            }
            finally
            {
                 return "Finally";
            } 
        }
}