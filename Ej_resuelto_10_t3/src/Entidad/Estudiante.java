/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author mtang
 */
public class Estudiante {
    
    private int NumInscripcion;
    private String Nombres;
    private double Patrimonio;
    private int EstratoSocial;
    private double PagoMatricula;

    public Estudiante() {
    }

    public Estudiante(int NumInscripcion, String Nombres, double Patrimonio, int EstratoSocial) {
        this.NumInscripcion = NumInscripcion;
        this.Nombres = Nombres;
        this.Patrimonio = Patrimonio;
        this.EstratoSocial = EstratoSocial;
        this.PagoMatricula = 50000;
    }

    public int getNumInscripcion() {
        return NumInscripcion;
    }

    public String getNombres() {
        return Nombres;
    }

    public double getPatrimonio() {
        return Patrimonio;
    }

    public int getEstratoSocial() {
        return EstratoSocial;
    }

    public double getPagoMatricula() {
        return PagoMatricula;
    }

    public void setNumInscripcion(int NumInscripcion) {
        this.NumInscripcion = NumInscripcion;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setPatrimonio(double Patrimonio) {
        this.Patrimonio = Patrimonio;
    }

    public void setEstratoSocial(int EstratoSocial) {
        this.EstratoSocial = EstratoSocial;
    }

    public void setPagoMatricula(double PagoMatricula) {
        this.PagoMatricula = PagoMatricula;
    }
    
    public double PagoMatricula(Estudiante est){
        double pagomatricula = 50000;
        if( est.getPatrimonio() >2000000 && est.getEstratoSocial() >3 ){
         pagomatricula = pagomatricula+ 0.03*est.Patrimonio;
     }
        est.setPagoMatricula(pagomatricula);
        return pagomatricula;
    }
    
    
}
