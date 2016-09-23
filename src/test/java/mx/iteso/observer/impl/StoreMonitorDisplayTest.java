package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import mx.iteso.observer.ScorerGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    private ArrayList<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        scorers = ScorerGenerator.generateArray(1+0);
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, scorers);
        //Nothing to assert or verify for now
    }
}
