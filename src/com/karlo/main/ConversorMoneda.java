package com.karlo.main;

import javax.swing.JOptionPane;

import com.karlo.monedas.*;
import com.karlo.ventanas.*;

public class ConversorMoneda {

    public static void main(String[] args) {

//        Variables Globales
        String opcionElejida;
        double colones = 0;
        double dolar = 0, euro = 0, libra_esterlina = 0, yen_japones = 0, won_surcoreano = 0;
        int inicio = 0;
        double dineroConvertido = 0;
        String monedaConvertir;
        
//        Clases iniciales
        Ventanas ventana = new Ventanas();
        Conversion convertir = new Conversion();

//        Arrays de obj
        String[] opcionesDeMenu = {
            "Seleccione...",
            "Conversor de Moneda"
        };

        String[] tipoDeMonedas = {
            "De colones a Dolar",
            "De colones a Euro",
            "De colones a Libras",
            "De colones a Yen",
            "De colones a Won",
            
            "De Dolar a colones",
            "De Euro a colones",
            "De Libras a colones",
            "De Yen a colones",
            "De Won a colones"
        };

        while (inicio != 1) {
            opcionElejida = ventana.ComboBoxDialog("Seleccione una opción de conversión", -1, opcionesDeMenu);

            if (opcionElejida != null) {
                try {
                    switch (opcionElejida) {
                        case "Conversor de Moneda":
                            String dineroIngresado = ventana.InputBoxDialog("Ingrese la cantidad de dinero que deseas convertir", 3);

                            if (!ventana.fieldEmpty(dineroIngresado)) 
                            {
                                dineroConvertido = Double.parseDouble(dineroIngresado);
                                monedaConvertir = ventana.ComboBoxDialog("Elija la moneda a la que deseas convertir tu dinero", -1, tipoDeMonedas);

                                if (monedaConvertir.equalsIgnoreCase("de colones a dolar")) {
                                    dolar = convertir.ColonesADolar(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + String.format("%.2f", dolar) + " Dolares", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de dolar a colones")) {
                                    colones = convertir.DolarAColones(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + colones + " colones ", 1);
                                }   


                                

                                if (monedaConvertir.equalsIgnoreCase("de colones a euro")) {
                                    euro = convertir.ColonesAEuro(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + String.format("%.2f", euro) + " Euro", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de euro a colones")) {
                                    colones = convertir.EuroAColones(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + colones + " colones ", 1);
                                }   



                                
                                if (monedaConvertir.equalsIgnoreCase("de colones a libras")) {
                                    libra_esterlina = convertir.ColonesALibras(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + String.format("%.2f", libra_esterlina) + " Libras Esterlina", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de libras a colones")) {
                                    colones = convertir.LibrasAColones(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + colones + " colones ", 1);
                                }



                                
                                if (monedaConvertir.equalsIgnoreCase("de colones a yen")) {
                                    yen_japones = convertir.ColonesAYen(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + String.format("%.2f", yen_japones) + " Yen Japónes", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de yen a colones")) {
                                    colones = convertir.YenAColones(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + colones + " colones ", 1);
                                } 




                                if (monedaConvertir.equalsIgnoreCase("de colones a won")) {
                                    won_surcoreano = convertir.ColonesAWon(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + String.format("%.2f", won_surcoreano) + " Won SurCoreanos", 1);
                                }

                                if (monedaConvertir.equalsIgnoreCase("de won a colones")) {
                                    colones = convertir.WonAColones(dineroConvertido);
                                    ventana.MessageBox("Tienes $" + colones + " colones ", 1);
                                }
                            } else {
                                ventana.MessageBox("Debe ingresar un valor, para continuar", 2);
                            }
                            break;

                        default:
                            ventana.MessageBox("Ups opción no valida, intente nuevamente", 2);
                    }

                } catch (Exception e) {
                    ventana.MessageBox("Error, Verifique el formato de la cantidad a convertir", 0);
                    System.err.println(e.getMessage());
                }
            }
            
            
            inicio = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Conversor de Monedas", JOptionPane.YES_NO_CANCEL_OPTION);
            if (inicio == 1 || inicio == 2) {
                ventana.MessageBox("Programa terminado", 1);
                break;
            }
        }
    }
}
