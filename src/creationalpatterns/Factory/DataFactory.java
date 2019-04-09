package creationalpatterns.Factory;

public class DataFactory {
    public MonitoringFeatures getFeatureData(String featureName){
        switch (featureName){
            case "sms" :
                return new SMS();

            case "call" :
                return new Call();
        }
            return null;
    }
}
