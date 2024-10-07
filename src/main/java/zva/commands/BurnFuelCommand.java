package zva.commands;

public class BurnFuelCommand implements Command {
    private int fuel;

    public BurnFuelCommand(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void execute() {
        // Заглушка для execute, необходимо будет вызвать другой метод для выполнения
    }

    public void execute(int fuelConsumption) {
        fuel -= fuelConsumption;
    }

    public int getRemainingFuel() {
        return fuel;
    }
}
