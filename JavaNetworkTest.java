import org.junit.*;

public class JavaNetworkTest {

  JavaNetwork network = new JavaNetwork();

  @Test
  public void shoulAddANewUserToUsers() {
    Assert.assertEquals(0, network.users.size());
    network.createUser("Tim");
    Assert.assertEquals(1, network.users.size());
  }
}
