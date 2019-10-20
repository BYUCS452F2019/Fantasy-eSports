package response;

public class LoginResponse extends Response {
    private String username;
    private String id;

    public LoginResponse() {}

    public LoginResponse(String username, String id) {
        this.username = username;
        this.id = id;
    }

    public LoginResponse(String message, String username, String id) {
        super(message);
        this.username = username;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}