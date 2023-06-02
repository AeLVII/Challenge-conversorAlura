package Convertidor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2{

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 window = new Formulario2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\AeL\\Downloads\\coin.png"));
		frame.setBounds(100, 100, 450, 201);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Conversor de moneda");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(125, 11, 179, 22);
		frame.getContentPane().add(label1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soles a Dolar", "Soles a Euros", "Soles a Bolivianos", "Dolar a Soles", "Euros a Soles", "Bolivianos a Soles"}));
		comboBox.setEditable(true);
		comboBox.setBounds(247, 75, 133, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ConvertMoneda mone=new ConvertMoneda();
				double cantidad=Double.parseDouble(textField.getText());
				switch((String) comboBox.getSelectedItem()) {
				case "Soles a Dolar":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conSolDolar(cantidad)));
					break;
				case "Soles a Euros":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conSolEuro(cantidad)));
					break;
				case "Soles a Bolivianos":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conSolBoliviano(cantidad)));
					break;
				case "Dolar a Soles":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conDolarSol(cantidad)));
					break;
				case "Euros a Soles":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conEuroSol(cantidad)));
					break;
				case "Bolivianos a Soles":
					JOptionPane.showMessageDialog(null, "El monto convertido de "+(String) comboBox.getSelectedItem()+" es "+Math.round(mone.conBolivianoSol(cantidad)));
					break;
				default:
					
				}
				
			}
			});
		btnNewButton.setBounds(257, 118, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label2 = new JLabel("Ingrese la cantidad a convertir:");
		label2.setBounds(76, 47, 161, 14);
		frame.getContentPane().add(label2);
		
		textField = new JTextField();
		textField.setBounds(247, 44, 119, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label3 = new JLabel("Seleccione el tipo de conversion de moneda:");
		label3.setBounds(10, 79, 216, 14);
		frame.getContentPane().add(label3);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(97, 118, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
