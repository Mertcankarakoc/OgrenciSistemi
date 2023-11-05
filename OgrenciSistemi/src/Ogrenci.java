import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ogrenci {

    private String name;
    private int grade;
    private String className;

    @Override
    public String toString() {
        return "NAME: " + name + "\t" + "NOT: " + grade + "\t" + "SINIF: " + "\t"+ className;
    }

    public Ogrenci(String name, int grade, String className) {
        this.name = name;
        this.grade = grade;
        this.className = className;

    }

}
