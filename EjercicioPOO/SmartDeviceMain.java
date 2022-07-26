package EjercicioPOO;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartPhone iPhone13 = new SmartPhone("Apple", "iPhone", "IOS", 0.2, 256, true, "HD", true);
        System.out.println(iPhone13);
        System.out.println(iPhone13.marca);
        System.out.println(iPhone13.modelo);
        System.out.println(iPhone13.sistemaOperativo);
        System.out.println(iPhone13.peso);
        System.out.println(iPhone13.almacenamientoGigas);
        System.out.println(iPhone13.waterResistant);
        System.out.println(iPhone13.resolucionPantalla);
        System.out.println(iPhone13.conectividad5G);


        SmartWatch Forerunner945 = new SmartWatch("Garmin", "Forerunner945", "Android", 0.1, 128, true, false, false);
        System.out.println(Forerunner945);
    }
}
