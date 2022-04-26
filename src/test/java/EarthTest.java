import Avatar.Earth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EarthTest {

    private Earth earth;

    @BeforeEach
    void setup(){
        earth =new Earth("cem", 15, false);
    }

    @Test
    void jump(){
        assertEquals("cem jumped", earth.jump());
    }

    @Test
    void jump_high(){
        assertEquals("cem jumped 10", earth.jump(10));
    }
}
