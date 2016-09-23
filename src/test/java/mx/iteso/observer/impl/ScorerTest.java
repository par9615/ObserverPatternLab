package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import mx.iteso.observer.ScorerGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 23/09/2016.
 */
public class ScorerTest {
    private Scorer scorer;
    public static String NAME = "Mike";
    public static String POSITION = "Goalkeeper";
    public static int NUMBER = 1;
    public static String TEAM = "PSG";

    @Before
    public void setUp() {
        scorer = ScorerGenerator.generateArray(1).get(0);
    }

    @Test
    public void testSetNewValues() {
        scorer.setName(NAME);
        scorer.setNumber(NUMBER);
        scorer.setPosition(POSITION);
        scorer.setTeam(TEAM);
        assertEquals(scorer.getName(),ScorerTest.NAME);
        assertEquals(scorer.getNumber(),ScorerTest.NUMBER);
        assertEquals(scorer.getPosition(),ScorerTest.POSITION);
        assertEquals(scorer.getTeam(),ScorerTest.TEAM);
    }
}
