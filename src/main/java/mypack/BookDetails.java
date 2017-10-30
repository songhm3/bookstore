package mypack;
public class BookDetails implements Comparable {
    private String bookId = null;
    private String title = null;
    private String name = null;
    private float price = 0.0f;
    private int year = 0;
    private String description = null;
    private int saleAmount;

    public BookDetails(String bookId, String name, String title, float price,
            int year, String description, int saleAmount) {
        this.bookId = bookId;
        this.title = title;
        this.name = name;
        this.year = year;
        this.description = description;
        this.saleAmount = saleAmount;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

    public int compareTo(Object o) {
        BookDetails n = (BookDetails)o;
        int lastCmp = title.compareTo(n.title);
        return lastCmp;
    }

}