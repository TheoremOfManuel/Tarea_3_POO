
package Entidad;


public class Soluciones {
    private double a,b,c;

    public Soluciones(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Soluciones() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public static double determinante(Soluciones solucion){
        return Math.pow(solucion.getB(), 2) - 4*solucion.getA()*solucion.getC();
    }
}
