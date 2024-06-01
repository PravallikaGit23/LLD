package desginPatterns.Prototype;

public class Student implements Prototype {
   private String name;
    private int age;
    private String batch;
    private double psp;
    private double avgPSp;
    private String city;
    public Student(){

    }
    public Student(Student student) {
           this.batch = student.batch;
           this.avgPSp =student.avgPSp ;
         this.name = student.name;
          this.age = student.age;
          this.psp = student.psp;
          this.city = student.city;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgPSp() {
        return avgPSp;
    }

    public void setAvgPSp(double avgPSp) {
        this.avgPSp = avgPSp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Student clone() {

        return new Student(this);
    }
}
