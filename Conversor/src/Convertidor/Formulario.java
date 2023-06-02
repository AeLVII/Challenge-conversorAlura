package Convertidor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Formulario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 166);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("CONVERSOR");
		label1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		label1.setBounds(147, 11, 127, 32);
		frame.getContentPane().add(label1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Moneda", "Temperatura"}));
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBounds(195, 54, 202, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel label2 = new JLabel("Seleccione tipo de conversion");
		label2.setBounds(29, 58, 156, 14);
		frame.getContentPane().add(label2);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedItem()=="Moneda") {
					Formulario2 newframe=new Formulario2();
					newframe.frame.setVisible(true);
				}
				else if(comboBox.getSelectedItem()=="Temperatura") {
					Formulario3 newframe3=new Formulario3();
					newframe3.frame.setVisible(true);
				}

			}
		});
		btnNewButton.setBounds(108, 93, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 93, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}
}
