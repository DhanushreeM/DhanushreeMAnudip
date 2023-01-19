public class Book
{
     String name;
     String author;
     String isbn;

     //setters and getters

     public void setName(String name)
      {
           this.name=name;
      }
     public String getName()
      {
        return name;
      }

    public void setAuthor(String author)
     {
           this.author=author;
      }
    public  String getAuthor()
     {
        return author;
     }
     
   public void setIsbn(String isbn)
     {
           this.isbn=isbn;
     }
   public String getIsbn()
     {
       return isbn;
     }

      public static void main(String[] args)
     {
           Book b=new Book();
           b.setName("Java");
           b.setAuthor("James");
           b.setIsbn("123-456");
           System.out.println("BookName:"+b.getName());
           System.out.println("Author:"+b.getAuthor());
           System.out.println("Isbn:"+b.getIsbn());
     }

}
