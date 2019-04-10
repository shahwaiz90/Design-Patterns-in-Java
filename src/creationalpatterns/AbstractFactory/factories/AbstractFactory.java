package creationalpatterns.AbstractFactory.factories;


import creationalpatterns.AbstractFactory.data.MonitoringFeature;
import creationalpatterns.AbstractFactory.process.ProcessingTechnique;

//An interface/abstract class for creating related products
public abstract class AbstractFactory {
    public abstract MonitoringFeature getFeature(String str);
    public abstract ProcessingTechnique getProcessingTechnique(String str);
}
