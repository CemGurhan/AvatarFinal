import Avatar.Air;
import Avatar.Fire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirTest {

    private Air air;
    private Fire fire;

    @BeforeEach
    void setup(){
        air = new Air("jem", 22, true);
        fire = new Fire("Fengyi", 24, false, "Green");
    }

    @Test
    void jump(){
        assertEquals("jem jumped", air.jump());
    }

    @Test
    void burnair(){
        fire.setHeat(200);
        air.burnair(fire);
        assertEquals(225, air.getTemp());
    }
}
