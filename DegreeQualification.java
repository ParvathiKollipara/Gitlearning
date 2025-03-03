class DegreeQualification
{
       public static void main(String[ ] args)
       {
            double marksA = 35.6;
            double marksB = 56.8;
            {
               if(marksA >= 55 && marksB >= 45)
                   System.out.println("Student has Passed");
               else if(marksA < 55 && marksA >= 45 && marksB >= 55)
                   System.out.println("Student has PASSED.");
               else if (marksB < 45 && marksA >= 65) {
                     System.out.println("Student is allowed to REAPPEAR in B.");
              else 
                       System.out.println("Student has FAILED.);
          }
   }
}

            
 