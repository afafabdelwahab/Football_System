/**
 * Interface for managing entities like players, teams, and leagues.
 * Provides common operations: add, update, delete, and display.
 *
 * @param <T> The type of object to be managed.
 */
public interface Management<T> {
    /**
     * Adds an object to the system.
     *
     * @param obj The object to add.
     */
    void add(T obj);
    /**
     * Updates an object in the system.
     *
     * @param obj The object with updated data.
     */
    void update(T obj);
    /**
     * Deletes an object from the system by ID.
     *
     * @param id The ID of the object to delete.
     */
    void delete(int id);
    /**
     * Displays all objects managed by the system.
     */
    void displayAll();

}

