public class Movie
{
    String title;
    String studio;
    String rating;
    
       public Movie(String title, String studio, String rating )
       {
            this.title=title;
            this.studio=studio;
            this.rating=rating;
       }
       public void display()
       {
            System.out.println("Title:"+title+" Studio:"+studio+" Rating:"+rating);
       }
       public static void main(String args[])
       {
            Movie m= new Movie("Casino Royale","Eon Productions","PG-13");
            m.display();
       }
}