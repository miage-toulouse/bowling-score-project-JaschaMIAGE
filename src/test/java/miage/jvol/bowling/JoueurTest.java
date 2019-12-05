package miage.jvol.bowling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JoueurTest {

    Joueur j;

    @Before
    public void setUp() throws Exception {
        this.j = new Joueur("Jascha");
    }

    @After
    public void tearDown() throws Exception {
        this.j = null;
    }

    @Test
    public void calculerScore() {

    }

    @Test
    public void lancer() {

    }
}