import java.util.*;

public class CalorieTrackerApp {
    private List<User> users;

    public Boolean addUser(User user) {
        for(User i: users) {
            if(i.getEmail() == user.getEmail()){
                System.out.println("An account with this email already exists.");
                return false;
            }
            else if(i.getUserName() == user.getUserName()) {
                System.out.println("An account with this username already exists.");
                return false;
            }
        }
        return true;
    }

    public void removeUser(User user) {
        if(users.contains(user)) {
            users.remove(user);
        }
    }

    public User getUser(String username) {
        for(User user: users) {
            if(user.getUserName() == username) {
                return user;
            }
        }
        return null;
    }


//    public boolean logIn() {}

    public void logOut() {}
}
