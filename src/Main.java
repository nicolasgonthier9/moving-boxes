public class Main {
    int remainingBoxes = 34;
    int movedBoxes = 0;
    int truckCapacity = 9;


    public static void main(String[] args) {
        Main var = new Main();
        var.run();
    }

    private void run() {
        while (remainingBoxes > 0) {
            remainingBoxes = remainingBoxes - truckCapacity;
            movedBoxes+=9;
            System.out.println("Un voyage de " + truckCapacity + " cartons.");
            System.out.println("Nous avons déplacé " + movedBoxes + " cartons.");
            if (remainingBoxes < 9) {
                truckCapacity = remainingBoxes;
            }
            System.out.println("Il reste encore " + remainingBoxes + " cartons à déplacer.");
        }
    }
}