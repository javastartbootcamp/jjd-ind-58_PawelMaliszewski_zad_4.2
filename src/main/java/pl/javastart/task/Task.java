package pl.javastart.task;

public class Task {
    private String name;
    private String description;
    private int priority;
    Person person;

    public Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.priority = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    boolean highPriority() {
        return priority > 0 && priority < 4;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    boolean noPriority() {
        return priority == 4;
    }

    void checkPriority() {
        if (highPriority()) {
            System.out.println("Zadanie: " + name + ", Wysoki priorytet");
        } else if (mediumPriority()) {
            System.out.println("Zadanie: " + name + ", Średni priorytet");
        } else if (lowPriority()) {
            System.out.println("Zadanie: " + name + ", Niski priorytet");
        } else if (noPriority()) {
            System.out.println("Zadanie: " + name + ", Priorytet nie został przydzielony");
        }
    }
}
