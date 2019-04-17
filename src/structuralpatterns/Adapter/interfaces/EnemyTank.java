package structuralpatterns.Adapter.interfaces;

public interface EnemyTank extends ParentEnemy{
    void tankFire();
    void tankRun();
    String getName();

}
