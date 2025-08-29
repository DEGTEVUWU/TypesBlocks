package example.project.one;

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("MyInterface: Дефолтный метод выполнен");

        {
            System.out.println("MyInterface: Блок внутри дефолтного метода");
        }
    }

    static void staticInterfaceMethod() {
        System.out.println("MyInterface: Статический метод интерфейса выполнен");
    }

    void interfaceMethod();
}