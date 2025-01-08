
package Entidad;

public class Empleado {
    private String nombre; 
    private double salario;
    private int horas;
    
    //constructores

    public Empleado() {
    }

    public Empleado(String nombre, int horas, double salario) {
        this.nombre = nombre;
        this.horas = horas;
        this.salario = salario;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    public static double salariofinal(Empleado empleado){
        return empleado.getHoras() * empleado.getSalario();
    }
}
