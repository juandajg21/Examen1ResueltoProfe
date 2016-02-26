
package examen1resueltoprofe;

import java.util.Scanner;

public class Examen1ResueltoProfe {

    public static void main(String[] args) {
      DatosPersonales Datos[] = new DatosPersonales[100];
      int Opc=0, contUs=0, bandera=0; //contUs me permite saber cuántos usuarios hay
      Scanner lector = new Scanner(System.in);
      String buscar=null;
      
      do{
      
          System.out.println("\nMENÚ PRINCIPAL\n");
          System.out.println("1. Ingresar Usuario");
          System.out.println("2. Actualizar Usuario");
          System.out.println("3. Eliminar Usuario");
          System.out.println("4. Buscar Usuario");
          System.out.println("5. Salir");
          System.out.print("Digite la opción: ");
          Opc = lector.nextInt();
          
          switch (Opc){
              case 1:
                  Datos[contUs] = new DatosPersonales();
                  System.out.print("Digite el nombre del usuario: ");
                  Datos[contUs].setNombre(lector.next());
                  System.out.print("Digite el apelido: ");
                  Datos[contUs].setApellido(lector.next());
                  System.out.print("Digite la fecha de nacimiento: ");
                  Datos[contUs].setFecha(lector.next());
                  System.out.print("Digite la cédula: ");
                  Datos[contUs].setCedula(lector.next());
                  System.out.print("Digite la dirección: ");
                  Datos[contUs].setDireccion(lector.next());
                  System.out.print("Digite el teléfono: ");
                  Datos[contUs].setTelefono(lector.next());
                  System.out.print("Digite el área: ");
                  Datos[contUs].setAreas(lector.next());
                  contUs++;
                  break;
              case 2:
                  System.out.print("Digite el nombre a actualizar: ");
                  buscar = lector.next();
                  for (int i=0; i<contUs; i++){
                  
                      if (buscar.equals(Datos[i].getNombre())){
                        bandera = 1;  
                        System.out.print("Digite la dirección: ");
                        Datos[i].setDireccion(lector.next());
                        System.out.print("Digite el teléfono: ");
                        Datos[i].setTelefono(lector.next());
                        System.out.print("Digite el área: ");
                        Datos[i].setAreas(lector.next());
                                                  
                      }
                       if(bandera==0)   
                           System.out.println("\nUsuario no encontrado");
                       else
                           bandera=0;
                  }
                  
                  
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  System.out.println("\nGracias por utilizar este programa\n");
                  break;
              default:
                  System.out.println("\nOpción incorrecta\n");
                  break;
          }
          
      }while(Opc!=5);
              
              
    }
    
}
