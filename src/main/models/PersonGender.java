package main.models;

public enum PersonGender {
    MALE("Male"),
    FEMALE("Female");

    public final String label;

    PersonGender(String label) {
        this.label = label;
    }
}
