package javaapplication1;

import javax.swing.JOptionPane;

/*
Clase modelo IMC encapsulada
y con dos constructores
1. Agregar a los atributos modificadores de acceso private
2. Por cada atributo implementar un metodo get (getters)
3. Por cada atributo implementar un metodo set (setters)
*/
public class Imc {
    private float peso;
    private float altura;
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String calcular(){
        float imc=peso/(altura*altura);
        return "Tu imc es: "+imc;
    }
}
