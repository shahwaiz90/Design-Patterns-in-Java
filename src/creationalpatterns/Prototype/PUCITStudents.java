package creationalpatterns.Prototype;


public class PUCITStudents implements Students {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students makeCopy()  {
        try {
            return (PUCITStudents) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public String toString(){
//        return "Name: "+this.getName();
//    }
}
