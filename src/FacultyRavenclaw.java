public class FacultyRavenclaw extends SchoolHogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public FacultyRavenclaw(String name, int powerMagic, int distanceTransgression, int mind, int wisdom, int wit, int creation) {
        super(name, powerMagic, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Факультет Когтевран." +
                " Имя: " + getName() +
                ", сила магии: " + getPowerMagic() +
                ", расстояние трансгрессии: " + getDistanceTransgression() +
                ", ум: " + mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", творчество: " + creation;
    }

    public static void calculationFacultyRavenclaw(FacultyRavenclaw[] studentsFacultyRavenclaw) {
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
}
