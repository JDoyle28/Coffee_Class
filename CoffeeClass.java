import java.util.ArrayList;

public class CoffeeClass {
    // general team information
    private ArrayList<Coworker> members;
    private Coworker todaysBuyer;
    private int totalPrice;

    // constructor to create an instance of this class, i.e. just one team
    public CoffeeClass() {
        ArrayList<Coworker> myList = new ArrayList<>();
        this.members = myList;
        this.totalPrice = getTotalPrice(myList);
    }

    // adds a team member to the this instance, i.e. this team
    public void addMember(Coworker newMember) {
        this.members.add(newMember);
        if (this.todaysBuyer == null) {
            this.todaysBuyer = newMember;
        }
        this.totalPrice = getTotalPrice(this.members);
        System.out.println("A new team member!");
        System.out.println(newMember.name);

    }

    // rotates through the list of team members and returns todays buyuer
    // if the list is at the end we start over again!
    public String todaysBuyer() {

        // add todays price to their debt
        for (Coworker i : this.members) {
            i.addDebt(i.price);
        }

        Coworker todays = getLargestDebt();
        // we have the largest. now we need to iterate over subracting or adding
        for (Coworker i : this.members) {
            if (i.debt == todays.debt) { // subtract money because they are paying
                i.subDebt(this.totalPrice);
            }
        }
        System.out.println("Todays buyer is: " + todays.name);
        this.todaysBuyer = todays;
        return todays.name;
    }

    private Coworker getLargestDebt() {
        Coworker todays = this.todaysBuyer;
        // find largest debt
        for (Coworker i : this.members) {
            if (i.getDebt() > todays.getDebt()) {
                todays = i;
            }
        }
        return todays;
    }

    private int getTotalPrice(ArrayList<Coworker> t) {
        int count = 0;
        for (Coworker i : t) {
            count += i.price;
        }
        return count;
    }

    public ArrayList<String> getMembers() {
        ArrayList<String> names = new ArrayList<>();
        for (Coworker i : this.members) {
            names.add(i.name);
        }
        return names;
    }

    public ArrayList<String> getDebts() {
        ArrayList<String> names = new ArrayList<>();
        for (Coworker i : this.members) {
            // System.out.println(i.getDebt());
            names.add(i.getDebt().toString());
        }
        return names;
    }

}
