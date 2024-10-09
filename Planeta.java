import javax.swing.JOptionPane;

public class Planeta {
    private String nombrePlaneta;
    private int cantidadSatelites;
    private double masaPlaneta; 
    private double volumenPlaneta;
    private int diametroPlaneta; 
    private double distanciaSol;
    private boolean esVisibleDesdeTierra;

    public Planeta(String nombrePlaneta, int cantidadSatelites, double masaPlaneta, double volumenPlaneta, int diametroPlaneta, double distanciaSol, boolean esVisibleDesdeTierra) {
        this.nombrePlaneta = nombrePlaneta;
        this.cantidadSatelites = cantidadSatelites;
        this.masaPlaneta = masaPlaneta;
        this.volumenPlaneta = volumenPlaneta;
        this.diametroPlaneta = diametroPlaneta;
        this.distanciaSol = distanciaSol;
        this.esVisibleDesdeTierra = esVisibleDesdeTierra;
    }

    public double calcularDensidad() {
        return this.masaPlaneta / this.volumenPlaneta;
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre del Planeta: " + this.nombrePlaneta + "\n" +
                         "Cantidad de Satélites: " + this.cantidadSatelites + "\n" +
                         "Masa: " + this.masaPlaneta + " kg\n" +
                         "Volumen: " + this.volumenPlaneta + " m^3\n" +
                         "Diámetro: " + this.diametroPlaneta + " km\n" +
                         "Distancia al Sol: " + this.distanciaSol + " km\n" +
                         "Visible desde la Tierra: " + this.esVisibleDesdeTierra + "\n" +
                         "Densidad: " + calcularDensidad() + " kg/m^3";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
