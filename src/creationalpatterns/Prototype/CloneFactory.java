package creationalpatterns.Prototype;

public class CloneFactory {

    public Students getClone(Students students){
            System.out.println("Student: "+students.getName()+" Clone going to make");
            return students.makeCopy();
    }
}
