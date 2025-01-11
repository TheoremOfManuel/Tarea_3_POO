/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author mtang
 */
public class Rombo {
    int diagonalMayor;
    int diagonalMenor;
    int lado;

    public Rombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    
    public double calcularArea(){
        return diagonalMayor*diagonalMenor/2;
    }
    
    public double calcularPerimetro(){
        return lado*4;
    }
}
