class Rectangle_Circle{
     public static void main(String[] args)
     {
     int l=55, r=20;
     double b=60.8, pi=3.14;
     int area_of_a_rectangle=(int)(l*b);
     int perimeter_of_a_rectangle=(int)(2*(l+b));
     int area_of_a_circle=(int)(pi*r*r);
     int circumference_of_a_circle=(int)(2*pi*r);
     System.out.println("Area of a Rectangle is: " + area_of_a_rectangle);
     System.out.println("Perimeter of a Rectangle is: " + perimeter_of_a_rectangle);
     System.out.println("Area of a circle is: " + area_of_a_circle);
     System.out.println("Circumference of a circle is: " + circumference_of_a_circle);
     }
}