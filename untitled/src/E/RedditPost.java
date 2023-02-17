package E;

import java.time.LocalDate;

public class RedditPost {
    private LocalDate dateOfPost;
    private String author;
    private int voteBalance;
    private String title;

    public RedditPost(String author, String title) {
        this.dateOfPost = LocalDate.now();
        this.author = author;
        this.voteBalance = 1;
        this.title = title;
    }

    //Getter
    public LocalDate getDateOfPost() {
        return dateOfPost;
    }

    public String getAuthor() {
        return author;
    }

    public int getVoteBalance() {
        return voteBalance;
    }

    public String getTitle() {
        return title;
    }

    //Setter
    public void setDateOfPost(LocalDate newDateOfPost) {
        this.dateOfPost = newDateOfPost;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setVoteBalance(int newVoteBalance) {
        this.voteBalance = newVoteBalance;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "dateOfPost=" + dateOfPost +
                ", author='" + author + '\'' +
                ", voteBalance=" + voteBalance +
                ", title='" + title + '\'' +
                '}';
    }
}
