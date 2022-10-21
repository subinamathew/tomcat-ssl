package api.servlet;

public class UserModel {
    public User getUser() {
        String name = "user";
        String id = "noId";
        return new User(id, name);
    }
}