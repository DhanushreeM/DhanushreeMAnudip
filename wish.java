class Wish
{
 static
     {
      System.out.println("Static Block");
     }
Wish()
{
   System.out.println("Constructor");
}
public static void display()
{
   System.out.println("Method/Non-static/Instance");
} 
public static void main (String[] args)
{
System.out.println("static method");
new Wish();
Wish.display();
}
}
