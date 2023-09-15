import java.util.Arrays;

public class PrintService {
    public void print(FacultyGryffindor[] studentsFacultyGryffindor) {
        System.out.println("studentsFacultyGryffindor.length = " + studentsFacultyGryffindor.length);
        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
            FacultyGryffindor facultyGryffindor = studentsFacultyGryffindor[i];
            System.out.println("facultyGryffindor.getName() = " + facultyGryffindor.getName());
            System.out.println("facultyGryffindor.getPowerMagic() = " + facultyGryffindor.getPowerMagic());
            System.out.println("facultyGryffindor.getDistanceTransgression() = " + facultyGryffindor.getDistanceTransgression());
            System.out.println("facultyGryffindor.getNobility() = " + facultyGryffindor.getNobility());
            System.out.println("facultyGryffindor.getBravery() = " + facultyGryffindor.getBravery());
            System.out.println("facultyGryffindor.getHonor() = " + facultyGryffindor.getHonor());
        }
        System.out.println();
    }

    public void print(FacultyHufflepuff[] studentsFacultyHufflepuff) {
        System.out.println("studentsFacultyHufflepuff.length = " + studentsFacultyHufflepuff.length);
        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
            FacultyHufflepuff facultyHufflepuff = studentsFacultyHufflepuff[i];
            System.out.println("facultyHufflepuff.getName() = " + facultyHufflepuff.getName());
            System.out.println("facultyHufflepuff.getPowerMagic() = " + facultyHufflepuff.getPowerMagic());
            System.out.println("facultyHufflepuff.getDistanceTransgression() = " + facultyHufflepuff.getDistanceTransgression());
            System.out.println("facultyHufflepuff.getHardWork() = " + facultyHufflepuff.getHardWork());
            System.out.println("facultyHufflepuff.getHonesty() = " + facultyHufflepuff.getHonesty());
            System.out.println("facultyHufflepuff.getLoyalty() = " + facultyHufflepuff.getLoyalty());
        }
        System.out.println();
    }
    public void print(FacultyRavenclaw[] studentsFacultyRavenclaw) {
        System.out.println("studentsFacultyRavenclaw.length = " + studentsFacultyRavenclaw.length);
        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
            FacultyRavenclaw facultyRavenclaw = studentsFacultyRavenclaw[i];
            System.out.println("facultyRavenclaw.getName() = " + facultyRavenclaw.getName());
            System.out.println("facultyRavenclaw.getPowerMagic() = " + facultyRavenclaw.getPowerMagic());
            System.out.println("facultyRavenclaw.getDistanceTransgression() = " + facultyRavenclaw.getDistanceTransgression());
            System.out.println("facultyRavenclaw.getMind() = " + facultyRavenclaw.getMind());
            System.out.println("facultyRavenclaw.getWisdom() = " + facultyRavenclaw.getWisdom());
            System.out.println("facultyRavenclaw.getWit() = " + facultyRavenclaw.getWit());
            System.out.println("facultyRavenclaw.getCreation() = " + facultyRavenclaw.getCreation());
        }
        System.out.println();
    }

    public void print(FacultySlytherin[] studentsFacultySlytherin) {
        System.out.println("studentsFacultySlytherin.length = " + studentsFacultySlytherin.length);
        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
            FacultySlytherin facultySlytherin = studentsFacultySlytherin[i];
            System.out.println("facultySlytherin.getName() = " + facultySlytherin.getName());
            System.out.println("facultySlytherin.getPowerMagic() = " + facultySlytherin.getPowerMagic());
            System.out.println("facultySlytherin.getDistanceTransgression() = " + facultySlytherin.getDistanceTransgression());
            System.out.println("facultySlytherin.getCunning() = " + facultySlytherin.getCunning());
            System.out.println("facultySlytherin.getDetermination() = " + facultySlytherin.getDetermination());
            System.out.println("facultySlytherin.getAmbition() = " + facultySlytherin.getAmbition());
            System.out.println("facultySlytherin.getLustPower() = " + facultySlytherin.getLustPower());
        }
        System.out.println("/");
        System.out.println("Arrays.toString(studentsFacultySlytherin) = " + Arrays.toString(studentsFacultySlytherin));
    }
}
