package lab211_day1;

public class Menu {
    protected void ShowMenu(String requestOne, String requestTwo) {
        System.out.println("=========== Menu =============");
        System.out.println("1." + requestOne);
        System.out.println("2." + requestTwo);
        System.out.println("3. Exit.");
        System.out.println("------------------------------");
    }
}
