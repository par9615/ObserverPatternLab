package mx.iteso.observer;

/**
 * Created by simio on 22/09/2016.
 */
public class Scorer {
    public String name;
    public int number;
    public int position;
    public String team;

    public Scorer(String name, int number, int position, String team){
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
