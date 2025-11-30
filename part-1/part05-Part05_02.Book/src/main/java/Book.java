public class Book{
    
    //instance variables
    private String author;
    private String name;
    private int page;
    
    //constructor
    public Book (String initialAuthor, String initialName, int initialPage){
        this.author = initialAuthor;
        this.name = initialName;
        this.page = initialPage;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.page;
    }
    
    public String toString(){
        return this.author + ", " + this.name + ", " + this.page + " pages";
    }
}
