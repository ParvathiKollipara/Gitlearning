class Typed
{
      public static void main(String[] args)
      {
          Integer i = 10;
          Short s = 67;
          Byte b = 5;
          ArrayList<Number>  al = new ArrayList<>();
          al.add(i);
          al.add(10.5);
          al.add(b);
          al.add(s);
          System.out.println(al);
      }
}