package juguete;

public class Peluche extends Juguete {
    private String tipoPeluche;
    private String color;

    public Peluche(int codigo, String nombre, double precio, String tipoPeluche, String color) {
        super(codigo, nombre, precio);
        this.tipoPeluche = tipoPeluche;
        this.color = color;
    }

    public String getTipoPeluche() {
        return tipoPeluche;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimirInformacionPeluche() {
        System.out.println("Tipo de Peluche: " + tipoPeluche);
        System.out.println("Color: " + color);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        imprimirInformacionPeluche();
    }
}

