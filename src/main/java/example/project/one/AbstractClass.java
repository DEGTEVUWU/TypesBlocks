package example.project.one;

public abstract class AbstractClass {
    static {
        System.out.println("AbstractClass: Статический блок выполнен");
    }

    {
        System.out.println("AbstractClass: Нестатический блок выполнен");
    }

    public AbstractClass() {
        System.out.println("AbstractClass: Конструктор выполнен");
    }

    abstract void abstractMethod();
}
