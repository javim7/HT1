/*
Página principal
Andrea Lam, 20102
Javier Mombiela, 20067
Ultima Modificación: 18/01/21

Página principal para la creación del menú de la radio
Este programa tiene como objetivo el crear una simulación de una radio

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) { //creando el metodo main

  //creando atributos
    int op=0;
    RadioAJ radio = new RadioAJ();
    Scanner scan = new Scanner(System.in);
    
    //mostrando mensaje de inicio
    System.out.println("\n\nBienvenido a la simulación de radio");

    while(op!=7) // el menu se seguira mostrando mientras no elija salir
    {
      
      System.out.println("\nPorfavor elija una de las siguientes opciones:");

      //mostrando las opciones
      System.out.println("\n1. Encender la radio");
      System.out.println("2. Cambiar de AM a FM a AM");
      System.out.println("3. Avanzar en el día de las emisoras");
      System.out.println("4. Guardar emisora en unos de los 12 botones");
      System.out.println("5. Seleccionar una emisora guardada");
      System.out.println("6. Apagar la radio");
      System.out.println("7. Salir de la radio\n");


    //while para asegurar que el usuario solo ingrese numeros y caracteres validos
    while(true){
          try{
              System.out.print("Opcion: ");
              op = scan.nextInt();
              System.out.println("\n");
              //(Programación defensiva)
              //Protección por si el usuario elige un número menor a uno o mayor a dos, seguirá pidiendo la opción. 
              if(op > 7 || op < 1){
                  System.out.println("Opcion incorrecta, intenta de nuevo..");
              }
              //Si el usuario ingresa los datos correctos terminará el ciclo while
              else{break;}
          }
          //Si el usuario ingresa una letra regresará un mensaje de error. 
          catch(Exception o){
              scan.nextLine();
              System.out.println("Caracter invalido! Intenta de nuevo..");
          }
      }

      switch(op) {
        case 1:
          // Encender la radio
          radio.encender();
          break;
        case 2:
          // Cambiar de AM a FM a AM
          radio.frecuencia();
          
          break;
        case 3:
        // Avanzar en el día de las emisoras
          radio.incrementar();

          break;
        case 4:
          // Guardar emisora en unos de los 12 botones
          System.out.println("¿En que botón desea guardar la radio?");
          int boton; //creando variable de los botones disponiles

          //while para asegurar que el boton sea un numero y caracter valido
          while(true){
            try{
                System.out.print("Boton: ");
                boton = scan.nextInt();
                System.out.println("\n");
                //(Programación defensiva)
                //Protección por si el usuario elige un número menor a uno o mayor a dos, seguirá pidiendo la opción. 
                if(boton > 12 || boton < 1){
                    System.out.println("Solo se aceptan numeros del 1 al 12, intente de nuevo!");
                }
                //Si el usuario ingresa los datos correctos terminará el ciclo while
                else{break;}
            }
            //Si el usuario ingresa una letra regresará un mensaje de error. 
            catch(Exception o){
                scan.nextLine();
                System.out.println("Caracter invalido! Intenta de nuevo..");
            }
          }

          radio.asignar(boton); //llamando el metodo con el respectivo boton

          break;
        case 5:
          // Seleccionar una emisora guardada
          System.out.println("¿Que botón de la radio desea escuchar?");
          int b; //creando la variable del boton a Seleccionar

          while(true){
            try{
                System.out.print("Boton: ");
                b = scan.nextInt();
                System.out.println("\n");
                //(Programación defensiva)
                //Protección por si el usuario elige un número menor a uno o mayor a dos, seguirá pidiendo la opción. 
                if(b > 12 || b < 1){
                    System.out.println("Solo se aceptan numeros del 1 al 12, intente de nuevo!");
                }
                //Si el usuario ingresa los datos correctos terminará el ciclo while
                else{break;}
            }
            //Si el usuario ingresa una letra regresará un mensaje de error. 
            catch(Exception o){
                scan.nextLine();
                System.out.println("Caracter invalido! Intenta de nuevo..");
            }
          }


          radio.emisora(b);//llamando el metodo de seleccionar boton

          break;
        case 6:
          // Apagar la radio
          radio.apagar();

          break;
        case 7:
          // Salir
          System.out.println("\nGracias por utilizar la simulacion, vuelva pronto!");

          //saliendo de la radio
          System.exit(0);

          break;
        default:
          // code block
      }




    }

  scan.close();

  }
}