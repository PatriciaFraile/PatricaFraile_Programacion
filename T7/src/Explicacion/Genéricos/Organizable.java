package Explicacion.Genéricos;

public interface Organizable <T,S>{
    void organizar(T criterio);
    S listar();
}
