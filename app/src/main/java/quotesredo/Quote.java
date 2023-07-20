package quotesredo;

import java.util.Arrays;

public class Quote {

    String[] tags;
    String author;
    String likes;
    String text;

    public Quote() {
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

    @Override
    public String toString() {
        return "Quote{" +
                "tags=" + Arrays.toString(tags) +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
