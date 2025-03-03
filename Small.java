class Small
{
      public static void main(String[] args)
      { 
           char ch  = 'P';
           if(ch >= 'A' && ch <= 'Z')
               System.out.println((char)(ch+32)+  " is a  small letter");
           else if(ch >= 'a' && ch <= 'z')
               System.out.println((char)(ch-32)+   " is a Capital letter");
           else
                System.out.println(ch + "  Invalid");
       }
}
