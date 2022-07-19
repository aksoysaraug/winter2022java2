package day29interfacemanipulations;

public class Car implements AirCondition, HybridEngine {

    @Override
    public void electronicAc() {
        System.out.println("The Car AC is electronic");
    }

    @Override
    public void climateAc() {
        System.out.println("The Car AC is climate AC");
    }

    @Override
    public void bacterialKiller() {
        System.out.println("The Csar AC kills 99% of the bacteria ");
    }

    @Override
    public void run() {
        System.out.println("The Car AC runs perfectly");
    }

    @Override
    public void havingHybridEngine() {
        System.out.println("The Car engine is hybrid");
    }
}
