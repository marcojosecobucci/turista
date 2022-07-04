package user;

public class User {
    private String id;
    private static int idCounter = 0;
    private userType type;
    private String name;
    private String surname;
    private String email;
    private String address;

    public User(userType type, String name, String surname, String email, String address) {
        id = name + idCounter++;
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }
}
