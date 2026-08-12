import java.time.*;
class Task2{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime td = LocalDateTime.now();
        System.out.println(td);
        System.out.println("Out of 365 today is :"+today.getDayOfYear()+"th Day");
        LocalDate add=today.plusDays(30);
        System.out.println(add);
        Instant now=Instant.now();
        Instant modify=now.plusSeconds(60);
        System.out.println(now);
        System.out.println(modify);
    }
}