package PEP2T_4_ABL;
import static PEP2T_4_ABL.Funciones.*;
import java.util.*;


public class Acciones
{
    //---------------------------Declaraciones
    // Registro r1 = new Registro("Portugal", "Lisboa");
    // Registro r2 = new Registro("Francia", "Paris");
    // 
    // ArrayList<Registro> _registros = new ArrayList<Registro>();

    HashMap<String, String> _registros = new HashMap<>();

    public Acciones()
    {
        _registros.put("Portugal", "Lisboa");
        _registros.put("Francia", "Paris");
    }

    //---Añadir una entrada al atlas
    void A()
    {
        String _pai = Cin(negr + "   Teclea un País: " + cerr);
        if (_registros.containsKey(_pai))
        {
            echoln("\tYa esiste este Pais");
            return;
        }
        
        String _ciu = Cinln(negr + "   Teclea su Capital: " + cerr);

        _registros.put(_pai, _ciu);

        echoln("   Nueva entrada incorporada");
    }


    //---Mostrar el contenido actual del atlas
    void B()
    {
        for (String _regi : _registros.keySet())
        {
            echo(negr + "  País: " + cerr + _regi);
            String _sepa = _regi.length() < 8 ? "\t\t" : "\t";
            echoln(negr + _sepa + "  Capital: " + cerr + _registros.get(_regi));  
        }
        echoln("\n" + negr + "\t\thay " + _registros.size() + " elementos en el Atlas" + cerr);
    }


    //---Buscar una entrada del atlas
    void C()
    {
        String _pai = Cinln(negr + "   Teclea un País: " + cerr);
        
        if (_registros.containsKey(_pai))
        {
            echoln(negr + "\tCapital: " + cerr + _registros.get(_pai));
        }
        else
        {
            echoln(negrita + "  De este país no se encuentra capital" + cerrar);
        }
    }


    //---Modificar una entrada del atlas
    void D()
    {
        String _pai = Cin(negr + "   Teclea un País: " + cerr);

        if (_registros.containsKey(_pai))
        {
            String _NovoCapital = Cinln( negr + "   Teclea modificación de capital: " + cerr);
            _registros.put(_pai, _NovoCapital);
        }
        else
        {
            echoln(negrita + "  De este país no se encuentra capital" + cerrar);
        }
    }


    //---Ordenar por nombre de país
    void E()
    {
        for (String _regi : _registros.keySet())
        {
            echoln("\t" + _regi + "(" + _registros.get(_regi) + ")");
        }
    }


    //---Mostrar el contenido del atlas con iterador
    void F()
    {
        for (int i = 0; i <= _registros.size()-1; i++)
        {
            echo(negr + "  País: " + cerr + _registros.keySet().toArray()[i]);
            String _sepa = _registros.keySet().toArray()[i].toString().length() < 8 ? "\t\t" : "\t";
            echoln(negr + _sepa + "  Capital: " + cerr + _registros.values().toArray()[i]);   
        }
        echoln("\n" + negr + "\t\thay " + _registros.size() + " elementos en el Atlas" + cerr);
    }


    //---Eliminar una entrada del atlas
    void G()
    {
        String _pai = Cinln(negr + "   Teclea un País: " + cerr);
        
        if (_registros.containsKey(_pai))
        {
            echoln(negrita + "\t" + _registros.get(_pai) + " eliminada del Atlas" + cerrar);
            _registros.remove(_pai);
        }
        else
        {
            echoln(negrita + "  No se encuentra el País" + cerrar);
        }
    }


    //---Eliminar el contenido completo del atlas
    void H()
    {
        _registros.clear();
        echoln(negrita + "  Eliminado el Atlas por completo" + cerrar);
    }
}