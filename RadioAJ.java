package HT1_Radio;
/*
Página principal
Andrea Lam, 20102
Javier Mombiela, 20067
Ultima Modificación: 18/01/21

Página principal para la creación del la radio
Este programa tiene como objetivo el crear una simulación de una radio

*/

//importando las clases necesarias externas
//import java.util.*;

public class RadioAJ implements RadioGeneral { //creando la clase Radio que implementa la interfaz 

//creando variables

int[] amEmisoras = new int[12]; //lista para guardar los valores de las emisoras am
double[] fmEmisoras = new double[12]; //lista  para guardas los valores de las emisoras fm
private boolean encendido = false; //estado de la radio de encendido o apagado, apagado por default
private int queFrecuencia = 0; //frecuencia am o fm, am es la default y es 0
private int amEstacion = 530; //estacion am empieza con el valor mas bajo siempre y sube de 10 en 10
private double fmEstacion = 87.9; //estacion fm empieza con el valor mas bajo y va de .2 en .2, es float
boolean asig = false;// viendo si ya se asigno un boton o no

  public RadioAJ() { //creando el constructor de la clase Radio


  }

  
  /** 
   * @return boolean
   */
  //creando los metodos que se utilizaran para hacer que la radio funcione

  //metodo para ver si la radio esta encendida o no y retornar un valor boolean true si si, y viceversa
  public boolean isON() { 

    //retornando el valor de la radio para ver si esta encendido o no
    return encendido;

  }

//metodo para encender la radio en caso de que este apagado
  public void encender() {

    //creando if para ver si la radio esta apagada y asi lograr encenderla
    if(encendido==false)
    {
      //cambiando el valor de encendido a true para que se encienda la radio
      encendido=true;
      System.out.println("Encendiendo la radio...\nEspere un momento por favor...\nLa radio se ha encedido correctamente!");
    } else{
      //mostrando mensaje de error ya que la radio ya esta encendida
      System.out.println("La radio ya estaba encendida! Por favor, elija otra opcion!");
    }

  }
 
  //metodo para apagar la radio en caso de que esta encendido
  public void apagar() {

    //creando if para ver si la radio esta encendida o no
    if(encendido==true) {

      //cambiando a false el valor de encendido para que se apague la radio
      encendido = false;
      System.out.println("Apagando la radio....\nEspere un momento por favor...\nRadio apagada exitosamente!\n");

    } else {

      //mostrando mensaje de error ya que la radio no esta encendida
      System.out.println("Debe encender la radio para poder utilizar esta funcion!");

    }

  }

  //metodo para incrementar la estacion de la radio
  public void incrementar() {

    //creando if para ver si la radio esta encendida o no
    if(encendido==true) {

      if(queFrecuencia==0){ //ver si la frecuencia es am
        System.out.println("Usted estad en la frecuencia: AM");
        if(amEstacion < 1610){ //verificando que no haya llegado al limite
        amEstacion += 10; //sumandole diez a la frecuencia de am
        System.out.println("Su nueva estacion es AM: " +amEstacion);

        } else if(amEstacion >= 1610) { //verificando si ya llego al limite
        amEstacion = 520; //regresando la emisora al inicio
        amEstacion += 10; //sumandole 10 a la emisora am
        System.out.println("Su nueva estacion es AM: " +amEstacion);
        }

      } else if(queFrecuencia==1) {//ver si la frecuencia es fm
          System.out.println("Usted estad en la frecuencia: FM");
          if(fmEstacion < 107.9){ //verificando que no haya llegado al limite
          fmEstacion += 0.2; //sumandole diez a la frecuencia de fm
          System.out.println("Su nueva estacion es FM: " +fmEstacion);

          } else if(fmEstacion >= 107.9) { //verificando si ya llego al limite
          fmEstacion = 87.7; //regresando la emisora al inicio
          fmEstacion += 0.2; //sumandole 10 a la emisora fm
          System.out.println("Su nueva estacion es FM: " +fmEstacion);
          }

      } 

    } else {

      //mostrando mensaje de error ya que la radio no esta encendida
      System.out.println("Debe encender la radio para poder utilizar esta funcion!");

    }

  }


  
  /** 
   * @param pos
   * @return boolean
   */
  //metodo para guardar una emisiora en uno de los 12 botones
  // crea lista para el am y el fm
  // mostrar la lista de las emisoras si es am mostrar la lista de am
  public boolean  asignar(int pos) {

    //creando if para ver si la radio esta encendida o no
    if(encendido==true) {

      //if para ver si estamos en la frecuencia am o fm
      if(queFrecuencia==0) { //asegurando que estamos en la frecuencia am

      System.out.println("\nAsignando la emisora: " + amEstacion + " en el boton: " + pos);
      System.out.println("Asignacion de frecuencia FM exitosa!");

      //guardando la emisora seleccionada en la array
      amEmisoras[(pos-1)] = Integer.valueOf(amEstacion);
      //System.out.println(Arrays.toString(amEmisoras));


      } else if(queFrecuencia==1) { //asegurando que estamos en la frecuencia fm

      System.out.println("\nAsignando la emisora: " + fmEstacion + " en el boton: " + pos);
      System.out.println("Asignacion de frecuencia FM exitosa!");

      //guardando la emisora seleccionada en la array
      fmEmisoras[(pos-1)] = Double.valueOf(fmEstacion);
      //System.out.println(Arrays.toString(fmEmisoras));

      asig = true; //retornando true ya que se pudo asignar la emisora
    }

    } else {

      //mostrando mensaje de error ya que la radio no esta encendida
      System.out.println("Debe encender la radio para poder utilizar esta funcion!");
      asig=false;
    }

    return asig;

  }

  
  /** 
   * @param pos
   * @return boolean
   */
  //seleccionar una de las emisoras guardadas 
  public boolean emisora(int pos) {

    boolean selec = false;

    //creando if para ver si la radio esta encendida o no
    if(encendido==true) {

      //if para ver si esta en am o fm
      if(queFrecuencia==0) { //viendo si esta en am

      //buscando el valor de la emisora con la posicion
      int emi = amEmisoras[(pos-1)];

      //if para dar un mensaje en caso de que no haya estacion guardada con ese boton
      if(emi==0) {
        System.out.println("\nUsted no ha asignado ninguna emisora en este boton, use la opcion 4 para hacerlo.");
      } else{

        System.out.println("\nUsted ha seleccionado el boton: " + pos + ", ahora esta escuchando la emisora: " + emi);
      //System.out.println(Arrays.toString(amEmisoras));

      }
    

      } else if(queFrecuencia==1) { //viendo si esta en fm

      //buscando el valor de la emisora con la posicion
      double emi2 = fmEmisoras[(pos-1)];

      //if para dar un mensaje en caso de que no haya estacion guardada con ese boton
      if(emi2==0.0) {
        System.out.println("\nUsted no ha asignado ninguna emisora en este boton, use la opcion 4 para hacerlo.");
      } else{

        System.out.println("\nUsted ha seleccionado el boton: " + pos + ", ahora esta escuchando la emisora: " + emi2);
      //System.out.println(Arrays.toString(amEmisoras));

      }

      }

      selec = true;


    } else if(encendido == false) { //viendo si la radio esta apagada

      //mostrando mensaje de error ya que la radio no esta encendida
      System.out.println("Debe encender la radio para poder utilizar esta funcion!");
      selec = false;
    }

    return selec;

  }

  //cambiar entre fm y am
  public void frecuencia() {

    //creando if para ver si la radio esta encendida o no
    if(encendido==true) {

      if(queFrecuencia==0) { //significa que la frecuencia esta en am
        queFrecuencia = 1; //cambiando el valor a 1 para que sea fm
        System.out.println("Frecuencia actual: AM\nCambiando frecuencia...\nFrecuencia seleccionada: FM");
      } else if(queFrecuencia==1) { //significa que la frecuencia es fm
      queFrecuencia=0;//cambiando la frecuencia a am
      System.out.println("Frecuencia actual: FM\nCambiando frecuencia...\nFrecuencia seleccionada: AM");

      }

    } else {

      //mostrando mensaje de error ya que la radio no esta encendida
      System.out.println("Debe encender la radio para poder utilizar esta funcion!");

    }

  }
  
}