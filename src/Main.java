import java.util.Random;

public class Main {

    private static Random random = new java.util.Random();

    public static int generatorCharacteristicValue() {
        int minimumScore = 1;
        return random.nextInt(100) + minimumScore;
    }

    public static void main(String[] args) {
        FacultyGryffindor[] studentsFacultyGryffindor = {
                new FacultyGryffindor("Гарри Поттер", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyGryffindor("Гермиона Грейнджер", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyGryffindor("Рон Уизли", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue())
        };
        FacultyHufflepuff[] studentsFacultyHufflepuff = {
                new FacultyHufflepuff("Драко Малфой", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyHufflepuff("Грэхэм Монтегю", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyHufflepuff("Грегори Гойл", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue())
        };
        FacultyRavenclaw[] studentsFacultyRavenclaw = {
                new FacultyRavenclaw("Захария Смит", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyRavenclaw("Седрик Диггори", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultyRavenclaw("Джастин Финч-Флетчли", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue())
        };
        FacultySlytherin[] studentsFacultySlytherin = {
                new FacultySlytherin("Чжоу Чанг", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultySlytherin("Падма Патил", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue()),
                new FacultySlytherin("Маркус Белби", generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue(), generatorCharacteristicValue())
        };
        PrintService printService = new PrintService();
        printService.print(studentsFacultyGryffindor);
        printService.print(studentsFacultyHufflepuff);
        printService.print(studentsFacultyRavenclaw);
        printService.print(studentsFacultySlytherin);

        CalculationValues calculationValues = new CalculationValues();
        calculationValues.calculationFacultyGryffindor(studentsFacultyGryffindor);
        calculationValues.calculationFacultyHufflepuff(studentsFacultyHufflepuff);
        calculationValues.calculationFacultyRavenclaw(studentsFacultyRavenclaw);
        calculationValues.calculationFacultySlytherin(studentsFacultySlytherin);
//        calculationValues.calculationSchoolHogwarts(studentsFacultyGryffindor, studentsFacultyHufflepuff, studentsFacultyRavenclaw, studentsFacultySlytherin);

    }
    hermione.compareAnyStudents(ron);
}