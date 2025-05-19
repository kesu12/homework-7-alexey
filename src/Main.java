public class Main {
    public static void main(String[] args) {
        Printer worker = new Worker();
        Printer director = new Director();
        Printer accountant = new Accountant();

        accountant.print();
        director.print();
        worker.print();




    }
}