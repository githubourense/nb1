/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *cambio en github
 */
package javaapplication1;

//Codificado por sAfOrAs
import javax.swing.JOptionPane;
public class JavaApplication1
{
    /**
     @param grado grados farenhein
     @return aaaaaaaaaa
    La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente: F - 32 = 1,8 * C
    */
    double FahrenheitCelsius(double grado)
    {
        int i = 0;
        double gCelsius=(grado-32)/1.8;
        return gCelsius;        
    }
 
    double CelsiusFahrenheit(double grado)
    {
        double gFahrenheit=(grado*1.8)+32;
        return gFahrenheit;
    }
 
    public static void main(String[] args)
    {
        double grado=0,gCelsius=0,gFahrenheit=0;
        JavaApplication1 temp = new JavaApplication1();
 
        int opcion=0;
        String cadena;
    do{
    cadena=JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit");
    opcion=Integer.parseInt(cadena);
    }while(opcion<1 || opcion>2);
            cadena=JOptionPane.showInputDialog("Ingrese la temperatura: ");
            grado=Double.parseDouble(cadena);
         
    switch(opcion)
        {
 
            case 1: {
                gCelsius=temp.FahrenheitCelsius(grado);
                JOptionPane.showMessageDialog(null," TEMPERATURA: "+gCelsius + " Celsius");
                };break;
                    
                 
            case 2: {
                gFahrenheit=temp.CelsiusFahrenheit(grado);
                JOptionPane.showMessageDialog(null," TEMPERATURA: "+gFahrenheit +" Fahrenheit");
                };break;
        }
 
    }
}
