package PEP2T_2_ABL;
import PEP2T_2_ABL.Funciones;

public class Menu
{
    void A()
    {
        //-----------------Declaraciones
        String _banco = "0", _sucursal = "0", _nCuenta = "0", _NovoNumCuenta = "0";

        //---------------------------PEDIR DATOS Y COMPROBACIONES
        _banco = Funciones.Cin("Introduzca 4 digitos del Banco: ");
        if (Funciones.compoTo(_banco, 4) == false){return;} // retorna si lo pusiste mal

        _sucursal = Funciones.Cin("Introduzca 4 digitos del Surcusal: ");
        if (Funciones.compoTo(_sucursal, 4) == false){return;} // retorna si lo pusiste mal


        _nCuenta = Funciones.Cin("Introduzca 10 digitos del Cuenta: ");
        if (Funciones.compoTo(_nCuenta, 10) == false){return;} // retorna si lo pusiste mal
        
        
        _NovoNumCuenta = "00" + _banco + _sucursal;

        //---------------------------Creacion de objeto | dg = DigiControl
        DigiControl dg = new DigiControl();

        String digito1 = dg.generalDigito(_NovoNumCuenta);
        String digito2 = dg.generalDigito(_nCuenta);

        //----------------------------Debujar el resultado
        System.out.println(_banco + " " + _sucursal + " " + digito1 + digito2 + " " + _nCuenta);
    }


    void B()
    {
        //-----------------Declaraciones
        String _banco = "0", _sucursal = "0", _nCuenta = "0", _NovoNumCuenta = "0", _DigitosControl = "0";

        //---------------------------PEDIR DATOS Y COMPROBACIONES
        _banco = Funciones.Cin("Introduzca 4 digitos del Banco: ");
        if (Funciones.compoTo(_banco, 4) == false){return;} // retorna si lo pusiste mal


        _sucursal = Funciones.Cin("Introduzca 4 digitos del Surcusal: ");
        if (Funciones.compoTo(_sucursal, 4) == false){return;} // retorna si lo pusiste mal


        _nCuenta = Funciones.Cin("Introduzca 10 digitos del Cuenta: ");
        if (Funciones.compoTo(_nCuenta, 10) == false){return;} // retorna si lo pusiste mal


        _DigitosControl = Funciones.Cin("Untroduzca 2 digitos de Control: ");
        if (Funciones.compoTo(_DigitosControl, 2) == false){return;} // retorna si lo pusiste mal
        
        
        _NovoNumCuenta = "00" + _banco + _sucursal;

        //---------------------------Creacion de objeto | dg = DigiControl
        DigiControl dg = new DigiControl();

        String digito1 = dg.generalDigito(_NovoNumCuenta);
        String digito2 = dg.generalDigito(_nCuenta);

        //----------------------------Debujar la cuenta
        System.out.println(Funciones.negrita + "Número de cuenta a validar: " + _banco + " " + _sucursal + " " + _DigitosControl + " " + _nCuenta + Funciones.cerrar);


        System.out.print("Digitos Calculados: " + digito1 + digito2 + " ");
        System.out.println(dg.validar(digito1 + digito2, _DigitosControl) ? "Verificación: Correcta\n" : "Verificación: Incorrecta\n");
    }


    void C()
    {
        //-----------------Declaraciones
        String _banco = "0", _sucursal = "0", _nCuenta = "0", _DigitosControl = "0";


        //---------------------------PEDIR DATOS Y COMPROBACIONES
        _banco = Funciones.Cin("Introduzca 4 digitos del Banco: ");
        if (Funciones.compoTo(_banco, 4) == false){return;} // retorna si lo pusiste mal


        _sucursal = Funciones.Cin("Introduzca 4 digitos del Surcusal: ");
        if (Funciones.compoTo(_sucursal, 4) == false){return;} // retorna si lo pusiste mal


        _nCuenta = Funciones.Cin("Introduzca 10 digitos del Cuenta: ");
        if (Funciones.compoTo(_nCuenta, 10) == false){return;} // retorna si lo pusiste mal


        _DigitosControl = Funciones.Cin("Introduzca 2 digitos de Control: ");
        if (Funciones.compoTo(_DigitosControl, 2) == false){return;} // retorna si lo pusiste mal



        //--------------Crear Objeto | di = DigiIban
        DigiIban di = new DigiIban(_banco, _sucursal, _DigitosControl, _nCuenta);
        String _Iban = di.generarIBAN();

        //--------------Dibujar resultado
        System.out.println("ES" + _Iban + " " + _banco + " " + _sucursal + " " + _DigitosControl + " " + _nCuenta);
    }


    void D()
    {
        //-----------------Declaraciones
        String _banco = "0", _sucursal = "0", _nCuenta = "0", _DigitosControl = "0", _IbanControl;


        //---------------------------PEDIR DATOS Y COMPROBACIONES
        _banco = Funciones.Cin("Introduzca 4 digitos del Banco: ");
        if (Funciones.compoTo(_banco, 4) == false){return;} // retorna si lo pusiste mal


        _sucursal = Funciones.Cin("Introduzca 4 digitos del Surcusal: ");
        if (Funciones.compoTo(_sucursal, 4) == false){return;} // retorna si lo pusiste mal


        _nCuenta = Funciones.Cin("Introduzca 10 digitos del Cuenta: ");
        if (Funciones.compoTo(_nCuenta, 10) == false){return;} // retorna si lo pusiste mal


        _DigitosControl = Funciones.Cin("Introduzca 2 digitos de Control: ");
        if (Funciones.compoTo(_DigitosControl, 2) == false){return;} // retorna si lo pusiste mal

        _IbanControl = Funciones.Cin("Introduzca 2 para IBAN: ");
        if (Funciones.compoTo(_DigitosControl, 2) == false){return;} // retorna si lo pusiste mal


        //--------------Crear Objeto | di = DigiIban
        DigiIban di = new DigiIban(_banco, _sucursal, _DigitosControl, _nCuenta);
        String _Iban = di.generarIBAN();
 
        //----------------------------Debujar la cuenta
        System.out.println(Funciones.negrita + "Número de cuenta a validar: ES" + _IbanControl + " " + _banco + " " + _sucursal + " " + _DigitosControl + " " + _nCuenta + Funciones.cerrar);
 
        System.out.print("IBAN Calculados: ES" + _Iban + " ");
        System.out.println(di.validar(_Iban, _IbanControl) ? "Verificación: Correcta\n" : "Verificación: Incorrecta\n");
    }

}