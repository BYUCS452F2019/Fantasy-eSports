package dao;

import model.Team;

import javax.xml.crypto.Data;


public class TeamDAO {
    public TeamDAO() {}

    /**
     * Attempts to add team to the database
     * @param team - the team to add
     * @return bolean - success of insert
     * @throws DataAccessException
     */
    public boolean insert(Team team) throws DataAccessException {
        return false;
    }

    /**
     * Queries database for team by id
     * @param id - id of the team to find
     * @return Team - team found
     * @throws DataAccessException
     */
    public Team findById(String id) throws DataAccessException {
        return new Team();
    }

    /**
     * Updates team if found in database
     * @param team - team with updated info
     * @return Team that was found
     * @throws DataAccessException
     */
    public Team update(Team team) throws DataAccessException {
        return team;
    }

    /**
     * Deletes team if exists in database
     * @param id - id of the team to delete
     * @return Team that was deleted
     * @throws DataAccessException
     */
    public Team delete(String id) throws DataAccessException {
        return new Team();
    }
}
