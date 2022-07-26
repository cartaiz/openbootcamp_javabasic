package EjercicioPOO;

public class SmartPhone extends SmartDevice {

    String resolucionPantalla;
    boolean conectividad5G;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistemaOperativo, double peso, int almacenamientoGigas, boolean waterResistant, String resolucionPantalla, boolean conectividad5G) {
        super(marca, modelo, sistemaOperativo, peso, almacenamientoGigas, waterResistant);
        this.resolucionPantalla = resolucionPantalla;
        this.conectividad5G = conectividad5G;
    }

    @Override
    public String toString() {
        return  "El smart phone es " +
                marca + " " +
                modelo +
                ", sistemaOperativo " + sistemaOperativo +
                ", pesa " + peso +
                " y tiene una capacidad de " + almacenamientoGigas;
    }
}
