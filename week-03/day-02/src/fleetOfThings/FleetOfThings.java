package fleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class Ok
        // - You have the `Fleet` class OK
        // - You have the `FleetOfThings` class with a `main` method OK
        // - Download those, use those OK
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


Thing thing = new Thing("Get milk");
Thing thing1 = new Thing("Remove the obstacles");
Thing thing2 = new Thing("Stand up");
Thing thing3 = new Thing("Eat lunch");
fleet.add(thing);
fleet.add(thing1);
fleet.add(thing2);
fleet.add(thing3);
thing2.complete();
thing3.complete();

        System.out.println(fleet);
    }
}
