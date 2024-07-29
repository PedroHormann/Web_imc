/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 182400138
 */
public class CalculadoraIMC {
    private double peso1;
    private double altura1;
    public String genero;

    public void setPeso1(String peso1) {
        this.peso1 = Double.parseDouble(peso1);
    }

    public void setAltura1(String altura1) {
        this.altura1 = Double.parseDouble(altura1);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public double Calcular()
    {
        double resultado = 0;
        switch (genero) {
            
            case "Masculino":
                resultado = peso1 / (altura1 * altura1); 
                break;
            case "Feminino":
                resultado = peso1 / (altura1 * altura1);
        }
        return resultado;
    }

    public double getPeso1() {
        return peso1;
    }

    public double getAltura1() {
        return altura1;
    }

    public String getGenero() {
        return genero;
    }
    
    
}
