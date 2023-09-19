package AppResolucionCuadratica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResolCuadratica extends JFrame{
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtValorC;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnSALIR;
    private JPanel MainPanel;

    public ResolCuadratica() {
        setContentPane(MainPanel);
        setTitle("Valor Matricula");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ValorA=0,ValorB=0,ValorC=0,Root1,Root2;

                try{
                    ValorA=Double.parseDouble(txtValorA.getText());
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS INGRESA EL VALOR DE A",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                try{
                    ValorB=Double.parseDouble(txtValorB.getText());
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS INGRESA EL VALOR DE B",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                try{
                    ValorC=Double.parseDouble(txtValorC.getText());
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS INGRESA EL VALOR DE C",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                if((ValorA==0) || (ValorB==0) || (ValorC==0)){
                    txtValorA.setText("");
                    txtValorB.setText("");
                    txtValorC.setText("");

                }
                else{
                    CalculoCuadratica Calcular=new CalculoCuadratica(ValorA,ValorB,ValorC);

                    if(Calcular.CalculoDiscriminante() == true){
                        Root1=Calcular.CalcularRaiz1();
                        Root2=Calcular.CalcularRaiz2();

                        JOptionPane.showMessageDialog(null,
                                "La Raiz 1 es igual a: "+Root1+ " La Raiz 2 es igual a: "+Root2,
                                "SOLUCION FMLA BACHILLER",
                                JOptionPane.INFORMATION_MESSAGE);


                    }
                    else {
                        JOptionPane.showMessageDialog(null,
                                "La Ecuacion no tiene Solución de Raices Reales",
                                "SOLUCION FMLA BACHILLER",
                                JOptionPane.INFORMATION_MESSAGE);

                    }

                }

            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValorA.setText("");
                txtValorB.setText("");
                txtValorC.setText("");
            }
        });
        btnSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }
}
