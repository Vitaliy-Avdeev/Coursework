import java.util.Objects;

public record Personal(String firstName, String lastName, String surName) {

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.surName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Personal otherPersonal = (Personal) other;
        return !(!Objects.equals(otherPersonal, otherPersonal.firstName) || !lastName.equals(otherPersonal.lastName) || !surName.equals(otherPersonal.surName));
    }
}


