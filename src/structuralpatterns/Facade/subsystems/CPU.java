package structuralpatterns.Facade.subsystems;

public class CPU implements HardwareInterface{
    public void start(){
        System.out.println("CPU Started");
    }

    public void stop(){
        System.out.println("CPU Stopped");
    }
}
