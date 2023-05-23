package demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String ms = "13/05/2004";
        LocalDate ld1 = LocalDate.now();   //hiên giờ hiện tại trên hệ thông (không phải cái mình nhập)
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2); //cộng thêm 2 ngày
        System.out.println(ld2);
        LocalDate ld3 = ld1.plusWeeks(3);  //cộng thêm 3 tuần
        System.out.println(ld3);
        LocalDate ld4 = ld1.minusDays(3);
        System.out.println(ld4);
        String bth = "2003-08-29";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());
        LocalDate ld6 = LocalDate.of(2004,8,15);
        System.out.println(ld6);

        LocalDateTime lt1 = LocalDateTime.now();
        LocalDateTime lt2 = lt1.plusMinutes(5);
        LocalDateTime lt3 = lt1.minusMinutes(3);

    }
}
