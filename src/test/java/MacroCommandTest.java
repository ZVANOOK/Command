import org.junit.jupiter.api.Test;
import zva.commands.*;
import zva.exceptions.CommandException;

import static org.junit.jupiter.api.Assertions.*;

class MacroCommandTest {
    @Test
    void testMacroExecutionWithException() {
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(30);
        CheckFuelCommand checkFuelCommand = new CheckFuelCommand(20); // Меняем на 20, недостаточно топлива для проверки

        MacroCommand macroCommand = new MacroCommand(checkFuelCommand, burnFuelCommand);

        // Ожидание исключения CommandException
        assertThrows(CommandException.class, macroCommand::execute);
    }

    @Test
    void testMacroExecutionSuccessful() {
        CheckFuelCommand checkFuelCommand = new CheckFuelCommand(50);
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(30);

        MacroCommand macroCommand = new MacroCommand(checkFuelCommand, burnFuelCommand);

        // Это должно пройти без исключений
        assertDoesNotThrow(macroCommand::execute);
    }
}
