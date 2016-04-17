import java.util.*;

public class JavaNetwork {

  ArrayList<User> users = new ArrayList<>();

  public JavaNetwork() {
    this.users = users;
  }

  public void createUser(String name) {
    User user = new User(name);
    users.add(user);
  }
}
