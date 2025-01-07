
package Entidad;

import static java.lang.Math .*;

public class TrianguloEquilatero {
    
    //atributos
    private double lado; 
    private double peri; 
    private double area; 
    private double altura; 
    
    //constructores

    public TrianguloEquilatero() {
    }

    public TrianguloEquilatero(double lado, double peri, double area,double altura) {
        this.lado = lado;
        this.peri = peri;
        this.area = area;
    }
    
    //getters y setters

    public double getLado() {
        return lado;
    }

    public double getPeri() {
        return peri;
    }

    public double getArea() {
        return area;
    }

    public double getAltura() {
        return altura;
    }

    
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    /**
     * Funcion para el perimetro
     * @param t1
     * @return 
     */
    public double perimetro (TrianguloEquilatero  t1){
        t1.setPeri(t1.getLado()*3);
        return t1.getLado()*3;
    }
    
    /**
     * Funcion para el area del traingulo
     * @param t1
     * @return 
     */
    public double area (TrianguloEquilatero t1){
        double area = (double) ( (Math.pow(t1.getLado(), 2) * sqrt(3) )/4) ;
         t1.setArea(area);
        return area;
    }
    
    /**
     * Funcion para la altura
     * @param t1
     * @return 
     */
    public double altura(TrianguloEquilatero t1){
       double altura = (double) (t1.getLado()* sqrt(3))/2 ;
        t1.setAltura(altura);
        return altura;
    }
    
    
    
    
    
    
    
    
}
