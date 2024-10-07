package zva.commands;

import zva.exceptions.CommandException;

public class CheckFuelCommand implements Command {
    private final int availableFuel;

    public CheckFuelCommand(int availableFuel) {
        this.availableFuel = availableFuel;
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Use execute(int requiredFuel) method instead.");
    }

    public void execute(int requiredFuel) {
        if (availableFuel < requiredFuel) {
            throw new CommandException("Not enough fuel!");
        }
    }
}
