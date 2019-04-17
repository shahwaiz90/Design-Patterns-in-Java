package structuralpatterns.Proxy;

import structuralpatterns.Proxy.parent.Image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying from memory" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading from Disk" + fileName);
    }
}