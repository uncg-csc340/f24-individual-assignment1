public class User {

    private String name;
    private String bio;

    public User(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    @Override
    public String toString() {
        return name + '\n' +
                "---------------------------------------------------------\n"
                + bio + '\n';
    }
}
