package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);

        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, ScorerGenerator.generateArray(8+1));
        scoresData.setScore("Chivas", "Queretaro", 2, 1, ScorerGenerator.generateArray(2+1));
        scoresData.setScore("La Ganga", "Muebles America", 0, 0, ScorerGenerator.generateArray(0+0));
    }
}
