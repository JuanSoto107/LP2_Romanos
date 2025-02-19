import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmRomanos extends JFrame {

    JTextField txtArabigo;
    JTextField txtRomano;

    // Metodo Constructor de la interfaz
    public FrmRomanos() {
        setSize(300, 200); //Tamaño de ancho y largo de la ventana
        setTitle("Conversion a Romanos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblArabigo = new JLabel("Numero Arabigo");
        lblArabigo.setBounds(10, 10, 100, 25); //Dimensiones de la etiqueta "Numero arabigo"
        getContentPane().add(lblArabigo); //Añadir la etiqueta al panel principal

        txtArabigo = new JTextField(); //Aqui se inserta la caja de texto
        txtArabigo.setBounds(110, 10, 100, 25); //Dimensiones de la caja "Numero arabigo", se ubica mas a la derecha de lblArabigo
        getContentPane().add(txtArabigo); //Añadir la caja al panel principal

        JButton btnConvertir = new JButton("Convertir"); // Añadir el boton con etiqueta "Convertir"
        btnConvertir.setBounds(10, 40, 100, 25); // Se coloca
        getContentPane().add(btnConvertir); // Añadirlo al panel principal

        txtRomano = new JTextField(); // Caja de texto para numeros romanos
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

    public void convertirRomano() { //Obtener el numero a convertir

        int arabigo =  Integer.parseInt(txtArabigo.getText()); //Convertir de string a numero mediante parseInt
        // Mediante getText tomar el txtArabigo y convertirlo en numero

        // Declaramos nuevos objetos tipos arreglos romanos como String y arabigos como int
        String[] romanos = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabigos = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


        String romano = "";

        while(arabigo > 0) {
            
            for (int i = 0; i < arabigos.length; i++) { // Recorre todos los digitos del arreglo arabigos hasta llegar a 1
                if (arabigo >= arabigos[i]) { // Si encuentra el numero mayor o igual indicado
                    romano += romanos[i]; // A la variable romano string se le añade la letra que quedo fijada
                    arabigo -= arabigos[i]; //Una vez que arabigo haya sido emparejado lo restara con la posicion del arreglo ubicado actual
                    break;
                }

            }

        }

        // Mostrar la variable final romano en la caja de texto 

        txtRomano.setText(romano);



    }

}