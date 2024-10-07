import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

interface Borrowable {
    void borrowDate(LocalDate borrowDate);
    void finePolicy(LocalDate borrowDate);
}


class Book implements Borrowable {
    private final int borrowingDuration = 10;
    private final int finePerDay = 5;       

    @Override
    public void borrowDate(LocalDate borrowDate) {
        System.out.println("Book borrowed on: " + borrowDate);
    }

    @Override
    public void finePolicy(LocalDate borrowDate) {
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(borrowDate, today);

        if (daysBetween > borrowingDuration) {
            long overdueDays = daysBetween - borrowingDuration;
            int fine = (int) (overdueDays * finePerDay);
            System.out.println("Book is overdue by " + overdueDays + " days. Fine: Rs." + fine);
        } else {
            System.out.println("Book is within borrowing period.");
        }
    }
}

class Dvd implements Borrowable {
    private final int borrowingDuration = 5; 
    private final int finePerDay = 10;      
    @Override
    public void borrowDate(LocalDate borrowDate) {
        System.out.println("DVD borrowed on: " + borrowDate);
    }

    @Override
    public void finePolicy(LocalDate borrowDate) {
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(borrowDate, today);

        if (daysBetween > borrowingDuration) {
            long overdueDays = daysBetween - borrowingDuration;
            int fine = (int) (overdueDays * finePerDay);
            System.out.println("DVD is overdue by " + overdueDays + " days. Fine: Rs." + fine);
        } else {
            System.out.println("DVD is within borrowing period.");
        }
    }
}


class Magazine implements Borrowable {
    private final int borrowingDuration = 7;
    private final int finePerDay = 3;    

    @Override
    public void borrowDate(LocalDate borrowDate) {
        System.out.println("Magazine borrowed on: " + borrowDate);
    }

    @Override
    public void finePolicy(LocalDate borrowDate) {
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(borrowDate, today);

        if (daysBetween > borrowingDuration) {
            long overdueDays = daysBetween - borrowingDuration;
            int fine = (int) (overdueDays * finePerDay);
            System.out.println("Magazine is overdue by " + overdueDays + " days. Fine: Rs." + fine);
        } else {
            System.out.println("Magazine is within borrowing period.");
        }
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
       
        LocalDate borrowDate = LocalDate.of(2023, 9, 20); 
 
        Borrowable book = new Book();
        book.borrowDate(borrowDate);
        book.finePolicy(borrowDate);

 
        Borrowable dvd = new Dvd();
        dvd.borrowDate(borrowDate);
        dvd.finePolicy(borrowDate);

        Borrowable magazine = new Magazine();
        magazine.borrowDate(borrowDate);
        magazine.finePolicy(borrowDate);
    }
}