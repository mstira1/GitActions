import org.junit.Test;
import user.User;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testCreateUser() {
        User user = new User("Staffan","password123");
    }


        @Test
        public void testGetUserName () {
            User user = new User("Staffan", "password123");
            String expected = "Staffan";
            String actual = user.getUserName();
            assertEquals(expected, actual);
        }

        @Test
        public void testGetPassword() {
            User user = new User(  "Staffan", "password123");
            String expected = "password123";
            String actual = user.getPassword();
            assertEquals(expected, actual);

        }
    @Test
    public void testSetUserName(){
        User user = new User("Staffan","password123");
        String expected = "Henry1";
        user.setUserName("Henry1");
        String actual = user.getUserName();
        assertEquals(expected,actual);
    }
}
