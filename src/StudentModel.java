class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Grado: " + grade);
    }
    public void estudiar() {
        System.out.println(name + " está estudiando.");
    }
}
