package Model;

public class Vcard {
    private final int phoneNumber;
    private final String name, email;

    public Vcard(String name, int phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "[" + this.name + ", " + this.phoneNumber + ", " + this.email + "]";
    }
}
