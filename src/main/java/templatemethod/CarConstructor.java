package templatemethod;

public abstract class CarConstructor {

    public final void construct() {
        prepareConstruction();
        mountEngine();
        colorInCar();
    }

    public abstract void prepareConstruction();
    public abstract void mountEngine();
    public abstract void colorInCar();

}
