public class FacultySlytherin extends SchoolHogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;

    public FacultySlytherin(String name, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(name, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    @Override
    public String toString() {
        return "Факультет Слизерин." +
                " Имя: " + getName() +
                ", сила магии: " + getPowerMagic() +
                ", расстояние трансгрессии: " + getDistanceTransgression() +
                ", хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + lustPower;
    }

    public static void calculationFacultySlytherin(FacultySlytherin[] studentsFacultySlytherin) {
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
}
