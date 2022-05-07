package sg.edu.np.mad.practical3;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;


    public User(String userName, String userDescription, int userId, boolean userFollowed){
        name = userName;
        description = userDescription;
        id = userId;
        followed = userFollowed;
    }

}
