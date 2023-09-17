public class SchoolHogwarts extends Student {

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

    public static void compareAnyStudents(SchoolHogwarts studentOne, SchoolHogwarts studentTwo) {
        if (studentOne.getPowerMagic() > studentTwo.getPowerMagic()) {
            System.out.println(studentOne.getName() + " магия сильнее, чем у " + studentTwo.getName());
        } else if (studentOne.getPowerMagic() == studentTwo.getPowerMagic()) {
            System.out.println(studentOne.getName() + " сила магии такая же, как у " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " магия сильнее, чем у " + studentOne.getName());
        }
        if (studentOne.getDistanceTransgression() > studentTwo.getDistanceTransgression()) {
            System.out.println(studentOne.getName() + " трансгрессия идёт дальше, чем у " + studentTwo.getName());
        } else if (studentOne.getDistanceTransgression() == studentTwo.getDistanceTransgression()) {
            System.out.println(studentOne.getName() + " трансгрессия равна трансгрессии " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " трансгрессия идёт дальше, чем у " + studentOne.getName());
        }
    }
}
