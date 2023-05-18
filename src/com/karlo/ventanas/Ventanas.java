package com.karlo.ventanas;
import javax.swing.JOptionPane;

public class Ventanas {
    
    private final String TITULO_JOPTION = "Conversor de Monedas";
   
    
    public void MessageBox(String message, int icon) 
    {
        JOptionPane.showMessageDialog(null, message, TITULO_JOPTION, icon);
    }
    
    
    public String ComboBoxDialog(String message, int button, String[] data) 
    {
        return (String) JOptionPane.showInputDialog(null, // Parametro incial por defecto
            message,                // Mensaje de la Ventana
            TITULO_JOPTION,         // Titulo de la Ventana
            button,                 // Botones por defecto
            null,                   // Icono 
            data,                   // Accediendo al array 
            data[0]                 // valor predeterminado 
        );  
    }
    
    
    public String InputBoxDialog(String message, int icon)
    {
        return JOptionPane.showInputDialog(null, message, TITULO_JOPTION, icon);
    }
    
    
    public boolean fieldEmpty(String... campos) 
    {
        for (String campo : campos) {
            if (campo.equals("")) {
                return true;
            }
        }
        
        return false;
    }
    
}
