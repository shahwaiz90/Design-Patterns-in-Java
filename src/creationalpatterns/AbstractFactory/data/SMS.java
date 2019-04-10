package creationalpatterns.AbstractFactory.data;

public class SMS extends MonitoringFeature {
    @Override
    public String getFeatureName() {
        return "Sms Feature";
    }

    public void backUp(){
        System.out.println("Backup Starts Here");
    }

    @Override
    public void upload() {
        System.out.println("Uploading Starts Here");
    }
}
