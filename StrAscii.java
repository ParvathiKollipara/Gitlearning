class StrAscii
{
     public static void main(String[] args)
     {
          String s = "Hello";
          int sum = 0;
          for(int x=0; x<=s.length()-1; x++)
          {
              char letter = s.charAt(x);
              int ascii = (int)(letter);
              System.out.println("Character: " +letter+ " | ASCII : " +ascii);
              sum = sum+ascii;
           }
              if(sum%4 == 0 && sum %5 ==0)
              {
                  System.out.println(sum);
              }
              else{
                 System.out.println("NA");
              }
        
      }
}