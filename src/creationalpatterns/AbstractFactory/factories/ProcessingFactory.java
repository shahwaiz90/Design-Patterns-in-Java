package creationalpatterns.AbstractFactory.factories;

import creationalpatterns.AbstractFactory.data.MonitoringFeature;
import creationalpatterns.AbstractFactory.process.AIProcessing;
import creationalpatterns.AbstractFactory.process.MLProcessing;
import creationalpatterns.AbstractFactory.process.ProcessingTechnique;

public class ProcessingFactory extends AbstractFactory{
    @Override
    public MonitoringFeature getFeature(String str) {
        return null;
    }

    public ProcessingTechnique getProcessingTechnique(String processingTechnique){
        switch (processingTechnique){
            case "ai" :
                return new AIProcessing();

            case "ml" :
                return new MLProcessing();
        }
            return null;
    }
}
