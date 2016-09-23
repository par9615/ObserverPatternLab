package mx.iteso.observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Erick on 22/09/2016.
 */
public class ScorerGenerator {

    public static ArrayList<String> names = new ArrayList<String>(){{
        add("Miroslav Klose");
        add("Ronaldo Nazario");
        add("Ronaldinho Gaúcho");
        add("Zinedine Zidane");
        add("Finito López");
        add("Julio César Chávez");
        add("Muhammad Ali");
        add("Philipp Lahm");
        add("Salvador Sánchez");
        add("Pep Guardiola");
    }};

    public static ArrayList<String> positions = new ArrayList<String>() {{
        add("Gaolkeeper");
        add("Defense");
        add("Midfielder");
        add("Striker");
    }};

    public static ArrayList<String> teams = new ArrayList<String>() {{
        add("Atlas");
        add("Chivas");
        add("Mineros");
        add("Real Madrid");
        add("Coras");
        add("Barcelona");
        add("Bayern Munich");
        add("Chelsea");
        add("Alemania");
        add("México");
    }};



    public static ArrayList<Scorer> generateArray(int numberOfScorers) {
        ArrayList<Scorer> scorers = new ArrayList<Scorer>();
        Random random = new Random();
        for(int i = 0; i < numberOfScorers; i++) {
            scorers.add(new Scorer( names.get( random.nextInt(names.size()) ),
                    random.nextInt(101),
                    positions.get( random.nextInt(positions.size()) ),
                    teams.get( random.nextInt(teams.size())) )
            );
        }
        return scorers;
    }

}
