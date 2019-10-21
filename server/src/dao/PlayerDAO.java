package dao;

import model.Player;

public class PlayerDAO {
    public PlayerDAO() {}

    /**
     * Adds player to the database
     * @param player - the player to tadd
     * @return boolean - success of insert
     * @throws DataAccessException
     */
    public boolean insert(Player player) throws DataAccessException {
        return false;
    }

    /**
     * Queries the database for player by id
     * @param id - id of the player to find
     * @return Player if exists
     * @throws DataAccessException
     */
    public Player findById(String id) throws DataAccessException {
        return new Player();
    }

    /**
     * Updates the player in the database
     * @param player - player with updated info
     * @return Player - updated player
     * @throws DataAccessException
     */
    public Player update(Player player) throws DataAccessException {
        return new Player();
    }

    /**
     * Deletes player from database if exists
     * @param id - id of the player to delete
     * @return Player - player that was deleted
     * @throws DataAccessException
     */
    public Player delete(String id) throws DataAccessException {
        return new Player();
    }
}
