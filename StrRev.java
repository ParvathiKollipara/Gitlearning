class StrRev
{
       public static void main(String[] args)
       {
             String s = "Madam";
             String rev = "";
             for(int x=s.length()-1; x>=0; x--)
            {
                 char letter = s.charAt(x);
                 rev = rev + letter;
             }
          System.out.println(rev);
         System.out.println(rev.equals(s) ? "Palindrome" : "Not a Palindrome");
         System.out.println(rev.equalsIgnoreCase(s) ? "Palindrome" : "Not a Palindrome");
       }
}