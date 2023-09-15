public class FacultyGryffindor extends SchoolHogwarts{
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
        return "FacultyGryffindor{" +
                "name=" + getName() +
                "PowerMagic=" + getPowerMagic() +
                "getDistanceTransgression=" + getDistanceTransgression() +
                "nobility=" + nobility +
                ", bravery=" + bravery +
                ", honor=" + honor +
                '}';
    }

}
