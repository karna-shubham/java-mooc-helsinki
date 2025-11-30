/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
public class Book {
    private String title;
    private int page;
    private int year;
    
    public Book(String initialTitle, int initialPage, int initialYear){
        this.title = initialTitle;
        this.page = initialPage;
        this.year = initialYear;
    }
    
    public String everything(){
        return (this.title + ", " + this.page + " pages, " +  this.year);
    }
    
    public String names(){
        return(this.title);
    }
    
    
    
}
