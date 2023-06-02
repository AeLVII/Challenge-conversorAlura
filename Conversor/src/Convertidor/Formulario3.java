package Convertidor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario3{

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario3 window = new Formulario3();
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
	public Formulario3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Conversor de temperatura");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(112, 11, 216, 22);
		frame.getContentPane().add(label1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Celsius a Farenheit", "Cesius a Kelvin", "Farenheit a Celsius", "Farenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Farenheit"}));
		comboBox.setEditable(true);
		comboBox.setBounds(262, 75, 133, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Unidad[];
				Unidad = new String[] {"(ªC)","ªF","ªK"};
				ConvertTemperatura temp=new ConvertTemperatura();
				double tempe=Double.parseDouble(textField.getText());
				switch((String) comboBox.getSelectedItem()) {
				case "Celsius a Farenheit":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conCelFar(tempe))+" "+Unidad[1]);
					break;
				case "Cesius a Kelvin":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conCelKel(tempe))+" "+Unidad[2]);
					break;
				case "Farenheit a Celsius":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conFarCel(tempe))+" "+Unidad[0]);
					break;
				case "Farenheit a Kelvin":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conFarKel(tempe))+" "+Unidad[2]);
					break;
				case "Kelvin a Celsius":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conKelCel(tempe))+" "+Unidad[0]);
					break;
				case "Kelvin a Farenheit":
					JOptionPane.showMessageDialog(null, "La temperatura convertida de "+(String) comboBox.getSelectedItem()+" es "+Math.round(temp.conKelFar(tempe))+" "+Unidad[1]);
					break;
				default:
					break;
				}
			}
		});
		btnNewButton.setBounds(272, 118, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label2 = new JLabel("Ingrese la temperatura a convertir:");
		label2.setBounds(72, 47, 180, 14);
		frame.getContentPane().add(label2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(262, 44, 119, 20);
		frame.getContentPane().add(textField);
		
		JLabel label3 = new JLabel("Seleccione el tipo de conversion de moneda:");
		label3.setBounds(30, 79, 222, 14);
		frame.getContentPane().add(label3);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(112, 118, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
