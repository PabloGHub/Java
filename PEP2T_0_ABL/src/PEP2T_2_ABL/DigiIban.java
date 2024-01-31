package PEP2T_2_ABL;
import java.math.BigInteger;

public class DigiIban
{
    //--------------Declaraciones
    String _banco, _sucursal, _DigitosControl, _nCuenta;

    //--------------Constructor
    public DigiIban(String _banco, String _sucursal, String _DigitosControl, String _nCuenta)
    {
        this._banco = _banco;
        this._sucursal = _sucursal;
        this._DigitosControl = _DigitosControl;
        this._nCuenta = _nCuenta;
    }


    public String generarIBAN()
    {
        BigInteger _OperadorBI = new BigInteger(_banco + _sucursal + _DigitosControl + _nCuenta + "142800");

        _OperadorBI.remainder(BigInteger.valueOf(97));
        Integer _Operador = _OperadorBI.remainder(BigInteger.valueOf(97)).intValue();

        _Operador = 98 - _Operador;

        return _Operador < 9 ? "0" + _Operador : String.valueOf(_Operador);
    }

    boolean validar(String iban1, String iban2)
    {
        return iban1.equals(iban2);
    }
}