package personal.model;

public class NewUserMapper extends UserMapper{
    public String map(User user, String delimiter) {
        String text = String.join(delimiter, user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return text;
    }


    public User map(String line, String delimiter) {
        String[] lines = line.split(delimiter);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
