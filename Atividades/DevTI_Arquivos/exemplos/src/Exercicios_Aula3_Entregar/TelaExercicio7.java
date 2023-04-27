package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaExercicio7 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio7 window = new TelaExercicio7();
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
	public TelaExercicio7() {
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
		
		JLabel lblNewLabel = new JLabel("Daqui ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 43, 53, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAnos = new JLabel("");
		lblAnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnos.setBounds(76, 46, 53, 14);
		frame.getContentPane().add(lblAnos);
		
		JLabel lblNewLabel_1 = new JLabel("anos, Z\u00E9 vai ser maior que Chico");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(139, 44, 231, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnVerificar = new JButton("Verificar idade de Z\u00E9");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int anos = 0;
				float altze = (float) 1.10, altchico = (float) 1.50;
							
				do {
					altze = (float) (altze + 0.03);
					altchico = (float) (altchico + 0.02);
					anos = anos+1;
				} while (altze <= altchico);

				lblAnos.setText(Integer.toString(anos));
				
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(64, 154, 306, 66);
		frame.getContentPane().add(btnVerificar);
	}

}
