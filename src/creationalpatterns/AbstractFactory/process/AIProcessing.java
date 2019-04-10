package creationalpatterns.AbstractFactory.process;

public class AIProcessing extends ProcessingTechnique {
    @Override
    public void processWeightage() {
        System.out.println("Different Algorithm for Processing Weightages for AI");
    }

    @Override
    public void compilingNeuralNetworkLayer() {
        System.out.println("Different Algorithm for Compiling Neural Network Layet in AI");
    }
}
