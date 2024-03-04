import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEP2T_5_ABL
{
    public class SumasAleatorias extends JFrame
    {
        //---Aprendi del trabajo XDDD---//
        private JLabel _numero1Label;
        private JLabel _numero2Label;
        private JLabel _resultadoLabel;

        private JTextField _numero1Field;
        private JTextField _numero2Field;
        private JTextField _resultadoField;

        private JButton _generar;
        private JButton _verificar;
        private JButton _salir;

        private JLabel _intentos;
        private JLabel _acertados;
        private JLabel _fallados;

        private int _NunIntentos;
        private int _NunAcertados;
        private int _NunFallados;

        public SumasAleatorias()
        {
            // --- ( CREACION Y CONFIGURACION DE OBJETOS ) --- //

            setTitle("Adivina el resultado de la suma");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());


            JPanel _panelSuperior = new JPanel(new FlowLayout());
            
            _numero1Label = new JLabel("Número 1");
            _numero1Field = new JTextField(10);
            _numero1Field.setEditable(false);

            _numero2Label = new JLabel("Número 2");
            _numero2Field = new JTextField(10);
            _numero2Field.setEditable(false);

            _resultadoLabel = new JLabel("Resultado");
            _resultadoField = new JTextField(10);
            _resultadoField.setEditable(false);


            JPanel _panelCentral = new JPanel(new FlowLayout());
            _generar = new JButton("Generar");
            _verificar = new JButton("Verificar");
            _salir = new JButton("Salir");
            

            JPanel _panelInferior = new JPanel(new FlowLayout());
            _intentos = new JLabel("Intentos: 0");
            _acertados = new JLabel("Acertados: 0");
            _fallados = new JLabel("Fallados: 0");



            // --- ( INTERACTIVIDAD ) --- //

            _generar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    int _numero1 = (int) (Math.random() * 999) + 1;
                    int _numero2 = (int) (Math.random() * 999) + 1;
                    
                    _numero1Field.setText(String.valueOf(_numero1));
                    _numero2Field.setText(String.valueOf(_numero2));
                }
            });


            _verificar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent ae)
                {
                    verificado();
                }
            });


            _salir.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.exit(0);
                }
            });


            // --- ( IMPLEMENTACION DE OBJETOS ) --- //

            _panelSuperior.add(_numero1Label);
            _panelSuperior.add(_numero1Field);
            _panelSuperior.add(_numero2Label);
            _panelSuperior.add(_numero2Field);
            _panelSuperior.add(_resultadoLabel);
            _panelSuperior.add(_resultadoField);
            
            add(_panelSuperior, BorderLayout.NORTH);


            _panelCentral.add(_generar);
            _panelCentral.add(_verificar);
            _panelCentral.add(_salir);
            
            add(_panelCentral, BorderLayout.CENTER);


            _panelInferior.add(_intentos);
            _panelInferior.add(_acertados);
            _panelInferior.add(_fallados);

            add(_panelInferior, BorderLayout.SOUTH);

            setVisible(true);

            pack();
        }


        void verificado()
        {
            int _numero1;
            int _numero2;

            // Quise hacerlo con un if pero no me dejo
            try 
            {
                _numero1 = Integer.parseInt(_numero1Field.getText());
                _numero2 = Integer.parseInt(_numero2Field.getText());
            }
            catch (NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "No Generaste los Numeros", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int _resultaoSuma = _numero1 + _numero2;

            String _entrada = JOptionPane.showInputDialog(null, "Introduce el resultado de la suma:");
            Integer _respuesta;

            if (_entrada == null)
            {
                return;
            }

            try
            {
                _respuesta = Integer.parseInt(_entrada);
            }
            catch (NumberFormatException nfe)
            {
                System.out.println(_entrada);
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                verificado();
                return;
            }

            if (_respuesta == _resultaoSuma)
            {
                _resultadoField.setText(_respuesta.toString()); 
                _NunAcertados++;
            }
            else
            {
                _resultadoField.setText(_respuesta.toString());
                _NunFallados++;
            }
            _NunIntentos++;

            _intentos.setText("Intentos: " + _NunIntentos);
            _acertados.setText("Acertados: " + _NunAcertados);
            _fallados.setText("Fallados: " + _NunFallados);
        }
    }
}

// Aquí va el código adicional para contar un chiste:
// ¿Por qué los programadores prefieren los números binarios?
// Porque en el mundo digital, todo es 0 y 1, y ellos siempre están en su elemento.