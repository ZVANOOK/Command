import org.junit.jupiter.api.Test;
import zva.commands.CheckFuelCommand;
import zva.exceptions.CommandException;

import static org.junit.jupiter.api.Assertions.*;

class CheckFuelCommandTest {
    @Test
    void testExecuteWithEnoughFuel() {
        CheckFuelCommand command = new CheckFuelCommand(10);
        command.execute(5); // Нет исключения
    }

    @Test
    void testExecuteWithNotEnoughFuel() {
        CheckFuelCommand command = new CheckFuelCommand(5);
        assertThrows(CommandException.class, () -> command.execute(10));
    }
}
