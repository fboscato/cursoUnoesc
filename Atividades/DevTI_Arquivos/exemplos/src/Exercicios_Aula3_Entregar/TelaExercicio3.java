package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio3 {

	private JFrame frame;
	private JTextField txtAnos;
	private JTextField txtConsumo;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio3 window = new TelaExercicio3();
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
	public TelaExercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnos = new JLabel("Informe quantos anos voc\u00EA \u00E9 fumante: ");
		lblAnos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnos.setBounds(10, 23, 254, 14);
		frame.getContentPane().add(lblAnos);
		
		JLabel lblConsumo = new JLabel("Informe quantos cigarros voc\u00EA consome por dia:");
		lblConsumo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConsumo.setBounds(10, 64, 306, 14);
		frame.getContentPane().add(lblConsumo);
		
		JLabel lblValor = new JLabel("Informe qual \u00E9 o valor da carteira de cigarros:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(10, 112, 290, 14);
		frame.getContentPane().add(lblValor);
		
		txtAnos = new JTextField();
		txtAnos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAnos.setBounds(262, 22, 86, 20);
		frame.getContentPane().add(txtAnos);
		txtAnos.setColumns(10);
		
		txtConsumo = new JTextField();
		txtConsumo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtConsumo.setBounds(326, 63, 86, 20);
		frame.getContentPane().add(txtConsumo);
		txtConsumo.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtValor.setBounds(298, 111, 86, 20);
		frame.getContentPane().add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							double total;
				total = ((Double.parseDouble(txtAnos.getText()) * 365) * ((Double.parseDouble(txtConsumo.getText()))))/20 * (Double.parseDouble(txtValor.getText())); 
				JOptionPane.showInternalMessageDialog(null, "Total gasto com cigarros em "+txtAnos.getText()+" anos é de R$" +total);
				
			}
		});
		
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(143, 176, 138, 48);
		frame.getContentPane().add(btnCalcular);
		
	}
}
