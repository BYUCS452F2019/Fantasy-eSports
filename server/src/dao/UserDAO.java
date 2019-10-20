package dao;

import model.User;

/**
 * Methods to access the Users database table
 */
public class UserDAO {
    public UserDAO() {}

    /**
     * Attempts to add user to the database
     * @param user - the user to add
     * @return boolean - success of insert
     * @throws DataAccessException
     */
    public boolean insert(User user) throws DataAccessException {
        return false;
    }

    /**
     * Queries database for user by username
     * @param username - string
     * @return User object if exists
     * @throws DataAccessException
     */
    public User findByUsername(String username) throws DataAccessException {
        return new User();
    }
}
