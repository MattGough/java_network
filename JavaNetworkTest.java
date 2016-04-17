import org.junit.*;
import org.junit.contrib.java.lang.system.*;
import org.junit.contrib.java.lang.system.internal.*;

public class JavaNetworkTest {

  JavaNetwork network = new JavaNetwork();

  @Before public void initailize() {
    network.createUser("spike");
    network.postMessage("spike", "hello world");
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
    network.getMessages("spike");
    Assert.assertEquals("hello world\n", systemOutRule.getLog());
  }

  @Test
  public void selectUsersPosts() {
    network.createUser("nikesh");
    network.postMessage("nikesh", "goodbye cruel world");
    network.getMessages("nikesh");
    Assert.assertEquals("goodbye cruel world\n", systemOutRule.getLog());
  }
}
