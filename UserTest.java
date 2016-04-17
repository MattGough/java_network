import org.junit.*;
import org.junit.contrib.java.lang.system.*;
import org.junit.contrib.java.lang.system.internal.*;

public class UserTest {

  String name1 = "Spike",
         name2 = "Nikesh",
         message1 = "Hello world!",
         message2 = "Goodbye cruel world!",
         returnMessage = "Hello world!\nGoodbye cruel world!\n";

  User spike = new User(name1),
       nikesh = new User(name2);

  @Test
  public void testGetName() {
    Assert.assertEquals(name1, spike.getName());
  }

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void postToTimeline() {
    spike.post(message1);
    Assert.assertEquals(1, spike.posts.size());
  }

  @Test
  public void viewPostedMessage() {
    spike.post(message1);
    spike.showMyTimeline();
    Assert.assertEquals("Hello world!\n", systemOutRule.getLog());
  }

  @Test
  public void viewMultiplePosts() {
    spike.post(message1);
    spike.post(message2);
    spike.showMyTimeline();
    Assert.assertEquals(returnMessage, systemOutRule.getLog());
  }

  @Test
  public void addSubscribedUsertoList() {
    spike.subscribe("Nikesh");
    Assert.assertEquals(1, spike.usersSubscibedTo.size());
  }

  @Test
  public void viewSubsribedList() {
    spike.subscribe("Nikesh");
    spike.subscribe("Leo");
    spike.showUsersSubscibedTo();
    Assert.assertEquals("Nikesh\nLeo\n", systemOutRule.getLog());
  }
}
