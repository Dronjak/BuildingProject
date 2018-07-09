public class Eleveator {

    private boolean isBroken;
    private int currentFloor;

    public Eleveator() {
        this.isBroken = false;
        this.currentFloor = 0;
    }

    public Eleveator(boolean isBroken, int currentFloor) {
        this.isBroken = isBroken;
        this.currentFloor = currentFloor;
    }

    public void call(int floor){
        if(floor >= 0 && floor <=20){
            currentFloor = floor;
        }

    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public boolean isBroken(){
        return isBroken;
    }


}
