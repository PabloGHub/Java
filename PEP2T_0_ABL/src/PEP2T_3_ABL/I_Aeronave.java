package PEP2T_3_ABL;
import java.time.LocalDate;
public interface I_Aeronave
{
    //--------Getters | Setters
    LocalDate getEntrega();
    void setEntrega(LocalDate _Entrega);

    String getLineaMontaje();
    void setLineaMontaje(String _LineaMontaje);

    // String getPropul();

    Integer getCapacidad();

    Integer getHorasPrevistas();

    Integer getHorasEmpleadas();
    void setHorasEmpleadas(Integer _HorasEmpleadas);

    Double getCoste();
    void setCoste(Double _Coste);

    Double getPrecio();

    Boolean getPrimera();
    void setPrimera(Boolean _primera);

    String gE();

    //--------Obligatorio
    String fechaEntrega();
    String horasBenef();
    String propul();
    String formadate(LocalDate _fecha);
    String totalHoras();
    String facturacion(Aeronave[] _AeronavesArray);
}