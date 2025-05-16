class Interface
{
     public static void main(String[] args)
     {
        Interface i = new Interface();
        M m =i.m1();
      }

     public M m2()
    {
      return new Aimpl();
     }
}
      interface M
     {
         public void m1();
      }
     class Aimpl implements M
    {
      public void m1()
      {
        System.out.println("The interface class is M");
       }
}
