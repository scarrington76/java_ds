import java.util.ArrayList;
import java.util.List;

public class ProfileData {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");

        Person person = new Person();
        person.setLogo(Logo.circle);
        person.setRotation(Rotation.upright);
        person.setColor(colors);

        System.out.println("Person Details - " + person);
    }

}