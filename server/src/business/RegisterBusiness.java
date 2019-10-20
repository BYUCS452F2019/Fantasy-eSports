package business;

import dao.*;
import model.*;
import request.RegisterRequest;
import response.RegisterResponse;
import java.util.UUID;


public class RegisterBusiness {
    public RegisterBusiness() {}

    public RegisterResponse register(RegisterRequest req) {
        RegisterResponse response = new RegisterResponse();

        if (!validateInput(req)) {
            response.setMessage("Invalid input.");

            return response;
        }

        UserDAO userDAO = new UserDAO();

        // check if username is taken
        try {
            User test = userDAO.findByUsername(req.getUsername());

            if (test != null) {
                response.setMessage("Username already exists.");

                return  response;
            }
        } catch (DataAccessException error) {
            response.setMessage(error.getMessage());

            return response;
        }

        User user = parseUser(req);

        try {
            userDAO.insert(user);

            response.setId(user.getId());
            response.setUsername(user.getUsername());
            response.setMessage(null);
        } catch (DataAccessException error) {
            response.setMessage(error.getMessage());

            return response;
        }

        return response;
    }

    /**
     * Parses user data from request
     * @param req RegisterRequest
     * @return User
     */
    private User parseUser(RegisterRequest req) {
        User user = new User();

        user.setUsername(req.getUsername());
        user.setPassword(req.getPassword());
        user.setBirthday(req.getBirthday());
        user.setEmail(req.getEmail());
        user.setGender(req.getGender());
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setId(UUID.randomUUID().toString());

        return user;
    }

    private boolean validateInput(RegisterRequest req) {
        if (!checkString(req.getUsername()) ||
            !checkString(req.getPassword()) ||
            !checkString(req.getBirthday()) ||
            !checkString(req.getEmail()) ||
            !checkString(req.getFirstName()) ||
            !checkString(req.getLastName()) ||
            !checkString(req.getGender())
        ) {
            return false;
        }

        return true;
    }

    /**
     * Validates that strings are not null and not empty
     * @param test
     * @return
     */
    private boolean checkString(String test) {
        if (test == null) {
            return false;
        }

        if (test.length() == 0) {
            return false;
        }

        return true;
    }
}
