## Java Network

This is a Makers Academy challenge to build a basic command line social network in Java, as described [here](https://gist.github.com/spike01/39e1ae40e0669fc68a67ec30efdb1ce7).

### Features

  * User creating - a new user called Spike can be created
  * Posting - Spike can publish messages to a personal timeline
  * Reading - Spike can view Nikesh’s timeline
  * Following - Leo can subscribe to Spike and Nikesh's timelines, and view an aggregated list of all subscriptions

### User Stories

```
As Spike,
So I can use the social network,
I would like to create a user.

As Spike,
So that I can share my thoughts,
I would like to be able to post messages.

As Spike,
So that I can read my friends thoughts,
I would like to be able to see Nikesh's posts.

As Leo,
So that I can follow what my friends are saying,
I would like to be able to subscribe to Nikesh and Spike.

As Leo,
So that I read my friends posts,
I would like to see a timeline of their posts.

As Leo,
So that I know who posted what,
I would like to see who posted each message.
```
### Implementation

Because I started working on the train, I couldn't download intelliJ, so I started manually compiling and running tests through the command line. This seemed to work alright so I continued. To run the tests therefore requires the location of the `.jar` files for JUnit and System Rules be added to the CLASSPATH environment variable before compiling. The files can be complied with the command `javac <files>` and the tests can be run with the command `java TestRunner`.

### How to Use

To use in a Java REPL, add the User and JavaNetwork classes, then:
```java
> JavaNetwork network = new JavaNetwork();          // create a new network
> network.createUser("Spike");                      // create a new user
> network.postMessage("Spike", "Hello world!");     // post a message
> network.postMessage("Hello universe!");
> network.getMessages("Spike");                     // get a user's timeline
"Hello world! posted by Spike"
"Hello universe! posted by Spike"
// once other users have been created and have posted messages
> network.subscribeUser("Leo", "Spike");           // subscribe the first user to the second
> network.subscribeUser("Leo", "Nikesh");
> network.getSubscribedUsers("Leo");
"Spike"
"Nikesh"
> network.viewTimeline("Leo");                    // view the combined messages of the users subscribed to
"Hello world! posted by Spike"
"Hello universe! posted by Spike"
"Goodbye world! posted by Nikesh"
```
### Next Steps & Improvements

  * Extract functionality to separate classes, i.e. Timeline, Message & Print classes to separate concerns and to remove dependency on JavaNetwork class.
  * Use Mockito to ensure isolated tests.
  * Adapt the program to work on the command line through commands.
  * Download intelliJ IDEA!

### Reflections & Learnings

  * It was my first experience with Java and it showed I can use the skills I learnt to pick up programming languages quickly.
  * Kind of fun doing it 'manually' without IDE, although I can certainly see the limitations!
  * Next time I should spend more time creating a domain model and be stricter with extracting grouped behavior to a separate class.

#### Additional requirements
  * [JUnit](http://junit.org/junit4/)
  * [System Rules](http://stefanbirkner.github.io/system-rules/index.html)

  Created by [Matt Gough](https://github.com/MattGough)
