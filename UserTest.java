import org.junit.*;

public class UserTest {

  String name1 = "Spike";
  User spike = new User(name1);

  @Test
  public void testGetName() {
    Assert.assertEquals(name1, spike.getName());
  }
}
