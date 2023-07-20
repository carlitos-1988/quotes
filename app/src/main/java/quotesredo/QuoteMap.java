package quotesredo;

import java.util.HashMap;
import java.util.Random;

public class QuoteMap {
    private HashMap<Integer, Quote> quoteMap;

    public QuoteMap() {
        quoteMap = new HashMap<>();
    }

    public void addQuote(int index, String author, String quote) {
        Quote newQuote = new Quote(author, quote);
        quoteMap.put(index, newQuote);
    }

    public String getRandomQuote() {
        Random random = new Random();
        int randomIndex = random.nextInt(quoteMap.size());

        Quote randomQuote = quoteMap.get(randomIndex);
        if (randomQuote != null) {
            return randomQuote.toString();
        }
        return "No quote found for the random index.";
    }

    private class Quote {
        private String author;
        private String quote;

        public Quote(String author, String quote) {
            this.author = author;
            this.quote = quote;
        }

        @Override
        public String toString() {
            return quote + " - " + author;
        }
    }
}

