/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotesredo;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void checkQuote() throws FileNotFoundException {

        Gson gson = new Gson();
        FileReader myFile = new FileReader("./app/src/test/resources/recentquotes.json");



        Quote[] quotes = gson.fromJson(myFile,Quote[].class);


        String myQuote = "quote of the day is : " + quotes[0].getText() + "By: "+ quotes[0].getAuthor();

        String expectedResult = "quote of the day is : I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.By: Marilyn Monroe";

        assertEquals(myQuote.toString(), expectedResult.toString());
    }
}
