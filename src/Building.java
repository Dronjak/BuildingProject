import static java.lang.Math.abs;

public class Building {
    private Eleveator E1;
    private Eleveator E2;
    private Eleveator E3;


    public Building(Eleveator E1, Eleveator E2, Eleveator E3){
        this.E1 = E1;
        this.E2 = E2;
        this.E3 = E3;
    }
    public void smartButton(int floor){
        Eleveator temp;
        if ( Math.abs(floor - E1.getCurrentFloor() ) > Math.abs(floor - E2.getCurrentFloor()) || E1.isBroken() ){
            temp = E2;
        }else {
            temp = E1;
        }

        if ( Math.abs(floor - temp.getCurrentFloor() ) > Math.abs(floor - E3.getCurrentFloor()) || E2.isBroken() ){
            temp = E3;
        }

        temp.call(floor);
    }

    public String toString(){
        String str;
        str = "Elevator1 is on the floor :" + E1.getCurrentFloor() + "  Elevator2 is on the floor :" + E2.getCurrentFloor() +
                " Elevator3 is on the floor :" + E3.getCurrentFloor();

        return str;

    }
}
