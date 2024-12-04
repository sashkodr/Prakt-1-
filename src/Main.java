public class Main {
    public static void main(String[] args) {
        Person person = new Person("Анна", 22, "жіноча");
        person.introduce();
        person.work();

        Student student = new Student("Дмитро", 19, "чоловіча", "ЛДУБЖД", 2);
        student.introduce();
        student.work();

        Cursant cursant = new Cursant("Олексій", 18, "чоловіча", "Сержант", "Військова академія");
        cursant.introduce();
        cursant.work();
    }
}
