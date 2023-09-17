public class FacultyGryffindor extends SchoolHogwarts {
    private int nobility;
    private int bravery;
    private int honor;

    public FacultyGryffindor(String name, int powerMagic, int distanceTransgression, int nobility, int bravery, int honor) {
        super(name, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор." +
                " Имя: " + getName() +
                ", сила магии: " + getPowerMagic() +
                ", расстояние трансгрессии: " + getDistanceTransgression() +
                ", благородство: " + nobility +
                ", храбрость: " + bravery +
                ", честь: " + honor;
    }

    public static void calculationFacultyGryffindor(FacultyGryffindor[] studentsFacultyGryffindor) {
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
}
