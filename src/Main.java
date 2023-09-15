import java.util.Random;

public class Main {

    private static Random random = new java.util.Random();

    public static int generatorCharacteristicValue() {
        int minimumScore = 1;
        return random.nextInt(100) + minimumScore;
    }

    public static void main(String[] args) {
        FacultyGryffindor harryPotter = new FacultyGryffindor("Гарри Поттер", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyGryffindor hermioneGranger = new FacultyGryffindor("Гермиона Грейнджер", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyGryffindor ronWeasley = new FacultyGryffindor("Рон Уизли", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());

        FacultyGryffindor[] studentsFacultyGryffindor = {harryPotter, hermioneGranger, ronWeasley};

        FacultyHufflepuff dracoMalfoy = new FacultyHufflepuff("Драко Малфой", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyHufflepuff grahamMontague = new FacultyHufflepuff("Грэхэм Монтегю", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyHufflepuff gregoryGoyle = new FacultyHufflepuff("Грегори Гойл", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());

        FacultyHufflepuff[] studentsFacultyHufflepuff = {dracoMalfoy, grahamMontague, gregoryGoyle};

        FacultyRavenclaw zachariahSmith = new FacultyRavenclaw("Захария Смит", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyRavenclaw cedricDiggory = new FacultyRavenclaw("Седрик Диггори", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultyRavenclaw justinFinchFletchley = new FacultyRavenclaw("Джастин Финч-Флетчли", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());

        FacultyRavenclaw[] studentsFacultyRavenclaw = {zachariahSmith, cedricDiggory, justinFinchFletchley};

        FacultySlytherin zhouChang = new FacultySlytherin("Чжоу Чанг", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultySlytherin padmaPatil = new FacultySlytherin("Падма Патил", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());
        FacultySlytherin marcusBelby = new FacultySlytherin("Маркус Белби", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue());

        FacultySlytherin[] studentsFacultySlytherin = {zhouChang, padmaPatil, marcusBelby};

        PrintService printService = new PrintService();
        printService.print(studentsFacultyGryffindor);
        printService.print(studentsFacultyHufflepuff);
        printService.print(studentsFacultyRavenclaw);
        printService.print(studentsFacultySlytherin);

        CalculationValues calculationValues = new CalculationValues();
        System.out.println();
        System.out.println("Сравнение характеристик студентов школы Хогварда:");
        System.out.println("факультет Гриффиндор:");
        calculationValues.calculationFacultyGryffindor(studentsFacultyGryffindor);
        System.out.println("факультет Пуффендуй:");
        calculationValues.calculationFacultyHufflepuff(studentsFacultyHufflepuff);
        System.out.println("факультет Когтевран:");
        calculationValues.calculationFacultyRavenclaw(studentsFacultyRavenclaw);
        System.out.println("факультет Слизерин:");
        calculationValues.calculationFacultySlytherin(studentsFacultySlytherin);
        System.out.println();
        System.out.println("Cравнение двух студентов по общим, для всех факультетов школы Хогварда, характеристикам:");
        calculationValues.compareAnyStudents(harryPotter, hermioneGranger);
    }
}