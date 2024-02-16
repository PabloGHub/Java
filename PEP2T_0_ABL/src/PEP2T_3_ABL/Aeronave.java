package PEP2T_3_ABL;
import static PEP2T_3_ABL.Funciones.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Aeronave implements I_Aeronave
{
    //-------------------------( Declaraciones )---//
    private LocalDate _Entrega;
    private String _LineaMontaje;
    private Integer _Capacidad, _HorasPrevistas, _HorasEmpleadas;
    private Double _Coste, _Precio;

    private Boolean _primera = false;

    private String _Este = this.getClass().getSimpleName();

    //---------------Constructor
    public Aeronave(LocalDate _Entrega, Integer _Capacidad, Integer _HorasPrevistas, Integer _HorasEmpleadas, String _LineaMontaje, Double _Coste, Double _Precio)
    {
        this._Entrega = _Entrega;
        this._Capacidad = _Capacidad;
        this._HorasPrevistas = _HorasPrevistas;
        this._HorasEmpleadas = _HorasEmpleadas;
        this._LineaMontaje = _LineaMontaje;
        this._Coste = _Coste;
        this._Precio = _Precio;
    }

    public Aeronave()
    {
        // Ja nada :D
    }


    //-------------------Setters y Getters
    @Override // _Entrega
    public LocalDate getEntrega()
    {
        return _Entrega;
    }

    @Override // _Entrega
    public void setEntrega(LocalDate _Entrega)
    {
        this._Entrega = _Entrega;
    }

    @Override // _LineaMontaje
    public String getLineaMontaje()
    {
        return _LineaMontaje;
    }

    @Override // _LineaMontaje
    public void setLineaMontaje(String _LineaMontaje)
    {
        this._LineaMontaje = _LineaMontaje;
    }

    @Override // _Capacidad
    public Integer getCapacidad()
    {
        return _Capacidad;
    }

    @Override // _HorasPrevistas
    public Integer getHorasPrevistas()
    {
        return _HorasPrevistas;
    }

    @Override // _HorasEmpleadas
    public Integer getHorasEmpleadas()
    {
        return _HorasEmpleadas;
    }

    @Override // _HorasEmpleadas
    public void setHorasEmpleadas(Integer _HorasEmpleadas)
    {
        this._HorasEmpleadas = _HorasEmpleadas;
    }

    @Override // _Coste
    public Double getCoste()
    {
        return _Coste;
    }

    @Override // _Coste
    public void setCoste(Double _Coste) 
    {
        this._Coste = _Coste;
    }

    @Override // _Precio
    public Double getPrecio()
    {
        return _Precio;
    }
    
    @Override // _primera
    public Boolean getPrimera()
    {
        return _primera;
    }

    @Override // _primera
    public void setPrimera(Boolean _primera)
    {
        this._primera = _primera;
    }

    @Override
    public String gE()
    {
        return _Este;
    }

    //---------Mias
    String pasa(String _m)
    {
        if (gE().equals("Dron") || gE().equals("Cohete"))
        {
            _m += ".";
        }   
        else
        {
            _m += "para " + getCapacidad() + " pasajeros.";
        }
        return _m;
    }

    //----------------------------( Incorporadas )---//
    public String fechaEntrega()
    {
        if (getPrimera())
        {
            String _m = gE().equals("Avioneta") ? "Después construyó una " : "Después construyó un ";
            _m += negr + gE() + cerr + " el " + formadate(getEntrega());
            _m = pasa(_m);

            setPrimera(true);
            return _m;
        }
        else if (gE() != "Avioneta")
        {
            String _m = "Esta fábrica construyó su primera aeronave, una " + negr + gE() + cerr + " el " + formadate(getEntrega());
            _m = pasa(_m);

            return _m;
        }
        else
        {
            String _m = "Esta fábrica construyó su primera aeronave, un " + negr + gE() + cerr + " el " + formadate(getEntrega());
            _m = pasa(_m);

            return _m;
        }
    }

    @Override
    public String horasBenef()
    {
        return "Esto supuso " + getHorasPrevistas() + " horas de trabajo generando un beneficio de " + (getPrecio() - getCoste()) + "€.";
    }

    @Override
    public String propul()
    {
        return "Error";
    }

    @Override
    public String formadate(LocalDate _fecha)
    {
        DateTimeFormatter _Formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return _fecha.format(_Formato);
    }

    @Override
    public String totalHoras()
    {
        return "El total de horas de trabajo empleadas en el tipo " + gE()  + " fueron: " + getHorasEmpleadas();
    }

    @Override
    public String facturacion(Aeronave[] _AeronavesArray)
    {
        Double _sum = 0.00;
        for (Aeronave aeronave : _AeronavesArray)
        {
            _sum += aeronave.getPrecio() - aeronave.getCoste();
        }
        return "La facturación total de la compañía a día de hoy: " + _sum + "€";
    }

    public static void main(String[] args)
    {
        echoln(rep("\t", 5) + negrita + sub + "PROGRAMA AERONAVES" + cerrar + "\n");

        LocalDate f = LocalDate.now(); // Por si las moscas
        //ArrayList<Aeronave> _AeronavesArray = new ArrayList<>();

        //---------( Inserccion de datos )---//
        f = LocalDate.of(2008, 02, 02);
        Dron d = new Dron(f, 0, 200, 205, "DA5", 1800.00, 2700.00, "Electricidad");
        //_AeronavesArray.add(d);

        f = LocalDate.of(2008, 05, 22);
        Avioneta a = new Avioneta(f, 8, 10000, 10550 , "DA4", 8000.00, 150000.00, "Diesel");
        //_AeronavesArray.add(a);

        f = LocalDate.of(2008, 03, 12);
        Jet j = new Jet(f, 6, 2000, 2505, "DA2", 250000.00, 1000000.00, "Queroxeno");
        //_AeronavesArray.add(j);

        f = LocalDate.of(2008, 10, 22);
        AvComMed acm = new AvComMed(f, 120, 2500, 22785 , "DA0", 500000.00, 3000000.00, "Queroxeno");
        //_AeronavesArray.add(acm);

        f = LocalDate.of(2022, 10, 14);
        Cohete c = new Cohete(f, 0, 2000, 22785 , "DA1", 500000.00, 3000000.00, "Propergol sólido");
        //_AeronavesArray.add(c);
        
        Aeronave[] _AeronavesArray = {d, a, j, acm, c};
        Arrays.sort(_AeronavesArray, Comparator.comparing(b -> b.getEntrega()));

        for (Aeronave iterador : _AeronavesArray)
        {
            echoln(iterador.fechaEntrega());
            echoln("\t" + iterador.horasBenef());
            echoln("\t\t" + iterador.propul() + "\n");
        }

        echoln(a.totalHoras());
        echoln(c.facturacion(_AeronavesArray));
    }
}