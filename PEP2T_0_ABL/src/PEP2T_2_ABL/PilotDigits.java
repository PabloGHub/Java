package PEP2T_2_ABL;
import PEP2T_2_ABL.Funciones;

public class PilotDigits
{
    public static void main(String[] args)
    {
        Menu M = new Menu();

        boolean _Bucle = true;
        while (_Bucle)
        {
            System.out.println( Funciones.negrita + 
                                "\t\t\t\tMénu de Opciones\n" + 
                                "\t\t\t\t================\n" + 
                                Funciones.cerrar +
                                "\t\t1) Generar Digito de Control\n" + 
                                "\t\t2) Validar Digito de Control\n" + 
                                "\t\t3) Generar dígitos del IBAN\n" +
                                "\t\t4) Validar dígitos del IBAN\n" +
                                "\t\t5) Salir");

            //--- Para todo tipo de error para mostrar error generico mas amigable
            try 
            {
                String _escito = Funciones.Cin("\t\t\t\tOpciones: ");
                System.out.println();

                //--------------------Comprobaciones
                int _accion = 6;
                if (Funciones.compoTo(_escito, 1)) 
                {
                    _accion = Integer.parseInt(_escito);
                }

                switch (_accion)
                {
                    case 1:
                        M.A();
                    break;

                    case 2:
                        M.B();
                    break;

                    case 3:
                        M.C();
                    break;

                    case 4:
                        M.D();
                    break;

                    case 5:
                        System.out.println("Saliendo");
                        System.exit(0);
                    break;
                
                    default:
                        System.out.println("Error de caracter");
                    break;
                }
            

                // int s = 0 / 0; // Forzar crasheo | Para llegar aqui debes poner un numero magor a 5
            }
            catch (Exception e)
            {
                System.out.println("Error de ejecucion: Comunique a la empresa correspodiente del error,\nIntentando describir cada pasos que hizo antes del error, \nGracias");
                System.exit(1);
            }
        }


    } 
}
