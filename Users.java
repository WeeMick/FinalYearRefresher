package main;

public class User{
  private String username;

  User()  {
    username = "unknown";
  }

  User(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }
}
