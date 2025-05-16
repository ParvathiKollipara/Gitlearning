class StrFirstCapital
{
      public static void main(String[] args)
      {
          String s = "hello all good morning";
          String res="";
          String str[] = s.split(" ");
         if(str.length >=1)
         {
          str[0] = str[0].toUpperCase();
          str[str.length-1] = str[str.length-1].toUpperCase();
         }
          StringBuilder sb = new StringBuilder();
         for(String t : str)
         {
            sb.append(t).append(" ");
          }
         System.out.println(sb.toString().trim());
     }
}
           