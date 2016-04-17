import java.util.*;

public class User {

  public String name;
  ArrayList<String> posts = new ArrayList<>();

  public User(String name) {
    this.name = name;
    this.posts = posts;
  }

  public String getName() {
    return name;
  }

  public void post(String message) {
    posts.add(message);
  }
}
