class EmployeeBonus
{
public static void main(String[] args)
{
   int pay=15000;
   int Bonus;
   int year=8;

   if(year<4)
     {
       Bonus=pay*5/100;
     }
     else if(year>5 && year<9)
      {
       Bonus=pay*10/100;
      }
     else
     {
       Bonus=pay*15/100;
    }
    System.out.println(year+"Years EmployeeBonus is="+Bonus);
  }
}
    