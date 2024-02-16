package PEP2T_3_ABL;

import java.time.LocalDate;

public class Dron extends Aeronave implements Propulsor
{
    String _Propul = "";

    public Dron(LocalDate _Entrega, Integer _Capacidad, Integer _HorasPrevistas, Integer _HorasEmpleadas, String _LineaMontaje, Double _Coste, Double _Precio, String _Propul)
    {
        super(_Entrega, _Capacidad, _HorasPrevistas, _HorasEmpleadas, _LineaMontaje, _Coste, _Precio);
        this._Propul = _Propul;
    }

    @Override
    public String propul()
    {
        return "Esta aeronave utiliza " +  _Propul + ".";
    }
}