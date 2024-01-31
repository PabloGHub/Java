package PEP2T_2_ABL;

public class DigiControl
{
    public String generalDigito(String _Digitos)
    {
        int[] _homologoConstante = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int _Operador = 0, i = 0;

        for (char iterador : _Digitos.toCharArray())
        {
            _Operador += _homologoConstante[i] * Character.getNumericValue(iterador);
            i++;
        }

        _Operador %= 11;
        _Operador = 11 - _Operador;

        if (_Operador == 10)
        {
            _Operador = 1;
        }
        else if (_Operador == 11)
        {
            _Operador = 0;
        }

        return Integer.toString(_Operador);
    }

    boolean validar(String digito1, String digito2)
    {
        return digito1.equals(digito2);
    }
}