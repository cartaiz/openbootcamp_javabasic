package EjercicioPOO;

public class SmartDevice {

    // atributos
    String marca;
    String modelo;
    String sistemaOperativo;
    double peso;
    int almacenamientoGigas;
    boolean waterResistant;


    // constructores

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo, double peso, int almacenamientoGigas, boolean waterResistant) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.peso = peso;
        this.almacenamientoGigas = almacenamientoGigas;
        this.waterResistant = waterResistant;
    }

}
