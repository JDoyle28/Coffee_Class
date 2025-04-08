
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

public class SimpleCoffeeScheduler {
    public static void main(String[] args) {

        CoffeeClass team = new CoffeeClass();
        // Just some simple metadata lists for easy input
        // Name, Coffee, Price
        team.addMember(new Coworker("Bob", "Black", 3));
        team.addMember(new Coworker("Alice", "Mocha Late", 2));
        team.addMember(new Coworker("Mary", "Black Iced", 6));
        team.addMember(new Coworker("Jared", "Carmel Late", 3));
        team.addMember(new Coworker("Allen", "Double Espresso", 4));
        team.addMember(new Coworker("Timmy", "Iced Late", 5));

        System.out.println();

        ArrayList<String> wholeTeam = team.getMembers();
        ArrayList<String> wholeDebts = team.getDebts();

        // Create a new JFrame.
        JFrame frame = new JFrame("Coffee Coordinator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        JPanel panelHalf = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel teamLabel = new JLabel(wholeTeam.toString());
        JLabel teamdebtsLabel = new JLabel(wholeDebts.toString());

        JLabel nameLabel = new JLabel("Name:");
        JLabel coffeeLabel = new JLabel("Coffee:");
        JLabel priceLabel = new JLabel("Price:");

        JTextField nameField = new JTextField(20); // 20 columns wide
        JTextField coffeeField = new JTextField(20); // 20 columns wide
        JTextField priceField = new JTextField(20); // 20 columns wide

        // Add components to the panel
        panel.add(teamLabel);
        panelHalf.add(teamdebtsLabel);

        panel2.add(nameLabel);
        panel2.add(nameField);
        panel2.add(coffeeLabel);
        panel2.add(coffeeField);
        panel2.add(priceLabel);
        panel2.add(priceField);

        // Create button
        JButton button = new JButton("Add Team Member");
        button.addActionListener(e -> {
            Coworker temp = new Coworker(nameField.getText(), coffeeField.getText(),
                    Integer.parseInt(priceField.getText()));
            team.addMember(temp);
            teamLabel.setText(team.getMembers().toString());
            teamdebtsLabel.setText(team.getDebts().toString());
        });
        panel2.add(button);

        // Calculate next buyer button
        JLabel currentBuyer = new JLabel(team.todaysBuyer());
        JButton nextBuyerButton = new JButton("Calculate next buyer!");
        nextBuyerButton.addActionListener(e -> {
            currentBuyer.setText(team.todaysBuyer());
            teamLabel.setText(team.getMembers().toString());
            teamdebtsLabel.setText(team.getDebts().toString());
        });
        panel3.add(currentBuyer);
        panel3.add(nextBuyerButton);

        // Add the panel to the frame
        mainPanel.add(panel);
        mainPanel.add(panelHalf);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        frame.getContentPane().add(mainPanel);
        // Set the size of the frame and make it visible.
        frame.setSize(320, 800);
        frame.setVisible(true);
    }
}