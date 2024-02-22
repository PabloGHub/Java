package PEP2T_4_ABL;
import java.time.LocalDate;
import java.util.Scanner;


/*  
    ¿Como Importar?
    import static <PAQUETE>.Funciones.*;

    ¿Como llamar?
    String variable = Cin("Ponga Dato: "); 
    echo(variable);


    ¿Que Puede Hacer?
    -Pedir datos con Cin();
    -Dibujar con echo();
    -Dibujar negrita y cerrar
    -Comprobar si hay numeros con compoNum();
    -Comprobar longitud con compoMax();
    -Comprobar todo con compoTo();
*/


public class Funciones
{
    //------------------------------( Declaraciones )---//
    static Scanner _Novo = new Scanner (System.in);
    static public String negrita = "\u001b[0;1m";
    static public String negr = "\033[1m";
    static public String cerrar = "\u001b[0;0m";
    static public String cerr = "\033[0m";
    static public String p = "\u001b[0;2m";
    static public String sub = "\u001B[4m";

    // this.getClass().getSimpleName(); // Algun dia are que funciones

    //---------------------------( PEDIR )---//
    static public String Cin(String _Texto)
    {
        System.out.print(_Texto);
        String _Introducido = _Novo.nextLine();

        return _Introducido;
    }

    static public String Cin()
    {
        String _Introducido = _Novo.nextLine();
        return _Introducido;
    }

    //---------------------------( PEDIR + LN)---//
    static public String Cinln(String _Texto)
    {
        System.out.print(_Texto);
        String _Introducido = _Novo.nextLine();

        System.out.println();
        return _Introducido;
    }

    static public String Cinln()
    {
        String _Introducido = _Novo.nextLine();
        System.out.println();
        return _Introducido;
    }

    //---------------------------( Echo )---//
    static public void echo(String _m)
    {
        System.out.print(_m);
    }
    static public void echoln(String _m)
    {
        System.out.println(_m);
    }
    
    static public void echo(Object _o)
    {
        System.out.print(_o);
    }
    static public void echoln(Object _o)
    {
        System.out.println(_o);
    }

    //---------------------------( REPETIR )---//
    static public String rep(String _m, Integer _r)
    {
        String _mensaje = "";
        for(int i = 1; i <= _r;i++)
        {
            _mensaje += _m;
        }
        return _mensaje;
    }


    //-----------------------------------------------------------( COMPROBACIONES )---//
    // Comprueba si hay en el String un caracter no numerico
    static public boolean compoNum(String num) 
    {
        boolean _accion = false;

        for (char iterador : num.toCharArray())
        {
            if( iterador == '0' ||
                iterador == '1' ||
                iterador == '2' ||
                iterador == '3' ||
                iterador == '4' ||
                iterador == '5' ||
                iterador == '6' ||
                iterador == '7' ||
                iterador == '8' ||
                iterador == '9' )
                {
                    _accion = true; // no tiene letras
                }
                else
                {
                    _accion = false;
                    System.out.println("Introducido un Caracter no numerico \n");
                    break;
                }
        }

        return _accion;
    }


    // comprobar si es mas largo/corto de la longitud especifica
    static public boolean compoMax(String num, int max)
    {
        boolean _accion = false;

        if (num.length() > max)
        {
            _accion = false;
            System.out.println("A escecido la cantidad maxima de caracteres de " + max + "\n");
        }
        else if (num.length() < max)
        {
            _accion = false;
            System.out.println("A descecido la cantidad minima de caracteres de " + max + "\n");
        }
        else
        {
            _accion = true;
        }

        return _accion;
    }

    // comprobar los dos anteriores
    static public boolean compoTo(String num, int max)
    {
        return compoMax(num, max) == true && compoNum(num) == true ? true : false;
    }

    //-------------------------------------------------------( Devuelve la Fecha mas antigua )---//
    public LocalDate masAntigua(LocalDate... _ArrayFechas)
    {
        LocalDate fechaMasAntigua = _ArrayFechas[0];
        for (LocalDate _iFecha : _ArrayFechas)
        {
            if (_iFecha.isBefore(fechaMasAntigua))
            {
                fechaMasAntigua = _iFecha;
            }
        }
        return fechaMasAntigua;
    }
}

/*
    ¡Codigo que Funciona!
    import static pruebas.Funciones.*;
    public class test
    {
        public static void main(String[] args)
        {
            String variable;

            variable = Cin("Ponga Dato: "); 
            echo(variable);

            //echo(compoNum(variable) == true ? variable : "Error");   
        }
    }
*/