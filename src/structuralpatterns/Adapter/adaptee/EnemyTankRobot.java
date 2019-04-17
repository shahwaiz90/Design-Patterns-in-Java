package structuralpatterns.Adapter.adaptee;

import structuralpatterns.Adapter.interfaces.EnemyTank;

public class EnemyTankRobot implements EnemyTank {

    private String name;

    public EnemyTankRobot(String name){
        this.name = name;
    }

    public void tankFire(){
        System.out.println(name+": DHUZZ DHUZZ!!");
    }

    public void tankRun(){
        System.out.println(name+"running....");
    }

    public String getName(){
        return name;
    }
}
