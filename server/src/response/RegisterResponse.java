package response;

public class RegisterResponse extends Response {
    private String id;
    private String username;

    public RegisterResponse() {}

    public RegisterResponse(String message, String id, String username) {
        super(message);
        this.id = id;
        this.username = username;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
