import java.util.Arrays;

public class CalculationValues {

    public void calculationFacultyGryffindor(FacultyGryffindor[] studentsFacultyGryffindor) {
        int maxSumFacultyCharacteristicsStudent = 0;
        Integer minSumFacultyCharacteristicsStudent = null;
        Integer markerBestStudentIndex = null;
        Integer markerWorstStudentIndex = null;
        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyGryffindor[i].getNobility() + studentsFacultyGryffindor[i].getBravery() + studentsFacultyGryffindor[i].getHonor();
            if (sumFacultyCharacteristicsStudent > maxSumFacultyCharacteristicsStudent) {
                maxSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerBestStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyGryffindor[i].getNobility() + studentsFacultyGryffindor[i].getBravery() + studentsFacultyGryffindor[i].getHonor();
            if (minSumFacultyCharacteristicsStudent == null || sumFacultyCharacteristicsStudent < minSumFacultyCharacteristicsStudent) {
                minSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerWorstStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
            if (i != markerBestStudentIndex && i != markerWorstStudentIndex) {
            System.out.println(studentsFacultyGryffindor[markerBestStudentIndex].getName() + " лучше, чем " + studentsFacultyGryffindor[i].getName());
                System.out.println(studentsFacultyGryffindor[i].getName() + " лучше, чем " + studentsFacultyGryffindor[markerWorstStudentIndex].getName());
            }
        }

    }
    public void calculationFacultyHufflepuff(FacultyHufflepuff[] studentsFacultyHufflepuff) {
        int maxSumFacultyCharacteristicsStudent = 0;
        Integer minSumFacultyCharacteristicsStudent = null;
        Integer markerBestStudentIndex = null;
        Integer markerWorstStudentIndex = null;
        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyHufflepuff[i].getHardWork() + studentsFacultyHufflepuff[i].getHonesty() + studentsFacultyHufflepuff[i].getLoyalty();
            if (sumFacultyCharacteristicsStudent > maxSumFacultyCharacteristicsStudent) {
                maxSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerBestStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyHufflepuff[i].getHardWork() + studentsFacultyHufflepuff[i].getHonesty() + studentsFacultyHufflepuff[i].getLoyalty();
            if (minSumFacultyCharacteristicsStudent == null || sumFacultyCharacteristicsStudent < minSumFacultyCharacteristicsStudent) {
                minSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerWorstStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
            if (i != markerBestStudentIndex && i != markerWorstStudentIndex) {
                System.out.println(studentsFacultyHufflepuff[markerBestStudentIndex].getName() + " лучше, чем " + studentsFacultyHufflepuff[i].getName());
                System.out.println(studentsFacultyHufflepuff[i].getName() + " лучше, чем " + studentsFacultyHufflepuff[markerWorstStudentIndex].getName());
            }
        }

    }

    public void calculationFacultyRavenclaw(FacultyRavenclaw[] studentsFacultyRavenclaw) {
        int maxSumFacultyCharacteristicsStudent = 0;
        Integer minSumFacultyCharacteristicsStudent = null;
        Integer markerBestStudentIndex = null;
        Integer markerWorstStudentIndex = null;
        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyRavenclaw[i].getMind() + studentsFacultyRavenclaw[i].getWisdom() + studentsFacultyRavenclaw[i].getWit() + studentsFacultyRavenclaw[i].getCreation();
            if (sumFacultyCharacteristicsStudent > maxSumFacultyCharacteristicsStudent) {
                maxSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerBestStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultyRavenclaw[i].getMind() + studentsFacultyRavenclaw[i].getWisdom() + studentsFacultyRavenclaw[i].getWit() + studentsFacultyRavenclaw[i].getCreation();
            if (minSumFacultyCharacteristicsStudent == null || sumFacultyCharacteristicsStudent < minSumFacultyCharacteristicsStudent) {
                minSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerWorstStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
            if (i != markerBestStudentIndex && i != markerWorstStudentIndex) {
                System.out.println(studentsFacultyRavenclaw[markerBestStudentIndex].getName() + " лучше, чем " + studentsFacultyRavenclaw[i].getName());
                System.out.println(studentsFacultyRavenclaw[i].getName() + " лучше, чем " + studentsFacultyRavenclaw[markerWorstStudentIndex].getName());
            }
        }


    }

    public void calculationFacultySlytherin(FacultySlytherin[] studentsFacultySlytherin) {
        int maxSumFacultyCharacteristicsStudent = 0;
        Integer minSumFacultyCharacteristicsStudent = null;
        Integer markerBestStudentIndex = null;
        Integer markerWorstStudentIndex = null;
        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultySlytherin[i].getCunning() + studentsFacultySlytherin[i].getDetermination() + studentsFacultySlytherin[i].getAmbition() + studentsFacultySlytherin[i].getResourcefulness() + studentsFacultySlytherin[i].getLustPower();
            if (sumFacultyCharacteristicsStudent > maxSumFacultyCharacteristicsStudent) {
                maxSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerBestStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
            int sumFacultyCharacteristicsStudent = studentsFacultySlytherin[i].getCunning() + studentsFacultySlytherin[i].getDetermination() + studentsFacultySlytherin[i].getAmbition() + studentsFacultySlytherin[i].getResourcefulness() + studentsFacultySlytherin[i].getLustPower();
            if (minSumFacultyCharacteristicsStudent == null || sumFacultyCharacteristicsStudent < minSumFacultyCharacteristicsStudent) {
                minSumFacultyCharacteristicsStudent = sumFacultyCharacteristicsStudent;
                markerWorstStudentIndex = i;
            }
        }
        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
            if (i != markerBestStudentIndex && i != markerWorstStudentIndex) {
                System.out.println(studentsFacultySlytherin[markerBestStudentIndex].getName() + " лучше, чем " + studentsFacultySlytherin[i].getName());
                System.out.println(studentsFacultySlytherin[i].getName() + " лучше, чем " + studentsFacultySlytherin[markerWorstStudentIndex].getName());
            }
        }

        public void compareAnyStudents(HogwartsStudent second) {
            if (this.getMagicPower() > second.getMagicPower()) {
                System.out.println(this.getName() + " is stronger than " + second.getName());
            } else if (this.getMagicPower() == second.getMagicPower()) {
                System.out.println(this.getName() + " is equal in power to " + second.getName());
            } else {
                System.out.println(second.getName() + " is stronger than " + this.getName());
            }
            if (this.getTransgressionDistance() > second.getTransgressionDistance()) {
                System.out.println(this.getName() + " goes further than  " + second.getName());
            } else if (this.getTransgressionDistance() == second.getTransgressionDistance()) {
                System.out.println(this.getName() + " goes as far as " + second.getName());
            } else {
                System.out.println(second.getName() + " goes further than  " + this.getName());
            }
        }

    }

}


//    public void calculationSchoolHogwarts(FacultyGryffindor[] studentsFacultyGryffindor, FacultyHufflepuff[] studentsFacultyHufflepuff, FacultyRavenclaw[] studentsFacultyRavenclaw, FacultySlytherin[] studentsFacultySlytherin) {
//        int numberStudents = studentsFacultyGryffindor.length + studentsFacultyHufflepuff.length + studentsFacultyRavenclaw.length + studentsFacultySlytherin.length;
//        Object[] studentSchoolHogwarts = new Object[numberStudents];
//        for (int i = 0; i < studentsFacultyGryffindor.length; i++) {
//            studentSchoolHogwarts[i] = studentsFacultyGryffindor[i];
//        }
//        int countIndexStudentSchoolHogwarts = studentSchoolHogwarts.length - studentsFacultyGryffindor.length;
//        for (int i = 0; i < studentsFacultyHufflepuff.length; i++) {
//            studentSchoolHogwarts[countIndexStudentSchoolHogwarts + i] = studentsFacultyHufflepuff[i];
//        }
//        countIndexStudentSchoolHogwarts = studentSchoolHogwarts.length - studentsFacultyGryffindor.length - studentsFacultyHufflepuff.length;
//        for (int i = 0; i < studentsFacultyRavenclaw.length; i++) {
//            studentSchoolHogwarts[countIndexStudentSchoolHogwarts + i] = studentsFacultyRavenclaw[i];
//        }
//        countIndexStudentSchoolHogwarts = studentSchoolHogwarts.length - studentsFacultyGryffindor.length - studentsFacultyHufflepuff.length - studentsFacultyRavenclaw.length;
//        for (int i = 0; i < studentsFacultySlytherin.length; i++) {
//            studentSchoolHogwarts[countIndexStudentSchoolHogwarts + i] = studentsFacultySlytherin[i];
//        }
//        System.out.println("Arrays.toString(studentSchoolHogwarts) = " + Arrays.toString(studentSchoolHogwarts));
//    }
//}

