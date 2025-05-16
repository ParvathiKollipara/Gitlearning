class StrDigitExtraction
{
      public static void main(String[] args)
       {
            String s = "abc123xyz456";
            int digit = 0;
            int sum =0;
            for(int x=0; x<=s.length()-1; x++)
            {
                 char letter = s.charAt(x);
                 if(letter>= '0' && letter <='9')
                 {
                     digit = letter - '0';
                     sum = sum+digit;
                  }
            }
          System.out.println(sum);
       }
}