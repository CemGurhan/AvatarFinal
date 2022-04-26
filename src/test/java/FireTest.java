import Avatar.Fire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireTest {

    private Fire fire;

    @Test
    void jump(){
        // given this person...
        //
        Fire fengyi = new Fire("Fengyi", 24, false, "Green");
        assertEquals("Fengyi jumped", fengyi.jump());
    }

    @Test
    void heat(){
        Fire fengyi = new Fire("Fengyi", 24, false, "Green");
        fengyi.heat(500);
        assertEquals("Fengyi shoot fire at 500 degrees", fengyi.shootFire());
    }


}
