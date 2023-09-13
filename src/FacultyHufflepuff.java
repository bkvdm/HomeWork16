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
        return "FacultyHufflepuff{" +
                "hardWork=" + hardWork +
                ", honesty=" + honesty +
                ", loyalty=" + loyalty +
                '}';
    }
}
