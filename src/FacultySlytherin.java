public class FacultySlytherin extends SchoolHogwarts{
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
        return "FacultySlytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower +
                '}';
    }
}
