package creationalpatterns.AbstractFactory.factories;

import creationalpatterns.AbstractFactory.data.Call;
import creationalpatterns.AbstractFactory.data.MonitoringFeatures;
import creationalpatterns.AbstractFactory.data.SMS;
import creationalpatterns.AbstractFactory.process.ProcessingUnit;

public class DataFactory extends AbstractFactory{


    @Override
    public MonitoringFeatures getFeatureFactory(String str) {
        switch (str){
            case "sms":
                return new SMS();
            case "call":
                return new Call();
        }
        return null;
    }

    //Because we don't know at compile time that it would be called or not
    @Override
    public ProcessingUnit getProcessingFactory(String str) {
        return null;
    }
}
