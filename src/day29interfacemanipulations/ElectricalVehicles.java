package day29interfacemanipulations;

public abstract class ElectricalVehicles implements AirCondition {

    @Override
    public void electronicAc() {
        System.out.println("Electrical vehicle AC");
    }

    @Override
    public void bacterialKiller() {
        System.out.println("Electrical vehicle bacterialkillers");
    }
}
