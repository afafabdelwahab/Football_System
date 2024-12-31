/**
 * Abstract class representing a generic person.
 * Provides attributes like ID, name, and age.
 * Enforces implementation of the {@code getDetails()} method for specific person types.
 */

abstract class Person {
    private int id;
    private String name;
    private int age;

    /**
     * Constructs a Person with the specified ID, name, and age.
     *
     * @param id   The unique ID of the person.
     * @param name The name of the person.
     * @param age  The age of the person (must be between 15 and 50).
     */

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the ID of the person.
     *
     * @return The person's ID.
     */

    public int getId() {
        return id;
    }

    /**
     * Returns the name of the person.
     *
     * @return The person's name.
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the age of the person.
     *
     * @return The person's age.
     */

    public int getAge() {
        return age;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the person.
     * @param age The new age of the person.
     */

    public void setAge(int age) {
                this.age = age;
    }

    /**
     * Abstract method to get specific details of a person.
     * Must be implemented by subclasses.
     *
     * @return A string containing specific details of the person.
     */

    public abstract String getDetails();

    /**
     * Returns a string representation of the person's details.
     *
     * @return A string containing the person's details.
     */

    public String displayDetails() {
        return "ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge();
    }
}

