class StrLearning
{
    public static void main(String[] args)
    {
          String s = "Learning";
          String s2 = s.toUpperCase();
          String rev="";
          for(int x=s2.length()-1; x>=0; x--)
          {
              char letter = s2.charAt(x);
              rev = rev+letter;
          }
          System.out.println(rev);
     }
}