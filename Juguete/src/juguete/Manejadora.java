package juguete;

import java.util.ArrayList;
import java.util.List;

public class Manejadora {
    private List<Peluche> peluches;
    private List<FiguraAccion> figurasAccion;

    public Manejadora() {
        peluches = new ArrayList<>();
        figurasAccion = new ArrayList<>();
    }

    public void agregarPeluche(Peluche peluche) {
        peluches.add(peluche);
    }

    public void agregarFiguraAccion(FiguraAccion figuraAccion) {
        figurasAccion.add(figuraAccion);
    }

    public void mostrarInformacionPeluches() {
        System.out.println("===== Información de Peluches =====");
        for (Peluche peluche : peluches) {
            peluche.mostrarInformacion();
            System.out.println("--------------------");
        }
    }

    public void mostrarInformacionFigurasAccion() {
        System.out.println("===== Información de Figuras de Acción =====");
        for (FiguraAccion figuraAccion : figurasAccion) {
            figuraAccion.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}
