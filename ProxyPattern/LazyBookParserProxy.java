package ProxyPattern;

public class LazyBookParserProxy implements IBookParser {
    private BookParser BookParser = null;
    private String book = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (this.BookParser == null)
            this.BookParser = new BookParser(this.book);
        return this.BookParser.getNumberOfPages();
    }
}
