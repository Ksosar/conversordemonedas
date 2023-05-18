package com.karlo.monedas;


public class Conversion {
    
   Monedas moneda = new Monedas();
   
//   DE COLONES A DOLAR Y VICEVERSA
   public double ColonesADolar(double colones) {
       return (colones / moneda.PRECIO_DOLAR);
   }
   
   public double DolarAColones(double dolar) {
       
       return (dolar * moneda.PRECIO_DOLAR);
   }
   
   
//   DE COLONES A EURO Y VICEVERSA
   public double ColonesAEuro(double colones) {
       return (colones / moneda.PRECIO_EURO);
   }
   
   public double EuroAColones(double euro) {
       return (euro * moneda.PRECIO_EURO);
   }
   
   
//   DE COLONES A LIBRAS Y VICEVERSA
   public double ColonesALibras(double colones) {
       return (colones / moneda.PRECIO_LIBRAS_ESTERLINAS);
   }
   
   public double LibrasAColones(double libras) {
       
       return (libras * moneda.PRECIO_LIBRAS_ESTERLINAS);
   }
   
   
   //   DE COLONES A YEN Y VICEVERSA
   public double ColonesAYen(double colones) {
       return (colones / moneda.PRECIO_YEN_JAPONES);
   }
   
   public double YenAColones(double yen) {
       
       return (yen * moneda.PRECIO_YEN_JAPONES);
   }
   
   
    //   DE COLONES A WON Y VICEVERSA
   public double ColonesAWon(double colones) {
       return (colones / moneda.PRECIO_WON_SURCOREANO);
   }
   
   public double WonAColones(double won) {
       
       return (won * moneda.PRECIO_WON_SURCOREANO);
   }
   
}