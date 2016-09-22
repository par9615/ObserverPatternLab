package mx.iteso.observer;

/**
 * Created by simio on 22/09/2016.
 */
public class Scorer {
    private String name;
    private int number;
    private String position;
    private String team;

    public Scorer(String name, int number, String position, String team){
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
