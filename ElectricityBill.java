class ElectricityBill
{
      public static void main(String[] args)
       {
        int U=20;
        int bill;
         
          if(U <100)
          {
              bill=10;
          }
         else if(U>100 && U<200)
           {
               U=U-100;
               bill=10+(15*U);
           }
        else if(U>200 && U<300)
           {
               U=U-200;
               bill=10+(15*100)+(20*U);
           }
        else
             {
               U=U-300;
               bill=10+(15*100)+(20*200)+(25*U);
             }
         System.out.println(U+"Electricity bill is="+bill);
      
    }
}    