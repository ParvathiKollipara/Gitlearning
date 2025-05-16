class StrVowelMax
{
       public static void main(String[] args)
       {
           String s = "Hello All Good Morning";
           s = s.toLowerCase();
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            int count[] = new int[5];
           for(int x=0; x<=s.length()-1; x++)
           {
                char letter = s.charAt(x);
                for(int y=0; y<=vowels.length-1; y++)
                {
                     if(letter==vowels[y])
                     {
                          count[y]++;
                      }
                 }
            }
          for(int i=0; i<=vowels.length-1; i++)
          {
               System.out.print(vowels[i]+ " : "  +count[i]+  " , ");
          }
          int max=0;
          for(int i=0; i<=count.length-1; i++)
          {
                if(count[i] > count[max])
                {
                    max=i;
                 }
          }
      System.out.println("\nMaximum repeated vowel: " + vowels[max] + " with count " + count[max]);
    }
}
