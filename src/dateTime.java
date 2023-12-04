import java.util.Calendar;
import java.util.Scanner;

public class dateTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        int dia = sc.nextInt();
        int ano = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes - 1); // Mês começa do zero
        cal.set(Calendar.DAY_OF_MONTH, dia);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String dayName = findDay(dayOfWeek);

        System.out.println(dayName);}
        public static String findDay(int dayOfWeek) {
            String[] names = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
            return names[dayOfWeek - 1];
        }
}
