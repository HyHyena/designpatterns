package ProxyPattern;

public class BookParser implements IBookParser{
    private String book = null;

    public BookParser(String book) {
        this.book = book;
        // expensive parsing
    }

    public int getNumberOfPages(){
        //return number of pages
        return 0;
    }
}
