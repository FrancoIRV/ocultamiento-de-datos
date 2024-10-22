package com.avance1;
import java.util.Calendar;


public class FechaActual {
    String tiempoActual;
    public int dia;
    private int mes;
    protected int año;


    public void imprimirFechaActual() {
        Calendar calendario = Calendar.getInstance();
        tiempoActual = calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND);  /* convierto los enteros a una string*/
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH) + 1; /* se le suma 1 ya que parte del 0 */
        año = calendario.get(Calendar.YEAR);
        System.out.println("Hora:" + " " + tiempoActual);
        System.out.println("Fecha:" + " " + mes + " " + dia + " " + año); /* imprimo la fecha y hora */

        }
}
