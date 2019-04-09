package creationalpatterns.AbstractFactory.factories;

import creationalpatterns.AbstractFactory.data.MonitoringFeatures;
import creationalpatterns.AbstractFactory.process.AIProcessing;
import creationalpatterns.AbstractFactory.process.MLProcessing;
import creationalpatterns.AbstractFactory.process.ProcessingUnit;

public class ProcessingFactory extends AbstractFactory{
    @Override
    public MonitoringFeatures getFeatureFactory(String str) {
        return null;
    }

    public ProcessingUnit getProcessingFactory(String processingTechnique){
        switch (processingTechnique){
            case "ai" :
                return new AIProcessing();

            case "ml" :
                return new MLProcessing();
        }
            return null;
    }
}
