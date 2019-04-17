package structuralpatterns.Facade.subsystems;

public class GraphicsCard implements HardwareInterface {
    public void start(){
        System.out.println("Graphics card Ready");
    }

    public void stop(){
        System.out.println("Graphics card stopped");
    }
}
