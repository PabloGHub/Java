import java.util.Scanner;

public class PEP2T_1_ABL
{
    //-----------------Declaraciones
    Scanner _Novo;
    float _Retirada = 0, _Ingreso = 0;
    float _Tope, _Saldo;
    boolean v_tope, v_saldo;



    //-----------------Constructor
    public PEP2T_1_ABL(Scanner _Novo)
    {
        this._Novo = _Novo;
    }

    public static void main(String[] args)
    {
        //-----------------Declaraciones
        Scanner _Novo = new Scanner (System.in);
        boolean fin = false;
        int _accion = 0;
    
        System.out.println(args[0] + "  " + args[1]); // PRUEBAS

        // --- Crear Objetos
        PEP2T_1_ABL Caj = new PEP2T_1_ABL(_Novo);
        Caj.leer(args);


        //----------------- While nucleo repetitivo
        while (!fin)
        {
            System.out.print("\n\t\t\t\t\t\033[1;4mPROGRAMA CAJERO AUTOMÁTICO\033[0m\n" +
                                "\n\t\t\t\t\t\t\033[1mMenú de Opciones\033[0m\n" +
                                "\t\t\t\t\t\t\033[1m================\033[0m\n" +
                                "1) Retirada de dinero\n" +
                                "2) Ingreso de dinero\n" +
                                "3) Salir\n" +
                                "\t\t\t\t\t\tOpción: ");

            _accion = _Novo.nextInt();


            switch (_accion)
            {
                case 1:
                    Caj.Reti();
                break;

                case 2:
                    Caj.Ingre();
                break;

                case 3:
                    System.out.println("Saliendo");
                    fin = true;
                break;

                default:
                    System.out.println("Error... \nSaliendo");
                    System.exit(130);
                break;
            }
        }
    }


    //-----------------FUNCIONES
    void Reti()
    {
        verif_saldo(_Saldo);
        
        retirada(); 

        verif_tope();
        verificar_maxSaldo(_Retirada, _Tope, _Saldo);

        if (v_tope == true && v_saldo == true)
        {
            _Saldo -= _Retirada;
            _Tope -= _Retirada;
        }

        verif_saldo(_Saldo);
    }


    void Ingre()
    {
        verif_saldo(_Saldo);

        ingreso();

        verif_saldo(_Saldo);
    }  

    void verificar_maxSaldo(float _Retirada, float _Tope, float _Saldo)
    {
        v_saldo = false;

        if(_Retirada > _Saldo)
        {
            System.out.println("No puede retirar mas que el que tiene");
        }else
        {
            v_saldo = true;
        }
    }

    void leer(String[] args)
    {
        _Tope  = Integer.parseInt(args[0]);
        _Saldo = Integer.parseInt(args[1]);
    }
    //---\\____FUNCIONES____//---\\



    //-----------------Obligatorias
    void verif_saldo (float _Saldo)
    {
        System.out.println("Su saldo actual es de " + _Saldo + " €");
    }

    void verif_tope ()
    {
        v_tope = false;

        if (_Retirada > _Tope) 
        {
            System.out.println("Tiene establecido ahora un tope de " + _Tope + " €");
        }
        else if(_Retirada < 1)
        {
            System.out.println("No puede retirar numero nulos ni negativos");
        }
        else
        {
            v_tope = true;
        }
    }
    

    void ingreso ()
    {
        System.out.println("Teclee dinero a ingresar:");

        _Ingreso = _Novo.nextFloat();

        if (_Ingreso <= 0)
        {
            System.out.println("No puede inresar numeros nulos ni negativos");
        }
        else
        {
            System.out.println("Usted ingresó " + _Ingreso + " €");
            _Saldo += _Ingreso;
        }
    }

    void retirada ()
    {
        System.out.println("Teclee dinero a retirar:");

        _Retirada = _Novo.nextFloat();

        if (_Retirada > _Tope || _Retirada < 1)
        {
            System.out.println("Intenta retirar " + _Retirada + " €");
        }
        else
        {
            System.out.println("Usted retiró " + _Retirada + " €");
        }
    }
}


/* --- INDEX
    1- Declaraciones y Constructor
    2- Void Main
    2.1 Declaraciones y Crar Objeto
    2.2 While nucleo
    3- Funciones del While y demas funciones
    4- Funciones obligatorias de cada accion
    5- index
*/