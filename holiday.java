public class Holiday
{
    String name;
    int day;
    String month;

    public Holiday()
    {
       name="Independence Day";
       day=4;
       month="July";
    }  

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day= day;
        this.month= month;   
    }

    public void display()
    {
       System.out.println("Name:"+name+" Day:"+day+" Month:"+month);
    }
    public static void main(String[] args)
     {
         System.out.println("Independence Day,4,July");
         Holiday h= new Holiday();
     }
}