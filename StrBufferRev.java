class StrBufferRev
{
      public static void main(String[] args)
      {
            String s = "Hello All";
            String alphabet ="";
            for(int x=0; x<=s.length()-1; x++)
            {
                 char letter = s.charAt(x);
                 if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z'))
                 {
                     alphabet = alphabet + letter;
                  }
            }
          System.out.println(alphabet);
         StringBuffer sb = new StringBuffer(alphabet);
         sb.reverse();
         System.out.println(sb);
         String rev = sb.toString();
         System.out.println(alphabet.equalsIgnoreCase(rev) ? "Palindrome" : "Not a Palindrome");
        // System.out.println(alphabet.contentEqualsequals(sb) ? "Palindrome" : "Not a Palindrome");
     }
}