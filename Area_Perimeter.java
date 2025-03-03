class Area_Perimeter
{
  public static void main(String[] args)
  {
   int l=5, b=4;
   int area_of_a_rectangle=l*b;
   int perimeter_of_a_rectangle=2*(l+b);
   if(area_of_a_rectangle > perimeter_of_a_rectangle)
   {
    System.out.println("Area of a rectangle is greater");
   }
   else{
    System.out.println("Area of a rectangle is smaller");
   }
 }
}