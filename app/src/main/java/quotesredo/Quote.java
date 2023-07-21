package quotesredo;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;

public class Quote {

    String[] tags;
    String author;
    String likes;
    String text;

    String quoteText;
    String quoteAuthor;

    String senderName;

    String quoteLink;


    public Quote() {
    }

    public Quote(String quoteText, String quoteAuthor, String senderName, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.quoteLink = quoteLink;
    }

    public Quote(String author, String likes, String text) {
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void generateLocalQuote() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader myFile = new FileReader("./app/src/main/resources/recentquotes.json");

        //Array Route
        Quote[] quotes = gson.fromJson(myFile,Quote[].class);
//        System.out.println(quotes[0].getAuthor() + " : " + quotes[0].getText());
//        System.out.println(quotes.length);

        Random rand = new Random();
        int upperLimit = quotes.length;
        int randomInt = rand.nextInt(upperLimit);
//        System.out.println("UpperLimit =" + upperLimit + "RandomInt = " + randomInt );
        String myReturn = "Quote of the day is : " + quotes[randomInt].getText() + " By: "+ quotes[randomInt].getAuthor();
        System.out.println(myReturn);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "tags=" + Arrays.toString(tags) +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


    public String toStringAPI() {
        return "Quote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }
}
