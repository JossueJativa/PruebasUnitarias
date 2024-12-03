import java.util.List;
import java.util.ArrayList;

public class GestorTareas {

    private List<Tarea> tareas = new ArrayList<Tarea>();
    private int contadorTareas = 1;

    public void agregarTarea(Tarea tarea1) {
        if (tarea1 == null) {
            tareas.add(new Tarea());
        } else {
            tareas.add(tarea1);
        }
    }

    public synchronized Integer obtenerTotalTareas() {
        return tareas.size();
    }

    public void eliminarTarea(int codigo) {
        if (codigo < 0 || codigo >= tareas.size()) {
            System.out.println("Índice fuera de rango.");
            return;
        }
        tareas.remove(codigo);
    }

    public void bucleIneficiente() {
        for (int i = 0; i < tareas.size(); i++) {
            for (int j = 0; j < tareas.size(); j++) {
                System.out.println("Comparando tareas.");
            }
        }
    }
}
