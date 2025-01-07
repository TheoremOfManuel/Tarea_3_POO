
package Entidad;


public class Empleado {
    private String id;
    private String nombres;
    private double horas;
    private double valorHora;
    private double porcRetencion;
    private double salarioBruto;
    private double salarioNeto;
    //constructorores
    public Empleado(){}
    public Empleado(String id, String nombres, double horas, double valorHora, double porcRetencion, double salarioBruto, double salarioNeto) {
        this.id = id;
        this.nombres = nombres;
        this.horas = horas;
        this.valorHora = valorHora;
        this.porcRetencion = porcRetencion;
        this.salarioBruto = salarioBruto;
        this.salarioNeto = salarioNeto;
     }
    //getters y setters
    public String getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }
    public double getHoras() {
        return horas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public double getPorcRetencion() {
        return porcRetencion;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public double getSalarioNeto() {
        return salarioNeto;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void setPorcRetencion(double porcRetencion) {
        this.porcRetencion = porcRetencion;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
    public double salarioBruto(Empleado empleado1){
        double salarioBruto = empleado1.getHoras() * empleado1.getValorHora();
        return salarioBruto;
    }
    
    public double salarioNeto(Empleado empleado1){
         double salarioNeto = empleado1.getSalarioBruto() - 
                (empleado1.getSalarioBruto()*empleado1.getPorcRetencion()/100);
        return salarioNeto;
    }
    
}
