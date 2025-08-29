package example.project.one;

public class OuterClass {
    static {
        System.out.println("OuterClass: Статический блок выполнен");
    }

    {
        System.out.println("OuterClass: Нестатический блок выполнен");
    }

    public OuterClass() {
        System.out.println("OuterClass: Конструктор выполнен");
    }

    class InnerClass {
        // Статический блок вложенного класса (только если класс статический)
        // static { } - нельзя в нестатическом вложенном классе

        {
            System.out.println("InnerClass: Нестатический блок выполнен");
        }

        public InnerClass() {
            System.out.println("InnerClass: Конструктор выполнен");
        }
    }

    static class StaticNestedClass {
        static {
            System.out.println("StaticNestedClass: Статический блок выполнен");
        }

        {
            System.out.println("StaticNestedClass: Нестатический блок выполнен");
        }

        public StaticNestedClass() {
            System.out.println("StaticNestedClass: Конструктор выполнен");
        }
    }
}