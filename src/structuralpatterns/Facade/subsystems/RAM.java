package structuralpatterns.Facade.subsystems;

public class RAM implements HardwareInterface{
    public void start(){
        System.out.println("RAM Ready");
    }

    public void stop(){
        System.out.println("RAM Stopped");
    }
}
