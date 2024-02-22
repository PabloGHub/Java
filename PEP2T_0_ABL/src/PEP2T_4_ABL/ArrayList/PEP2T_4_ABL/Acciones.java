package PEP2T_4_ABL;
import static PEP2T_4_ABL.Funciones.*;
import java.util.*;


public class Acciones
{
    //---------------------------Declaraciones
    Registro r1 = new Registro("Portugal", "Lisboa");
    Registro r2 = new Registro("Francia", "Paris");
    
    ArrayList<Registro> _registros = new ArrayList<Registro>();

    public Acciones()
    {
        _registros.add(r1);
        _registros.add(r2);
    }

    //---Añadir una entrada al atlas
    void A()
    {
        String _pai = Cin(negr + "   Teclea un País: " + cerr);
        for (Registro _regi : _registros)
        {
            if (_regi.getPais().equals(_pai))
            {
                echoln("\tYa esiste este Pais");
                return;
            }
        }
        String _ciu = Cinln(negr + "   Teclea su Capital: " + cerr);


        _registros.add(new Registro(_pai, _ciu));

        echoln("   Nueva entrada incorporada");
        // echo(_registros.get(_registros.size()-1).getPais());
        // echo(_registros.get(_registros.size()-1).getCapital());
    }


    //---Mostrar el contenido actual del atlas
    void B()
    {
        for (Registro _regi : _registros)
        {
            echo(negr + "  País: " + cerr + _regi.getPais());
            String _sepa = _regi.getPais().length() < 8 ? "\t\t" : "\t";
            echoln(negr + _sepa + "  Capital: " + cerr + _regi.getCapital());  
        }
        echoln("\n" + negr + "\t\thay " + _registros.size() + " elementos en el Atlas" + cerr);
    }


    //---Buscar una entrada del atlas
    void C()
    {
        String _pai = Cinln(negr + "   Teclea un País: " + cerr);

        for (Registro _regi : _registros)
        {
            if (_regi.getPais().equals(_pai))
            {
                echoln(negr + "\tCapital: " + cerr + _regi.getCapital());  
                return;
            }
        }
        echoln(negrita + "  De este país no se encuentra capital" + cerrar);
    }


    //---Modificar una entrada del atlas
    void D()
    {
        String _pai = Cin(negr + "   Teclea un País: " + cerr);

        for (Registro _regi : _registros)
        {
            if (_regi.getPais().equals(_pai))
            {
                String _NovoCapital = Cinln( negr + "   Teclea modificación de capital: " + cerr);
                _regi.setCapital(_NovoCapital);
                return;
            }
        }
        echoln(negrita + "  De este país no se encuentra capital" + cerrar);
    }


    //---Ordenar por nombre de país
    void E()
    {
        TreeMap<String, String> _OrdenaoMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (Registro _regi : _registros)
        {
            _OrdenaoMap.put(_regi.getPais(), _regi.getCapital());
        }

        for (Map.Entry<String, String> _regi : _OrdenaoMap.entrySet())
        {
            echoln("\t" + _regi.getKey() + "(" + _regi.getValue() + ")");
        }
    }


    //---Mostrar el contenido del atlas con iterador
    void F()
    {
        for (int i = 0; i <= _registros.size()-1; i++)
        {
            echo(negr + "  País: " + cerr + _registros.get(i).getPais());
            String _sepa = _registros.get(i).getPais().length() < 8 ? "\t\t" : "\t";
            echoln(negr + _sepa + "  Capital: " + cerr + _registros.get(i).getCapital());  
        }
        echoln("\n" + negr + "\t\thay " + _registros.size() + " elementos en el Atlas" + cerr);
    }


    //---Eliminar una entrada del atlas
    void G()
    {
        String _pai = Cinln(negr + "   Teclea un País a eliminar: " + cerr);

        for (Registro _regi : _registros)
        {
            if (_regi.getPais().equals(_pai))
            {
                echoln(negrita + "\t" + _regi.getPais() + " eliminada del Atlas" + cerrar);
                
                _registros.remove(_regi);

                return;
            }
        }
        echoln(negrita + "  No se encuentra el País" + cerrar);
    }


    //---Eliminar el contenido completo del atlas
    void H()
    {
        _registros.clear();
        echoln(negrita + "  Eliminado el Atlas por completo" + cerrar);
    }
}