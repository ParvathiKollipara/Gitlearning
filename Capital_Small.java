class Capital_Small
{
         public static void main(String[] args)
         {
              char ch = ';';
              if(ch >= 'A' && ch <= 'Z')
                  System.out.println("Capital Letter");
             else if(ch >= 'a' && ch<= 'z')
                  System.out.println("Small Letter");
             else if(ch >= '0' && ch <= '9')
                  System.out.println("Digit");
             else if(ch == ' ')
                   System.out.println("Space");
             else
                   System.out.println("Symbol");
        }
}


        

