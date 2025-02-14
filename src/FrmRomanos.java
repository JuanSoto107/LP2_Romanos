import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmRomanos extends JFrame {

    // Metodo Constructor de la interfaz
    public FrmRomanos() {
        setSize(300, 200); //Tamaño de ancho y largo de la ventana
        setTitle("Conversion a Romanos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblArabigo = new JLabel("Numero Arabigo");
        lblArabigo.setBounds(10, 10, 100, 25); //Dimensiones de la etiqueta "Numero arabigo"
        getContentPane().add(lblArabigo); //Añadir la etiqueta al panel principal

        JTextField txtArabigo = new JTextField(); //Aqui se inserta la caja de texto
        txtArabigo.setBounds(110, 10, 100, 25); //Dimensiones de la caja "Numero arabigo", se ubica mas a la derecha de lblArabigo
        getContentPane().add(txtArabigo); //Añadir la caja al panel principal

        JButton btnConvertir = new JButton("Convertir"); // Añadir el boton con etiqueta "Convertir"
        btnConvertir.setBounds(10, 40, 100, 25); // Se coloca
        getContentPane().add(btnConvertir); // Añadirlo al panel principal

        JTextField txtRomano = new JTextField(); // Caja de texto para numeros romanos
        txtRomano.setBounds(110, 40, 100, 25); //Dimensiones de la caja de numeros romanos paralela a la de arabigo
        getContentPane().add(txtRomano); //Añadir la caja al panel principal
        txtRomano.setEnabled(false); //Deshabilitar la caja de texto de romanos

        btnConvertir.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                convertirRomano();  
                                                                     
            }
                                                                   
        });

    }

    public void convertirRomano() {

    }

}