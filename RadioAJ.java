/*
Página principal
Andrea Lam, 20102
Javier Mombiela, 20067
Ultima Modificación: 18/01/21

Página principal para la creación del la radio
Este programa tiene como objetivo el crear una simulación de una radio

*/

//importando las clases necesarias externas
import java.util.*;

public class RadioAJ implements RadioGeneral { //creando la clase Radio que implementa la interfaz 

//creando variables

int[] amEmisoras = new int[12]; //lista para guardar los valores de las emisoras am
double[] fmEmisoras = new double[12]; //lista  para guardas los valores de las emisoras fm
private int boton; //boton para poder asignar las emisoras de nRadio
private boolean encendido = false; //estado de la radio de encendido o apagado, apagado por default
private int queFrecuencia = 0; //frecuencia am o fm, am es la default y es 0
private int amEstacion = 530; //estacion am empieza con el valor mas bajo siempre y sube de 10 en 10
private double fmEstacion = 87.9; //estacion fm empieza con el valor mas bajo y va de .2 en .2, es float
boolean asig = false;// viendo si ya se asigno un boton o no

  public RadioAJ() { //creando el constructor de la clase Radio


  }

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

