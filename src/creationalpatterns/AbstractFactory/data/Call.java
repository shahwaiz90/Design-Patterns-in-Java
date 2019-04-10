package creationalpatterns.AbstractFactory.data;

public class Call extends MonitoringFeature {

    @Override
    public String getFeatureName() {
        return "Call Feature";
    }

    public void backUp(){
        System.out.println("Backup Starts Here");
    }

    @Override
    public void upload() {
        System.out.println("Uploading Starts Here");
    }
}
