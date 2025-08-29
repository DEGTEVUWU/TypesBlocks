package example.project.one;

public class RegularClass {
    static {
        System.out.println("RegularClass: Статический блок выполнен");
    }

    {
        System.out.println("RegularClass: Нестатический блок выполнен");
    }

    public RegularClass() {
        System.out.println("RegularClass: Конструктор выполнен");
    }

    public void methodWithBlock() {
        System.out.println("RegularClass: Начало метода");

        {
            System.out.println("RegularClass: Блок внутри метода выполнен");
        }

        System.out.println("RegularClass: Конец метода");
    }
}
