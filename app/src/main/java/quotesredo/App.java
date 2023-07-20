/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotesredo;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        FileReader myFile = new FileReader("./app/src/main/resources/recentquotes.json");

        //Array Route
        Quote[] quotes = gson.fromJson(myFile,Quote[].class);
//        System.out.println(quotes[0].getAuthor() + " : " + quotes[0].getText());
//        System.out.println(quotes.length);

        Random rand = new Random();
        int upperLimit = quotes.length;
        int randomInt = rand.nextInt(upperLimit);

        System.out.println("quote of the day is : " + quotes[randomInt].getText() + "By: "+ quotes[randomInt].getAuthor());



        //Using an ArrayList (Type Token)

//        TypeToken<ArrayList<Quote>> collectionType = new TypeToken<ArrayList<Quote>>(){};
//        ArrayList<Quote> quoteList = gson.fromJson(myFile, collectionType);
//
//        System.out.println(quoteList.get(0).getAuthor() + " : "+ quoteList.get(0).getText());




        //Below is from 20 Jul2023 lab example



        //step 1 create url and an HTTP url connection
        URL starUrl = new URL("https://www.swapi.tech/api/people/1");
        HttpURLConnection starConnections = (HttpURLConnection) starUrl.openConnection();

        //Step 2: set our headers, check response code, use try/catch to handle bad urls + close connection

        try {
            starConnections.setRequestMethod("GET");
            int starStatus = starConnections.getResponseCode();
            System.out.println(starStatus);

            //Step 3: if code is usable get data as a stream
            if (starStatus == 200){
                // step 4: get data as a stream
                InputStreamReader starStreamReader = new InputStreamReader(starConnections.getInputStream());

                //Step 5: use BuffedReader to read the input(can also use starReade.read()
                try(BufferedReader starBufferedReader = new BufferedReader(starStreamReader)){
                    String line = starBufferedReader.readLine();
                    System.out.println(line);


                    //Step 6 part 1: create class(es) to convert formatted JSON Java Objects (come back here when you are done )
                    //Step 6 par 2: use GSON to create your Java objects
                    Gson gson2 = new Gson();
                    StarwarsPerson starwarsPerson = gson.fromJson(line, StarwarsPerson.class);
                    System.out.println(starwarsPerson.toString());
                }
            }

        }catch (MalformedURLException mue){
            System.out.println("bad URL");
            mue.printStackTrace();
        } catch (IOException ioe){
            System.out.println("problem with API");
            ioe.printStackTrace();
        } finally {
            starConnections.disconnect();
        }


    }
}

