package creationalpatterns.Factory;

public class Call extends MonitoringFeatures {

    public void backUp(){
        System.out.println("Backup Starts Here");
    }

    @Override
    public void upload() {
        System.out.println("Uploading Starts Here");
    }
}
