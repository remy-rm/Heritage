public class Hangar {
    public static void main(String[] args) {
        Car Clio =new Car("Clio", 100000);
        Boat Titanic = new Boat("Titanic", 100000);
        Boat QueenMary = new Boat("Queen Mary", 100000);
        Car Golf = new Car("Golf", 10000);

        System.out.println(Clio.doStuff());
        System.out.println(Titanic.doStuff());
        System.out.println(QueenMary.doStuff());
        System.out.println(Golf.doStuff());

    }
}