public class Student extends Person {
    String university;
    int course;

    public Student(String name, int age, String gender, String university, int course) {
        super(name, age, gender);
        this.university = university;
        this.course = course;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Університет: " + university + ", Курс: " + course);
    }

    @Override
    public void work() {
        System.out.println("Студент навчається");
    }
}
