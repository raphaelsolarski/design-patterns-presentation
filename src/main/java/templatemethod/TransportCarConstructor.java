package templatemethod;

public class TransportCarConstructor extends CarConstructor{

    @Override
    public void prepareConstruction() {
        System.out.println("transport car prepare construction");
    }

    @Override
    public void mountEngine() {
        System.out.println("transport car mount engine");
    }

    @Override
    public void colorInCar() {
        System.out.println("transport car color in car");
    }
}
