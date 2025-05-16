class StrConcat
{
       public static void main(String[] args)
       {
              String s1 = "Hello All";
              String s2 = " Good Morning";
              s1= s1.concat(" to one and everyone Guys");
              System.out.println(s1);
              System.out.println(s1 + s2);
              System.out.println("hello" + 12 + true + 16.48 + 'p' + false + 18.9999);
              StringBuffer sb = new StringBuffer("Ammu");
              System.out.println(sb.append());

      }
}