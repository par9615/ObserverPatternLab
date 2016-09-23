package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.ScorerGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;
    ArrayList<Scorer> scorers;
    MobileAppDisplay mobileAppDisplay;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scorers = ScorerGenerator.generateArray(1+0);
        scoresData.setScore("testTeam", "testTeam2", 1, 0, scorers);
        verify(observer, times(2)).update("testTeam", "testTeam2", 1, 0, scorers);
    }

    @Test
    public void testRegisterMobileApp() {
        MobileAppDisplay mobileAppDisplay = mock(MobileAppDisplay.class);
        scoresData.registerObserver(mobileAppDisplay);
        scorers = ScorerGenerator.generateArray(2+1);
        scoresData.setScore("testHomeTeam","testAwayTeam",2,1,scorers);
        verify(mobileAppDisplay, times(1)).update("testHomeTeam","testAwayTeam",2,1,scorers);
    }

    @Test
    public void testRegisterMoreThanOneMobileApp() {
        Random random = new Random();
        int numberMobileApp = random.nextInt(20)+1;
        mobileAppDisplay = mock(MobileAppDisplay.class);
        for(int i = 0; i < numberMobileApp; i++) {
            scoresData.registerObserver(mobileAppDisplay);
        }
        scorers = ScorerGenerator.generateArray(3+0);
        scoresData.setScore("testHomeTeam","testAwayTeam",3,0,scorers);
        verify(mobileAppDisplay, times(numberMobileApp)).update("testHomeTeam", "testAwayTeam", 3,0,scorers);
    }
}
