package structuralpatterns.Adapter.adapter;

import structuralpatterns.Adapter.adaptee.EnemyRobot;
import structuralpatterns.Adapter.interfaces.EnemyAttacker;
import structuralpatterns.Adapter.interfaces.EnemyTank;
import structuralpatterns.Adapter.interfaces.ParentEnemy;

public class EnemyRobotAdapter implements EnemyAttacker {

    private ParentEnemy parentEnemy;

    public void setAdapter(ParentEnemy parentEnemy){
        this.parentEnemy = parentEnemy;
    }

    @Override
    public void fireWeapon() {
        if(parentEnemy != null){
            if(parentEnemy instanceof EnemyRobot){
                ((EnemyRobot) parentEnemy).smashWithHands();
            }else if(parentEnemy instanceof EnemyTank){
                ((EnemyTank) parentEnemy).tankFire();
            }
        }
    }

    @Override
    public void goForward() {
        if(parentEnemy instanceof EnemyRobot){
            ((EnemyRobot) parentEnemy).run();
        }else if(parentEnemy instanceof EnemyTank){
            ((EnemyTank) parentEnemy).tankRun();
        }
    }

    @Override
    public String getEnemyName() {
        if(parentEnemy instanceof EnemyRobot){
           return ((EnemyRobot) parentEnemy).getName();
        }else if(parentEnemy instanceof EnemyTank){
            return ((EnemyTank) parentEnemy).getName();
        }
        return "No Name Found";
    }
}
