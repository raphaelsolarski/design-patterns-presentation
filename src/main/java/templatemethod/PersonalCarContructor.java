package templatemethod;

public class PersonalCarContructor extends CarConstructor{

    @Override
    public void prepareConstruction() {
        System.out.println("personal car prepare construction");
    }

    @Override
    public void mountEngine() {
        System.out.println("personal car mount engine");
    }

    @Override
    public void colorInCar() {
        System.out.println("personal car color in car");
    }
}
