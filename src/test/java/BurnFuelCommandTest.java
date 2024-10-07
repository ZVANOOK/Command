package zva.commands;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurnFuelCommandTest {
    @Test
    void testExecuteBurnsFuel() {
        BurnFuelCommand command = new BurnFuelCommand(10);
        command.execute(5);
        assertEquals(5, command.getRemainingFuel());
    }
}
