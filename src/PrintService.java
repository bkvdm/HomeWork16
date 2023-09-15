import java.util.Arrays;

public class PrintService {
    public void print(FacultyGryffindor[] studentsFacultyGryffindor) {
        System.out.println("Факультет Гриффиндор. Количество студентов: " + studentsFacultyGryffindor.length);
        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
            FacultyGryffindor facultyGryffindor = studentsFacultyGryffindor[i];
            System.out.println("имя: " + facultyGryffindor.getName());
            System.out.print("сила магии: " + facultyGryffindor.getPowerMagic());
            System.out.print(", расстояние трансгрессии: " + facultyGryffindor.getDistanceTransgression());
            System.out.print(", благородство: " + facultyGryffindor.getNobility());
            System.out.print(", храбрость: " + facultyGryffindor.getBravery());
            System.out.print(", честь: " + facultyGryffindor.getHonor());
            System.out.println();
        }
        System.out.println();
    }

    public void print(FacultyHufflepuff[] studentsFacultyHufflepuff) {
        System.out.println("Факультет Пуффендуй. Количество студентов: " + studentsFacultyHufflepuff.length);
        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
            FacultyHufflepuff facultyHufflepuff = studentsFacultyHufflepuff[i];
            System.out.println("имя: " + facultyHufflepuff.getName());
            System.out.print("сила магии: " + facultyHufflepuff.getPowerMagic());
            System.out.print(", расстояние трансгрессии: " + facultyHufflepuff.getDistanceTransgression());
            System.out.print(", трудолюлие: " + facultyHufflepuff.getHardWork());
            System.out.print(", честность: " + facultyHufflepuff.getHonesty());
            System.out.print(", верность: " + facultyHufflepuff.getLoyalty());
            System.out.println();
        }
        System.out.println();
    }
    public void print(FacultyRavenclaw[] studentsFacultyRavenclaw) {
        System.out.println("Факультет Когтевран. Количество студентов: " + studentsFacultyRavenclaw.length);
        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
            FacultyRavenclaw facultyRavenclaw = studentsFacultyRavenclaw[i];
            System.out.println("имя: " + facultyRavenclaw.getName());
            System.out.print("сила магии: " + facultyRavenclaw.getPowerMagic());
            System.out.print(", расстояние трансгрессии: " + facultyRavenclaw.getDistanceTransgression());
            System.out.print(", ум: = " + facultyRavenclaw.getMind());
            System.out.print(", мудрость: " + facultyRavenclaw.getWisdom());
            System.out.print(", остроумие: " + facultyRavenclaw.getWit());
            System.out.print(", творчество: " + facultyRavenclaw.getCreation());
            System.out.println();
        }
        System.out.println();
    }

    public void print(FacultySlytherin[] studentsFacultySlytherin) {
        System.out.println("Факультет Слизерин. Количество студентов: " + studentsFacultySlytherin.length);
        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
            FacultySlytherin facultySlytherin = studentsFacultySlytherin[i];
            System.out.println("имя: " + facultySlytherin.getName());
            System.out.print("сила магии: " + facultySlytherin.getPowerMagic());
            System.out.print(", расстояние трансгрессии: " + facultySlytherin.getDistanceTransgression());
            System.out.print(", хитрость: " + facultySlytherin.getCunning());
            System.out.print(", решительность: " + facultySlytherin.getDetermination());
            System.out.print(", амбициозность: " + facultySlytherin.getAmbition());
            System.out.print(", жажда власти: " + facultySlytherin.getLustPower());
            System.out.println();
        }
    }
}
