import org.junit.*;
import org.junit.contrib.java.lang.system.*;
import org.junit.contrib.java.lang.system.internal.*;

public class UserTest {

  String name1 = "Spike",
         message1 = "Hello world!";

  User spike = new User(name1);

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
}
