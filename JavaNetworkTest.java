import org.junit.*;
import org.junit.contrib.java.lang.system.*;
import org.junit.contrib.java.lang.system.internal.*;

public class JavaNetworkTest {

  JavaNetwork network = new JavaNetwork();

  @Before public void initailize() {
    network.createUser("Spike");
    network.postMessage("Spike", "Hello world");
  }

  @Test
  public void shoulAddANewUserToUsers() {
    Assert.assertEquals(1, network.users.size());
    network.createUser("Tim");
    Assert.assertEquals(2, network.users.size());
  }

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void shouldPostMessageForUser() {
    network.getMessages("Spike");
    Assert.assertEquals("Hello world\n", systemOutRule.getLog());
  }

  @Test
  public void selectUsersPosts() {
    network.createUser("Nikesh");
    network.postMessage("Nikesh", "Goodbye cruel world");
    network.getMessages("Nikesh");
    Assert.assertEquals("Goodbye cruel world\n", systemOutRule.getLog());
  }

  @Test
  public void subscribeUsertoAnotherUser() {
    network.createUser("Nikesh");
    network.createUser("Leo");
    network.subscribeUser("Leo", "Spike");
    network.subscribeUser("Leo", "Nikesh");
    network.getSubscribedUsers("Leo");
    Assert.assertEquals("Spike\nNikesh\n", systemOutRule.getLog());
  }
}
