package miage.jvol.bowling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrameTest {

    Frame f;

    @Before
    public void setUp() throws Exception {
        this.f = new Frame(9);
    }

    @After
    public void tearDown() throws Exception {
        Frame f = null;
    }

    @Test
    public void getValeur1() {
        assertEquals(0,this.f.getValeur1());
    }

    @Test
    public void getValeur2() {
        assertEquals(0,this.f.getValeur2());
    }

    @Test
    public void getValeur3() {
        assertEquals(0,this.f.getValeur3());
    }

    @Test
    public void setValeur1() {
        this.f.setValeur1(5);
        assertEquals(5,f.getValeur1());
    }

    @Test
    public void setValeur2() {
        this.f.setValeur2(7);
        assertEquals(7,this.f.getValeur2());
    }

    @Test
    public void setValeur3() {
        this.f.setValeur3(2);
        assertEquals(2,this.f.getValeur3());
    }

    @Test
    public void isValide(){
        this.f.setValeur1(10);
        assertTrue(this.f.isValide());

        this.f.setValeur1(4);
        this.f.setValeur2(3);
        assertTrue(this.f.isValide());

        //dernier lancé
        this.f = new Frame(10);
        this.f.setValeur1(10);
        this.f.setValeur2(10);
        this.f.setValeur3(10);
        assertTrue(this.f.isValide());

        this.f.setValeur1(6);
        this.f.setValeur2(4);
        this.f.setValeur3(9);
        assertTrue(this.f.isValide());

        //pas dernier lancé
        this.f = new Frame(9);
        this.f.setValeur1(10);
        this.f.setValeur2(10);
        this.f.setValeur3(10);
        assertFalse(this.f.isValide());

        this.f.setValeur1(6);
        this.f.setValeur2(4);
        this.f.setValeur3(9);
        assertFalse(this.f.isValide());


        this.f.setValeur1(6);
        this.f.setValeur2(9);
        assertFalse(this.f.isValide());

        this.f.setValeur1(10);
        this.f.setValeur2(3);
        assertFalse(this.f.isValide());

        this.f.setValeur1(4);
        this.f.setValeur2(2);
        this.f.setValeur3(3);
        assertFalse(this.f.isValide());

    }

    @Test
    public void testToString() {

    }
}