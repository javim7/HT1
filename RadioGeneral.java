/*
Interfaz
Andrea Lam, 20102
Javier Mombiela, 20067
Ultima Modificación: 18/01/21

Interfaz de la radio
Esta clase es utilizada para poder saber que metodos van a ser necesarios en el programa.

*/

public interface RadioGeneral {

    boolean isON();
  
    void encender();
  
    void apagar();
    
    void incrementar();
  
    boolean asignar(int pos);
  
    boolean emisora(int pos);
  
    void frecuencia();
  
  }