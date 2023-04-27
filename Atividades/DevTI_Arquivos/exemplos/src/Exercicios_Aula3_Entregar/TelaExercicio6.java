package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio6 {

	private JFrame frame;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio6 window = new TelaExercicio6();
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
	public TelaExercicio6() {
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
		
		JLabel lblIdade = new JLabel("Informe a sua idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(20, 41, 139, 14);
		frame.getContentPane().add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(169, 40, 86, 20);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblDoador = new JLabel("");
		lblDoador.setBounds(90, 201, 264, 49);
		frame.getContentPane().add(lblDoador);
		
		JButton btnVerificar = new JButton("Verificar se pode ser doador de sangue");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade;
				
				idade = (Integer.parseInt(txtIdade.getText()));

				if (idade >= 18 && idade <= 67) {
					lblDoador.setText("Você pode ser doador de sangue!");
				} else {
					lblDoador.setText("Você não pode ser doador de sangue!");
				}				
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(20, 100, 388, 56);
		frame.getContentPane().add(btnVerificar);
		
	}

}
