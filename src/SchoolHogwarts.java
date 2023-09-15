public class SchoolHogwarts extends Student{

    private int powerMagic;
    private int distanceTransgression;

    public SchoolHogwarts(String name, int powerMagic, int distanceTransgression) {
        super(name);
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return "SchoolHogwarts{" +
                "name=" + getName() +
                "powerMagic=" + powerMagic +
                ", distanceTransgression=" + distanceTransgression +
                '}';
    }
}
