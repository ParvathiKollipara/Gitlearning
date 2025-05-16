class Str
{
     public static void main(String[] args)
     {
          String s = "Welcome ";
          int l = s.length();
          System.out.println(l);
         for(int x=0; x<=s.length()-1; x++)
         {
              char letter = s.charAt(x);
              System.out.println(letter);
         }
      }
}
     