public class Main {

    public static void main(String[] args) {

        Eleveator E1 = new Eleveator(false, 0);
        Eleveator E2 = new Eleveator(false,10);
        Eleveator E3 = new Eleveator(false,25);

        Building building = new Building(E1,E2,E3);

        building.smartButton(6);

        System.out.println(building);


    }
}
