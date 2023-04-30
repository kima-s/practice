public class BasebollPlayer {
    private String name;

    private String position;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public BasebollPlayer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

