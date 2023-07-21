# quotes

## Feature Tasks

Start by refactoring anything that you don’t like about your solution from yesterday.
When running the application, instead of FIRST reading in the quotes file, make a request to an API to get a random quote.
please do not delete your existing code, look at the very next feature task, you will still need that code
Some examples of APIs you could choose to use:
FavQs: sign up for a free API key (takes 2 minutes) to get random quotes
Formismatic: no API key required
Star Wars Quotes API
Ron Swanson Quotes
Rather than a Quote of the Day, please use an API that allows you to show a random quote.
We still have the quotes file and it is still useful! Ensure that if your app has errors in connecting to the Internet, you instead display a random quote from your file.
Also, when we grab a random quote from the Internet, we need to add it to our file of quotes, for use if the app goes offline. Essentialy, when a quote comes back from a request, it’s also cached in the quotes file.

### Implementation 

API call made to Formismatic Quote class updated to take in Json data and create class able to write once to output file but no success with writing multiple times. Need to view GSON documentation for implementation details of this issue. Get quote from file is not Static Class method, there was no need to make it instance method as it does not need to be saved to memory, since the quote from the static method does not need to be saved in the file no need to rewrite it back to the file. 
