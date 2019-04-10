package creationalpatterns.AbstractFactory.creater;

import creationalpatterns.AbstractFactory.factories.AbstractFactory;
import creationalpatterns.AbstractFactory.factories.DataFactory;
import creationalpatterns.AbstractFactory.factories.ProcessingFactory;

public class FactoryCreater {
    public static AbstractFactory getFactory(String factoryType){
        switch (factoryType){
            case "data":
                return new DataFactory();
            case "processing":
                return new ProcessingFactory();
        }
        return null;
    }
}
