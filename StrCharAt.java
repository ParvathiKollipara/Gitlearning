class StrCharAt
{
      public static void main(String[] args)
      {
         StrCharAt s = new StrCharAt();
          s.calCharAt();
         s.calConcat();
         s.calWithoutLength();
         s.calNoCharNoOfWords();

      }
           void calCharAt()
           {
               String s = " Hello";
               for(int x=0; x<=s.length()-1; x++)
              {
                   char letter = s.charAt(x);
                   System.out.println(letter);
               }
           }
           void calConcat()
           {
               String s1 = "Hello all";
               String s2 = new String(" to everyone");
               s1 = s1.concat(s2);
              System.out.println(s1);
              System.out.println("Hello" + true + 12 + 'g' + 12.56);
         }
        void calWithoutLength()
        {
             String s = "Good Morning";
             int count=0;
             for(int x=0; x<=s.length()-1; x++)
             {
                  count++;
             }
          System.out.println(count);
      }
    void calNoCharNoOfWords()
    {
        String s = "Apple is a fruit";
        int c_count =0;
        String[] words = s.trim().split("\\s+");
        int wordcount = words.length;
        System.out.println(wordcount);
        for(int x=0; x<=s.length()-1; x++)
        {
             char letter = s.charAt(x);
             c_count++;
        }
      System.out.println(c_count);
   }
}