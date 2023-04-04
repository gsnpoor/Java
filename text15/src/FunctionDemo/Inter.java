package FunctionDemo;

public interface Inter {
    public abstract void method();
    public default void show(){
        System.out.println("接口中的方法--------show");
    }
}
