class MethodTC
{
    public void m1(int x)
    {
        System.out.println(x);
     }
     public void m1(long l)
     {
        System.out.println(l);
     }
     public void m1(char c);
     {
        System.out.println(c);
     }
     public void m1(short s)
     {
        System.out.println(s);
     }
    public static void main(String[ ] args)
    {
     MethodTC a = new MethodTC();
     a.m1(11);
    }
} 