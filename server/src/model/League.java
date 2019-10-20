package model;

/**
 * Object representing a league. Has id, league name, and id of the user that created it
 */
public class League {
    private String id;
    private String name;
    private String userId;

    public League() {}

    public League(String id, String name, String userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return  false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof  League) {
            League tmp = (League) obj;

            if (this.id.equals(tmp.id) &&
                this.name.equals(tmp.name) &&
                this.userId.equals(tmp.userId)
            ) {
                return true;
            }
        }

        return false;
    }
}
