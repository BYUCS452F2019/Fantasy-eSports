package business;

import dao.*;
import model.*;
import request.LoginRequest;
import response.LoginResponse;

public class LoginBusiness {

    public LoginBusiness() {}

    /**
     * Logs a user in. Checks that username exists and if passwords match
     * @param req - LoginRequest
     * @return - LoginResponse
     */
    public LoginResponse login(LoginRequest req) {
        LoginResponse response = new LoginResponse();

        UserDAO userDAO = new UserDAO();

        try {
            User user = userDAO.findByUsername(req.getUsername());

            if (user == null || !user.getPassword().equals(req.getPassword()) || !user.getUsername().equals(req.getUsername())) {
                response.setMessage("Username or password incorrect.");
            } else {
                response.setId(user.getId());
                response.setUsername(user.getUsername());
            }
        } catch (DataAccessException error) {
            response.setMessage(error.getMessage());
        }

        return response;
    }
}
