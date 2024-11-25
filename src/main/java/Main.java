import ru.netology.cycles1.services.HolidayService;

public class Main {

    public static void main(String[] args) {
        HolidayService service = new HolidayService();

        int expected = 3;
        int actual = service.calcHoliday(10_000, 3_000, 20_000);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 2;
        actual = service.calcHoliday(100_000, 60_000, 150_000);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}