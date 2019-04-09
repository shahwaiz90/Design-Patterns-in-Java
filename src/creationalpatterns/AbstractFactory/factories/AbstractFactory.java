package creationalpatterns.AbstractFactory.factories;

import creationalpatterns.AbstractFactory.data.MonitoringFeatures;
import creationalpatterns.AbstractFactory.process.ProcessingUnit;

public abstract class AbstractFactory {
    public abstract MonitoringFeatures getFeatureFactory(String str);
    public abstract ProcessingUnit getProcessingFactory(String str);
}
