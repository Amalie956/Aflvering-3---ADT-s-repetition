package C;

public class Article {
    //Article with two attributes: author and title
    private String author;
    private String title;

    //Constructor
    Article(String author, String tile) {
        this.author = author;
        this.title = tile;
    }

    //Print the five articles by overriding the .toString() method
    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", tile='" + title + '\'' +
                '}';
    }
}
