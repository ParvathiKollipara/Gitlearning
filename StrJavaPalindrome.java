class StrJavaPalindrome
{
     public static void main(String[] args)
     {
           String s ="Java";
           String rev = "";
           for(int x=s.length()-1; x>0; x--)
           {
               char letter = s.charAt(x);
            }
          System.out.println( rev==s ? "Palindrome" : "Not a Palindrome");
    }
}