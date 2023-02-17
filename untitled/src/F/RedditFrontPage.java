package F;

import E.*;

import java.util.ArrayList;

public class RedditFrontPage {
    private static ArrayList<RedditPost> arrayOfRedditPost;

    public static void ExerciseF() {
        arrayOfRedditPost = new ArrayList<>();
        RedditPost redditPost1 = new RedditPost("u/HOHOHOSPLEJS", "En fed serie");
        RedditPost redditPost2 = new RedditPost("u/isnisse", "Fast eller variable rente?");
        RedditPost redditPost3 = new RedditPost("u/User_name_checks_ou7", "Ikke lønseddler denne gang");
        RedditPost redditPost4 = new RedditPost("u/Far-Mango8592", "Hvorfor er Spotify så dårligt?");

        arrayOfRedditPost.add(redditPost1);
        arrayOfRedditPost.add(redditPost2);
        arrayOfRedditPost.add(redditPost3);
        arrayOfRedditPost.add(redditPost4);

        System.out.println("Den gamle liste :" + arrayOfRedditPost);

        deleteRedditPost(3);

        System.out.println("Den nye liste :" + arrayOfRedditPost);

    }

    public static void deleteRedditPost(int removeIndex) {
        System.out.println("Det slettede element :" + arrayOfRedditPost.remove(removeIndex));
    }
}
