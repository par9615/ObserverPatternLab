package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

/**
 * Created by Erick on 22/09/2016.
 */
public class MobileAppDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private ArrayList<Scorer> scorers;
    private String typeOfDisplay;

    public MobileAppDisplay(Subject scoresData) {
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
        typeOfDisplay = "Mobile App Display";
    }

    public void display() {
        System.out.println(typeOfDisplay);
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
        for(Scorer scorer: scorers) {
            System.out.println(scorer.getName() + " from " + scorer.getTeam() + " with the number " + scorer.getNumber() + " with the position of " + scorer.getPosition() + " scored");
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorers;
        display();
    }
}
