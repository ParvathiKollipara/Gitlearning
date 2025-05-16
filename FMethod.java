class FMethod
{
     public static void main(String[] args)
     {
          FMethod f = new FMethod();
          f = null;
          System.gc();
         System.out.println("unreferenced object is destroyed");
     }
     @Override
     protected void finalize()
    {
         System.out.println("inside Finalize");
     }
}