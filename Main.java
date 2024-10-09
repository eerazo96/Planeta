public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta planeta2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        planeta1.mostrarInformacion();
        planeta2.mostrarInformacion();
    }
}
