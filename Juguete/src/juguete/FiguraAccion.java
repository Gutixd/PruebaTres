package juguete;

public class FiguraAccion extends Juguete {
    private String personaje;
    private String material;

    public FiguraAccion(int codigo, String nombre, double precio, String personaje, String material) {
        super(codigo, nombre, precio);
        this.personaje = personaje;
        this.material = material;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void imprimirInformacionFiguraAccion() {
        System.out.println("Personaje: " + personaje);
        System.out.println("Material: " + material);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        imprimirInformacionFiguraAccion();
    }
}
