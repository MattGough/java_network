import java.util.*;

public class User {

  public String name;
  ArrayList<String> posts = new ArrayList<>();
  ArrayList<String> usersSubscibedTo = new ArrayList<>();

  public User(String name) {
    this.name = name;
    this.posts = posts;
    this.usersSubscibedTo = usersSubscibedTo;
  }

  public String getName() {
    return name;
  }

  public void post(String message) {
    posts.add(message);
  }

  public void showMyTimeline() {
    for (int i = 0; i < posts.size(); i++) {
      System.out.println(posts.get(i) + " posted by " + name);
    }
  }

  public void subscribe(String name) {
    usersSubscibedTo.add(name);
  }

  public void showUsersSubscibedTo() {
    for (int i = 0; i < usersSubscibedTo.size(); i++) {
      System.out.println(usersSubscibedTo.get(i));
    }
  }
}
