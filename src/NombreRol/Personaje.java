package NombreRol;

public class Personaje{

    private String nombre;
    private Rol rol;
    private Habilidad habilidad;

    public Personaje(String nombre, Rol rol, Habilidad habilidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.habilidad = habilidad;
    }

    public String getNombre(){
        return nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    @Override
    public String toString() {
        return nombre + " - " +
                rol + "\n" +
                habilidad;
    }
}
