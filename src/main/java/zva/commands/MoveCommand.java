package zva.commands;

public class MoveCommand implements Command {
    private final int fuelConsumption;
    private BurnFuelCommand burnFuelCommand = null;

    public MoveCommand(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void execute() {
        burnFuelCommand.execute(fuelConsumption);
    }
}
