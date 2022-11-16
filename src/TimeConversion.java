import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        DateFormat df = new SimpleDateFormat("hh:mm:ss aa07:05:45PM");
        DateFormat odf = new SimpleDateFormat("HH:mm:ss");
        Date date=df.parse(s);
        System.out.println(odf.format(date));
    }
}
