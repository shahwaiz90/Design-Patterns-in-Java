package structuralpatterns.Adapter.adaptee;

import structuralpatterns.Adapter.interfaces.Enemy;

public class EnemyRobot implements Enemy {

    private String name;

    public EnemyRobot(String name){
        this.name = name;
    }

    public void smashWithHands(){
        System.out.println(name+": THA THA!!");
    }

    public void run(){
        System.out.println(name+"running....");
    }

    public String getName(){
        return name;
    }
}
