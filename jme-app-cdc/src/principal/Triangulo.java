/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 *
 * @author Win
 */
public class Triangulo {
    private final float lado1;
    private final float lado2;
    private final float lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean isTriangulo(){
        return (lado1+lado2)>lado3 && (lado1+lado3)>lado2 && (lado2+lado3)>lado1;
    }
    public String getTipoTriangulo(){
        
        if(isTriangulo()){
            if((lado1==lado2) && (lado2==lado3)) return "Triângulo equilátero";
            if((lado1==lado2) || (lado2==lado3) || (lado3==lado1)) return "Triângulo isósceles";
            if((lado1!=lado2) && (lado2!=lado3)) return "Triângulo escaleno";
        }
        
        return "Não é um triângulo";

    }

}
