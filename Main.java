import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CoffeeClass team = new CoffeeClass();
        // Just some simple metadata lists for easy input
        // Name, Coffee, Price

        team.addMember(new String[] { "Bob", "Black", "3" });
        team.addMember(new String[] { "Jim", "Cappacino", "5" });
        team.addMember(new String[] { "Alice", "Mocha Late", "2" });
        team.addMember(new String[] { "Mary", "Black Iced", "6" });
        team.addMember(new String[] { "Jared", "Carmel Late", "3" });
        team.addMember(new String[] { "Allen", "Double Espresso", "4" });
        team.addMember(new String[] { "Timmy", "Iced Late", "5" });

        ArrayList<List<String>> wholeTeam = team.getMembers();
        System.out.println(wholeTeam);

        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.addMember(new String[] { "Odie", "Sugar Milk", "1" });
        team.addMember(new String[] { "Pam", "Triple Espresso", "9" });
        System.out.println(wholeTeam);
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();
        team.todaysBuyer();

    }
}
