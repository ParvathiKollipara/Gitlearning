class StrDigit
{
       public static void main(String[] args)
       {
             String s = "A1 B2 C3 D4 & 321";
             String digit = "";
             for(int x=0; x<=s.length()-1; x++)
             {
                 char letter = s.charAt(x);
                 if(letter>='0' && letter<='9')
                 {
                     digit = digit + letter;
                  }
             }
            System.out.println("Digits is " +digit);
            String rev="";
            for(int i=digit.length()-1; i>=0; i--)
            {
                  rev = rev+digit.charAt(i);
             }
           System.out.println("Reverse is " +rev);
          System.out.println(digit.equals(rev) ? "Palindrome" : "Not a Palindrome");
    }
}
 