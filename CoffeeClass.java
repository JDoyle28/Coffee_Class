import java.util.ArrayList;
import java.util.List;

public class CoffeeClass {
    private ArrayList<List<String>> members;
    private int todaysBuyer;

    public CoffeeClass() {
        // Initialization code - add 7 members of the team
        ArrayList<List<String>> myList = new ArrayList<>();
        this.members = myList;
        this.todaysBuyer = 0;
    }

    public String todaysBuyer() {
        int length = this.members.size();
        if (this.todaysBuyer >= length - 1) {
            this.todaysBuyer = 0;
        } else {
            this.todaysBuyer += 1;
        }

        ArrayList<String> today = new ArrayList<>(members.get(this.todaysBuyer));
        System.out.println(today.get(0) + " will be buying coffee today!");

        return today.get(0);
    }

    public void addMember(String[] newMember) {
        ArrayList<String> member = new ArrayList<>();
        member.add(newMember[0]);
        member.add(newMember[1]);
        member.add(newMember[2]);
        members.add(member);
    }

    public ArrayList<List<String>> getMembers() {
        return this.members;
    }

}
