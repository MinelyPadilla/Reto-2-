public class Principal {
    public static void main (String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.00);
        Entrada entrada2 = new Entrada("Concierto", 270.00);
        Entrada entrada3 = new Entrada("Galeria", 350.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }

}
