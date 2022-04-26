import Avatar.Fire;
import Avatar.Water;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterTest {

    private Water water;
    private Fire fire;

    @BeforeEach
    void setup(){
        fire = new Fire("Fengyi", 24, false, "Green");
        water =  new Water("feng", 2, true, "northern");
    }

    @Test
    void jump(){
        assertEquals("feng jumped", water.jump());
    }

    @Test
    void freezewater(){
        water.freezeWater();
        assertEquals("ice", water.getLiquidState());
    }

    @Test
    void vaperise(){
        fire.setHeat(500);
        water.vaperise(fire);
        assertEquals("air", water.getLiquidState());
    }
}
