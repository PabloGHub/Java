package PEP2T_2_ABL;
import java.util.Scanner;

public class Funciones
{
    //------------------------------( Declaraciones )---//
    static Scanner _Novo = new Scanner (System.in);
    static public String negrita = "\u001b[0;1m";
    static public String cerrar = "\u001b[0;0m";
    
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


    static public boolean compoTo(String num, int max)
    {
        return compoMax(num, max) == true && compoNum(num) == true ? true : false;
    }
}

/*

    int _accion = 0;
    _accion = Integer.parseInt(Funciones.compoMax(_escito, 1) ? _escito : "6");
    _accion = Integer.parseInt(Funciones.compoNum(_escito) ? _escito : "6");
  
*/