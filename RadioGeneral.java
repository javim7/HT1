package HT1_Radio;
/*
Interfaz
Andrea Lam, 20102
Javier Mombiela, 20067
Ultima Modificación: 18/01/21

Interfaz de la radio
Esta clase es utilizada para poder saber que metodos van a ser necesarios en el programa.

*/

public interface RadioGeneral { //creando la interfaz de la radio

    boolean isON(); //metodo para asegurar que la radio este encendida
  
    void encender(); //metodo para poder encender la radio
  
    void apagar(); //metodo para poder apagar la radio
    
    void incrementar(); //meotodo para avanzar en el dial de emisoras
  
    boolean asignar(int pos); //metodo para asignar emisoreas a cualquiera de los 12 botones
  
    boolean emisora(int pos); //metodo para seleccionar uno de esos botones con sus respectivas emisoras
  
    void frecuencia(); //metodo para cambiar entre am y fm
  
  }