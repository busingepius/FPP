package assignment11;

import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != getClass()) return false;
        Key key = (Key) object;
        return Objects.equals(firstName, key.getFirstName()) && Objects.equals(lastName, key.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
