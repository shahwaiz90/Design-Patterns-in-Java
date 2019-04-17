package structuralpatterns.Adapter.interfaces;

public interface Enemy extends ParentEnemy{
    void smashWithHands();
    void run();
    String getName();

}
