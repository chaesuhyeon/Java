import java.time.LocalDate;
import java.time.YearMonth;

public class Test1 {
    public static void main(String[] args) {
        LocalDate startDate = YearMonth.of(2024, 3).atDay(1);
        LocalDate endDate = YearMonth.of(2024, 3).atEndOfMonth();
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
    }
}
