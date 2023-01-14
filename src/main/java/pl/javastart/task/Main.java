package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ania", "Zawadzka");
        Task task1 = new Task("Pranie", "Kolory", -1, person1);
        Task task2 = new Task("Odkurzanie", "Parter", 1);
        Task task3 = new Task("Mycie podłóg", "Pierwsze piętro", 0, person1);
        Task task4 = new Task("Pranie dywanów", "Sekretariat");

        System.out.println(task1.highPriority());
        System.out.println(task1.mediumPriority());
        System.out.println(task1.lowPriority());
        System.out.println(task1.noPriority());
        System.out.println("-------------------");
        System.out.println(task2.highPriority());
        System.out.println(task2.mediumPriority());
        System.out.println(task2.lowPriority());
        System.out.println(task2.noPriority());
        System.out.println("-------------------");
        System.out.println(task3.highPriority());
        System.out.println(task3.mediumPriority());
        System.out.println(task3.lowPriority());
        System.out.println(task3.noPriority());
        System.out.println("-------------------");
        System.out.println(task4.highPriority());
        System.out.println(task4.mediumPriority());
        System.out.println(task4.lowPriority());
        System.out.println(task4.noPriority());
        System.out.println("-------------------");

        task1.checkPriority();
        task2.checkPriority();
        task3.checkPriority();
        task4.checkPriority();
    }
}
