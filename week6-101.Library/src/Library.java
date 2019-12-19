import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BookAdd;

    public Library(){
        this.BookAdd = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        BookAdd.add(newBook);
    }

    public void printBooks(){
        for (Book printBook : BookAdd) {
            System.out.println(printBook);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> TitleBook =  new ArrayList<Book>();
        for (Book SearchTitle: BookAdd) {
            if(StringUtils.included(SearchTitle.title(), title)){
                TitleBook.add(SearchTitle);
            }
            //System.out.println(printBook);
        }
        return TitleBook;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> publisherBook =  new ArrayList<Book>();
        for (Book Searchpub: BookAdd) {
            if(StringUtils.included(Searchpub.publisher(), publisher)){
                publisherBook.add(Searchpub);
            }
            //System.out.println(printBook);
        }
        return publisherBook;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> yearBook =  new ArrayList<Book>();
        for (Book Searchyear: BookAdd) {
            if(Searchyear.year() == year){
                yearBook.add(Searchyear);
            }
            //System.out.println(printBook);
        }
        return yearBook;
    }
}
