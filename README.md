# Coffee_Class

Description: A coffee class to track coffee and their prices to associated drinkers and determines today's buyer!

Assumtions: 

I made the assumption that pople would be there everyday ordering the same drink, at the same price. However, the way I set up 
the classes, its simple functionality to add with a little time.

Solution:

So my first goal is to set up the gui and the mechanics for populating our team and the button action for calculating the next buyer.
I've set up classes for both the team and the workers to track their balances. With these classes and methods its easy to do simple logic to
calculate the next in the rotation.

I made this a bit more simple for time and just put the person with the largest balance as the next person to pay, although I understand there is
a "more fair" approach that I could have solved for.

1. Initialize the database with the existing team
2. Create the GUI with swift libraries to display labels and hold the actions that run our methods
3. todaysBuyer method in CoffeeClass has the meaty logic where we update debts and determine the most in debt coworker


Build and Run Instructions:

    Preqrequisite: Basic Java SDK installation

    1. Clone and navigate to the project
    2. Run the two commands and see the schedule in both the GUI and the terminal logs

    javac SimpleCoffeeScheduler.java CoffeeClass.java Coworker.java
    java SimpleCoffeeScheduler



Retroflection:
    I think I may be still miscalculating what a fair schedule looks like here, but I think this demonstrates what I need to. And I'd love 
    to discuss about how I could have done it differently.



