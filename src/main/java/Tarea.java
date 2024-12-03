public class Tarea {
    private String titulo;
    private String descripcion;

    public void setTitulo(String titulo) {
        if (titulo == null) {
            throw new NullPointerException("El título no puede ser nulo");
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void metodoInutil() {
        System.out.println("Este método no hace nada relevante.");
    }
}
