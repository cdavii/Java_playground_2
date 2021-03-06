package advanced_junit;

import java.time.LocalDate;

public class Spartan {

    private int id;
    private String name;
    private String course;
    private LocalDate startDate;


    public Spartan(int id, String name, String course, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.startDate = startDate;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    public static void main(String[] args) {
        Spartan spartan = new Spartan(1, "asda1234","java",LocalDate.of(2021,1,1));
        System.out.println(spartan.getName().matches(".*\\d.*"));
    }
}
