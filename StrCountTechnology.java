class StrCountTechnology
{
     public static void main(String[] args)
     {
          String s = "Technology";
          int count=0;
          for(int x=0; x<=s.length()-1; x++)
          {
              char letter = s.charAt(x);
              count++;
           }
          System.out.println(count);
      }
}              