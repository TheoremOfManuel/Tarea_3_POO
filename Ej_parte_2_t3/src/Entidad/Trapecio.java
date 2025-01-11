
package Entidad;

/**
 *
 * @author mtang
 */
public class Trapecio {
    int a,b,c,d,h;
   

    public Trapecio(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    
    
    public double calcularArea(){
        return h/2*(b+d);
    }
    
    public double calcularPerimetro(){
        return a+b+c+d;
    }
}
