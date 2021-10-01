public class Game {
    private String gameName;
    private String id;
    private String gameCategory;

    public Game(String gameName,  String id, String gameCategory) {
        this.gameName = gameName;
        this.id = id;
        this.gameCategory = gameCategory;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }
}
