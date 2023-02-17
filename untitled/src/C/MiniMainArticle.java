package C;

import java.util.ArrayList;

public class MiniMainArticle {
    public static void ExerciseC(){
        //Create 5 articles
        ArrayList<Article> listOfArticles = new ArrayList<>();
        Article article1 = new Article("Helle Helle", "BOB");
        Article article2 = new Article("Morten Münster", "Jytte vender tilbage");
        Article article3 = new Article("Astrid Lindgren", "Emil fra Lønneberg");
        Article article4 = new Article("Phillip Faber", "Den danske sang");
        Article article5 = new Article("Barack Obama", "Et forjættet land");

        //Add the 5 articles into an ArrayList
        listOfArticles.add(article1);
        listOfArticles.add(article2);
        listOfArticles.add(article3);
        listOfArticles.add(article4);
        listOfArticles.add(article5);

        System.out.println(listOfArticles);
    }

}
