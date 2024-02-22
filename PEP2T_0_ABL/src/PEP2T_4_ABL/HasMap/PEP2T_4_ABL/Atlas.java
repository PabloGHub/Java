package PEP2T_4_ABL;
import static PEP2T_4_ABL.Funciones.*;

public class Atlas
{
    public static void main(String[] args)
    {
        echo(rep("\t", 4) + negr + sub + " PROGRAMA ATLAS " + cerr + "\n\n");

        Acciones ac = new Acciones();

        Boolean _bucle = false;
        while(!_bucle)
        {
            echo(negrita + "\n" +
            "1. Añadir una entrada al atlas \t\t" + "2. Mostrar el contenido actual del atlas\n" +
            "3. Buscar una entrada del atlas \t" + "4. Modificar una entrada del atlas\n" +
            "5. Ordenar por nombre de país \t\t" + "6. Mostrar el contenido del atlas con iterador\n" + 
            "7. Eliminar una entrada del atlas \t" + "8. Eliminar el contenido completo del atlas\n" + 
            "9. Salir\n\n");

            try
            {
                Integer _accion = Integer.parseInt(Cinln(negr + "Teclea una de las opciones: " + cerr));

                switch (_accion)
                {
                    case 1:
                        ac.A();
                    break;

                    case 2:
                        ac.B();
                    break;
                    
                    case 3:
                        ac.C();
                    break;

                    case 4:
                        ac.D();
                    break;

                    case 5:
                        ac.E();
                    break;

                    case 6:
                        ac.F();
                    break;

                    case 7:
                        ac.G();
                    break;

                    case 8:
                        ac.H();
                    break;
                    
                    case 9:
                        echo("Saliendo");
                        System.exit(0);
                    break;

                    default:
                        echoln("Error");
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("\t\033[1mDebes teclear un número entero\033[0m");
            }
        }
        
    }    
}
