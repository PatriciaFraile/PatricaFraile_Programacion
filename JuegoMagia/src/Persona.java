public enum Persona {
    persona("Jesus Niño", "Profesor", "CES Juan Pablo", "Entornos de Desarrollo");
    String nombre, profesion, lugarTrabajo, asignatura;

    Persona(String nombre, String profesion, String lugarTrabajo, String asignatura) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.lugarTrabajo = lugarTrabajo;
        this.asignatura = asignatura;
    }

    Persona() {
    }

    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(profesion);
        System.out.println(lugarTrabajo);
        System.out.println(asignatura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
