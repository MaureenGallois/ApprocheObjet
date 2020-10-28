package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {
        Date aujourdhui = new Date();
        Date newDate = new Date(116, 04, 19, 23, 59, 30);

        SimpleDateFormat format = null;
        SimpleDateFormat format1 = null;

        format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(aujourdhui));

        format1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(format1.format(newDate));





    }
}
