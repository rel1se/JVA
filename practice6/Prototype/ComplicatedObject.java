package practice6.Prototype;

import java.lang.reflect.Type;

public class ComplicatedObject implements Copyable{
    private Type type;
    public enum Type{
        ONE,TWO
    }
    public ComplicatedObject copy() {
        ComplicatedObject complicatedObject = new ComplicatedObject();
        return complicatedObject;
    }
    public void setType(Type type){
        this.type = type;
    }
}
