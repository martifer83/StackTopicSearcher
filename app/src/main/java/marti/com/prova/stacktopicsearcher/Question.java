package marti.com.prova.stacktopicsearcher;

/**
 * Created by mferrando on 02/02/17.
 */
// This is used to map the JSON keys to the object by GSON
public class Question {

    String title;
    String link;

    @Override
    public String toString() {
        return(title);
    }
}