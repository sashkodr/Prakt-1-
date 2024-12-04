public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Стать: " + gender);
    }

    public void work() {
        System.out.println("Людина працює");
    }
}
