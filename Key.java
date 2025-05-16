class Key
{
     public static void main(String[] args)
     {
         A a = new B();
         a.add();
      }
}
class A
{
    void add()
    {
      int a = 5,b=3;
      int c=a+b;
      System.out.println(c);
     }
}
class B extends A
{
   final int a = 10,b=5;
   final void add()
   {
      final int a = 10,b=5;
       int c=a+b;
       System.out.println(c);
    }
}