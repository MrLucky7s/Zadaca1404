package osc.ada;

public class News {

    private String authorName;
    private String authorSurname;
    private String newsTitle;
    private String category;

    public News(String authorName, String authorSurname, String newsTitle, String category) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.newsTitle = newsTitle;
        this.category = category;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
