public class FacultyRavenclaw extends SchoolHogwarts{
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
        return "FacultyRavenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
}
