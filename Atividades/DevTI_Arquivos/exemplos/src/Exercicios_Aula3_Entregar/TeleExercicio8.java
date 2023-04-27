package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeleExercicio8 {

	private JFrame frame;
	private JTextField txtBase;
	private JTextField txtExpoente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeleExercicio8 window = new TeleExercicio8();
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
	public TeleExercicio8() {
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
		
		JLabel lblBase = new JLabel("Informe o valor da base:");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBase.setBounds(29, 44, 173, 14);
		frame.getContentPane().add(lblBase);
		
		JLabel lblNewLabel = new JLabel("Informe o valor do expoente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(29, 96, 197, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtBase = new JTextField();
		txtBase.setBounds(189, 43, 86, 20);
		frame.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		txtExpoente = new JTextField();
		txtExpoente.setBounds(219, 95, 86, 20);
		frame.getContentPane().add(txtExpoente);
		txtExpoente.setColumns(10);
		
		JLabel lblCalculo = new JLabel("");
		lblCalculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCalculo.setBounds(101, 218, 234, 32);
		frame.getContentPane().add(lblCalculo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2;
				double pot;
				
				num1 = Integer.parseInt(txtBase.getText());
				num2 = Integer.parseInt(txtExpoente.getText());
				
				pot = Math.pow(num1, num2);
				lblCalculo.setText(num1+" elavado a "+num2+" é = "+pot);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(141, 153, 134, 41);
		frame.getContentPane().add(btnCalcular);
		
	}

}
