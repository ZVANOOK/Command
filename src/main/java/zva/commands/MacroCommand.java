package zva.commands;

import zva.exceptions.CommandException;

public class MacroCommand implements Command {
    private final Command[] commands;

    public MacroCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            try {
                if (command instanceof CheckFuelCommand) {
                    // Используйте метод execute с параметром, а не checkFuel
                    ((CheckFuelCommand) command).execute(50); // Здесь 50 - необходимое количество топлива
                } else {
                    command.execute();
                }
            } catch (CommandException e) {
                throw new CommandException("MacroCommand execution stopped due to: " + e.getMessage());
            }
        }
    }
}
