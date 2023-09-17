public class FacultyHufflepuff extends SchoolHogwarts{
    private int hardWork;
    private int honesty;
    private int loyalty;

    public FacultyHufflepuff(String name, int powerMagic, int distanceTransgression, int hardWork, int honesty, int loyalty) {
        super(name, powerMagic, distanceTransgression);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй." +
                " Имя: " + getName() +
                ", сила магии: " + getPowerMagic() +
                ", расстояние трансгрессии: " + getDistanceTransgression() +
                ", трудолюбие: " + hardWork +
                ", честность: " + honesty +
                ", верность: " + loyalty;
    }

    public static void calculationFacultyHufflepuff(FacultyHufflepuff[] studentsFacultyHufflepuff) {
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
}
