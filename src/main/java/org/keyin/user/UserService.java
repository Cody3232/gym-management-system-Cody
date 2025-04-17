// “I used the org.mindrot.jbcrypt library to safely hash and compare passwords. The UserDao class interacts with the database to retrieve user info, while BCrypt.checkpw() ensures that passwords are verified without ever storing them in plain text."

package org.keyin.user;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.SQLException;

public class UserService {
    private final UserDao userDao = new UserDao();

    public User loginForUser(String username, String password) throws SQLException {
        User user = userDao.getUserByUser(username);

        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            return user; 
        }

        return null;
    }
}
