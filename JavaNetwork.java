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

  public void postMessage(String name, String message) {
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).name == name) {
        users.get(i).post(message);
      }
    }
  }

  public void getMessages(String name) {
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).name == name) {
        users.get(i).showMyTimeline();
      }
    }
  }
}
