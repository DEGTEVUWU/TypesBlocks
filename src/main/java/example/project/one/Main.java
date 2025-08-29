package example.project.one;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация блоков ===");

        // Создание объекта обычного класса
        System.out.println("\n--- Создание RegularClass ---");
        RegularClass regular = new RegularClass();

        System.out.println("\n--- Создание второго RegularClass ---");
        RegularClass regular2 = new RegularClass();

        // Создание объекта вложенного класса
        System.out.println("\n--- Создание InnerClass ---");
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Абстрактный класс (через анонимный класс)
        System.out.println("\n--- Создание AbstractClass ---");
        AbstractClass abstractObj = new AbstractClass() {
            void abstractMethod() {
                System.out.println("Анонимная реализация абстрактного метода");
            }
        };
        abstractObj.abstractMethod();

        // Интерфейс (через анонимный класс)
        System.out.println("\n--- Создание MyInterface ---");
        MyInterface interfaceObj = new MyInterface() {
            public void interfaceMethod() {
                System.out.println("Реализация метода интерфейса");
            }
        };
        interfaceObj.interfaceMethod();
        interfaceObj.defaultMethod();
        MyInterface.staticInterfaceMethod();
    }
}