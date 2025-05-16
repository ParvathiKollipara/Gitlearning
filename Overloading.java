class Overloading
{
      public static void main(String[] args)
      {
        Parent parent;
        parent = new Parent();
        System.out.println(parent.m1(10,56.7));
       }
}
class Parent
{
   public void m1()
   {
      System.out.println("No Parameters");
   }
    public int m1(int x)
    {
        return x;
    }
    public double m1(int y, double x)
    {
        return y;
     }
    public String m1(String x)
    {
        return x;
    }
     public char m1(char x)
    {
        return x;
     }
     public long m1(long x)
    {
        return x;
     }
}

