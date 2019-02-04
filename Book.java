/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Ernesto Cuellar)
 * @version (2.4.2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * @return author 
     */
    public String getAuthor()
    {
        return author;
    }   
    
    public String getTitle()
    {
     return title;   
    }
    
    /** ex. 2.84
     *  method to print author 
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
}





