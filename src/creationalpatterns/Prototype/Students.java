package creationalpatterns.Prototype;

public interface Students extends Cloneable {

    Students makeCopy();
    String getName();
}
