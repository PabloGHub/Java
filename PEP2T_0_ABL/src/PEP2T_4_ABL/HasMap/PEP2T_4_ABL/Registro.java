package PEP2T_4_ABL;
public class Registro implements I_Registro
{
    //----------------------( Declaraciones )---//
    private String _Pais = "", _Capital = "";


    public Registro(String _Pais, String _Capital)
    {
        this._Pais = _Pais;
        this._Capital = _Capital;
    }


    @Override
    public String getPais()
    {
        return _Pais;
    }

    @Override
    public void setPais(String _Pais)
    {
        this._Pais = _Pais;
    }

    @Override
    public String getCapital()
    {
        return _Capital;
    }

    @Override
    public void setCapital(String _Capital)
    {
        this._Capital = _Capital;
    }
    
}