package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio4 {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio4 window = new TelaExercicio4();
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
	public TelaExercicio4() {
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
		
		JLabel lblN1 = new JLabel("Informe o primeiro n\u00FAmero:");
		lblN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN1.setBounds(10, 35, 174, 14);
		frame.getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("Informe o segundo n\u00FAmero:");
		lblN2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN2.setBounds(10, 99, 188, 14);
		frame.getContentPane().add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(194, 34, 86, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(194, 98, 86, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblMaior = new JLabel("");
		lblMaior.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaior.setBounds(238, 184, 186, 66);
		frame.getContentPane().add(lblMaior);
		
		JButton btnComparar = new JButton("Comparar n\u00FAmeros");
		btnComparar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int maior;
				int num1;
				int num2;
				
				num1 = (Integer.parseInt(txtN1.getText()));
				num2 = (Integer.parseInt(txtN2.getText()));
				
				if (num1 > num2) {
					maior = num1;
					lblMaior.setText("O número "+num1+" é o maior!");
				} else if (num2 > num1) {
					maior = num2;
					lblMaior.setText("O número "+num2+" é o maior!");
				} else {
					lblMaior.setText("O números são iguais");
				}
			}
		});
		btnComparar.setBounds(36, 203, 174, 23);
		frame.getContentPane().add(btnComparar);
		
	}

}
