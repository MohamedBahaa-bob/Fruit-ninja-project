package Player;

///Singleton
public class Player {
    private int points;
    private int life;
    private String userName;
    private static Player player;

    private Player() {
    }

    public static Player getPlayer() {
        if (player == null)
            return player = new Player();
        return player;
    }


    ////Getters,Setters

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
