package home_work_6;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalTime time1 = LocalTime.of(0,1,0);
        LocalDateTime time2 = time.plusMinutes(time1.getMinute());
        System.out.println(time2);
        while (time2.isAfter(LocalDateTime.now())){
        }
        System.out.println(LocalDateTime.now());


        }



}
