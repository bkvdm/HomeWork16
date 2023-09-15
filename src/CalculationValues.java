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
    }

    public void compareAnyStudents(FacultyGryffindor harryPotter, FacultyGryffindor hermioneGranger) {
            if (harryPotter.getPowerMagic() > hermioneGranger.getPowerMagic()) {
                System.out.println(harryPotter.getName() + " магия сильнее, чем у " + hermioneGranger.getName());
            } else if (harryPotter.getPowerMagic() == hermioneGranger.getPowerMagic()) {
                System.out.println(harryPotter.getName() + " сила магии такая же, как у " + hermioneGranger.getName());
            } else {
                System.out.println(hermioneGranger.getName() + " магия сильнее, чем у " + harryPotter.getName());
            }
            if (harryPotter.getDistanceTransgression() > hermioneGranger.getDistanceTransgression()) {
                System.out.println(harryPotter.getName() + " трансгрессия идёт дальше, чем у " + hermioneGranger.getName());
            } else if (harryPotter.getDistanceTransgression() == hermioneGranger.getDistanceTransgression()) {
                System.out.println(harryPotter.getName() + " трансгрессия равна трансгрессии " + hermioneGranger.getName());
            } else {
                System.out.println(hermioneGranger.getName() + " трансгрессия идёт дальше, чем у " + harryPotter.getName());
            }
        }
    }


