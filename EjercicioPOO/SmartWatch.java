package EjercicioPOO;

public class SmartWatch extends SmartDevice{

    boolean touchScreen;
    boolean llamadas;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String sistemaOperativo, double peso, int almacenamientoGigas, boolean waterResistant, boolean touchScreen, boolean llamadas) {
        super(marca, modelo, sistemaOperativo, peso, almacenamientoGigas, waterResistant);
        this.touchScreen = touchScreen;
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return  "El smartwatch es " +
                marca + " " +
                modelo +
                ", sistemaOperativo " + sistemaOperativo +
                ", pesa " + peso +
                " y tiene una capacidad de " + almacenamientoGigas;
    }
}
