package creationalpatterns.AbstractFactory.process;

public class MLProcessing extends ProcessingTechnique {
    @Override
    public void processWeightage() {
        System.out.println("Different Algorithm for Processing Weightages for ML");
    }

    @Override
    public void compilingNeuralNetworkLayer() {
        System.out.println("Different Algorithm for Compiling Neural Network Layet in ML");
    }
}
