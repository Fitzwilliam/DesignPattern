package Decorator;

public class ChildDecorator extends Decorator{
    private Decorator decorator;
    public ChildDecorator(Decorator decorator){
        this.decorator = decorator;
    }
    public String getMerong(){
        return "@" + decorator.getMerong() + "@";
    }
}