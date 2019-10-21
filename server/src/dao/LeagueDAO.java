package dao;

import model.League;

/**
 * Methods to access the Leagues database table
 */
public class LeagueDAO {
    public LeagueDAO() {}

    /**
     * Attempts to add league to the database
     * @param league - the league to add
     * @return boolean - success of insert
     * @throws DataAccessException
     */
    public boolean insert(League league) throws DataAccessException {
        return false;
    }

    /**
     * Queries database for league by id
     * @param id
     * @return
     * @throws DataAccessException
     */
    public League findById(String id) throws DataAccessException {
        return new League();
    }

    /**
     * Updates league if found in database
     * @param league - league with updated info
     * @return League - updated League
     * @throws DataAccessException
     */
    public League update(League league) throws DataAccessException {
        return league;
    }

    /**
     * Deletes league from database if found
     * @param id - id of the league to delete
     * @return Leauge - league that was deleted
     * @throws DataAccessException
     */
    public League delete(String id) throws DataAccessException {
        return new League();
    }
}
