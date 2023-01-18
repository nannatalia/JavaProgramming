package day47_Polymoprhism;

public class EncapsulationReview {

    private String bookName;
    private final String publishDate;

    public EncapsulationReview(String bookName, String publishDate) {
        setBookName(bookName);
        this.publishDate = publishDate;
    }

    public String getBookName() {
        if(bookName == null){
            return "";
        }
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName == null || bookName.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookName = bookName;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
