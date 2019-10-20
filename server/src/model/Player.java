package model;

public class Player {
    private String id;
    private String name;
    private String role;
    private int kills;
    private int deaths;
    private int assists;
    private int weeksOfPlay;

    public Player() {}

    public Player(String id, String name, String role, int kills, int deaths, int assists, int weeksOfPlay) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.weeksOfPlay = weeksOfPlay;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getWeeksOfPlay() {
        return weeksOfPlay;
    }

    public void setWeeksOfPlay(int weeksOfPlay) {
        this.weeksOfPlay = weeksOfPlay;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof  Player) {
            Player tmp = (Player) obj;

            if (this.id.equals(tmp.id) &&
                this.name.equals(tmp.name) &&
                this.role.equals(tmp.role) &&
                this.assists == tmp.assists &&
                this.kills == tmp.kills &&
                this.deaths == tmp.deaths) {

                return true;
            }
        }

        return false;
    }
}
