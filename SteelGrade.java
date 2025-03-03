class SteelGrade
{
        public static void main(String[ ] args)
        {
               double hardness = 80.0;
               double carbonContent = 35.3;
               int tensilestrength = 40;
               boolean condition1 = hardness > 50;
               boolean condition2 = carbonContent  < 0.7;
               boolean condition3 = tensilestrength > 5600;
               int grade;
               if(condition1 && condition2 && condition3)
                    System.out.println(grade = 10);
              else if(condition1 && condition2)
                     System.out.println(grade = 9);
              else if(condition2 && condition3)
                     System.out.println(grade = 8);
             else if(condition1 && condition3)
                     System.out.println(grade = 7);
             else if(condition1 || condition2 || condition3)
                     System.out.println(grade = 6);
            else
                    System.out.println(grade = 5);
      System.out.println("Grade of Steel: " +grade);
      }
}
         