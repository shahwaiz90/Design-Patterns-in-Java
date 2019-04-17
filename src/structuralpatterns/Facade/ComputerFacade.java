package structuralpatterns.Facade;

import structuralpatterns.Facade.subsystems.CPU;
import structuralpatterns.Facade.subsystems.GraphicsCard;
import structuralpatterns.Facade.subsystems.RAM;


public class ComputerFacade {
    private RAM ram;
    private CPU cpu;
    private GraphicsCard graphicsCard;

    public ComputerFacade(){
        ram             =   new RAM();
        cpu             =   new CPU();
        graphicsCard    =   new GraphicsCard();
    }

    public void start(){
        System.out.println("Computer Starting....");
        ram.start();
        cpu.start();
        graphicsCard.start();
    }

    public void stop(){
        ram.stop();
        cpu.stop();
        graphicsCard.stop();
        System.out.println("Computer Shutting down!");
    }
}
