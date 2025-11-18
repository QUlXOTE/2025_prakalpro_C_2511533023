package Pekan8_2511533023;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533023 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbil1;
	private JTextField txtbil2;
	private JTextField txtHasil;
	
	private void pesanperingatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533023 frame = new OperatorAritmatikaGUI_2511533023();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533023() {
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setBounds(176, 10, 118, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("bilangan 1");
		lblNewLabel_1.setBounds(30, 75, 77, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("bilangan 2");
		lblNewLabel_1_1.setBounds(30, 97, 77, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(30, 133, 77, 12);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(30, 177, 77, 12);
		contentPane.add(lblNewLabel_1_3);
		
		txtbil1 = new JTextField();
		txtbil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtbil1.setBounds(95, 72, 52, 18);
		contentPane.add(txtbil1);
		txtbil1.setColumns(10);
		
		txtbil2 = new JTextField();
		txtbil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtbil2.setBounds(95, 94, 52, 18);
		contentPane.add(txtbil2);
		txtbil2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(95, 174, 52, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox<?> cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(95, 129, 52, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			 int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtbil1.getText().trim().isEmpty()) {
					pesanperingatan("bilangan 1 harus diisi");
				}else if (txtbil1.getText().trim().isEmpty()) {
					pesanperingatan("bilangan 2 harus diisi");
				}else {
					try {
						int a = Integer.valueOf(txtbil1.getText());
						int b = Integer.valueOf(txtbil2.getText());
						int c = cbOperator.getSelectedIndex();
						if (c==0) {hasil=a+b;}
						if (c==1) {	hasil= a-b;}
						if (c==2) {hasil= a*b;}
						if (c==3) {hasil= a/b;}
						if (c==4) {hasil= a%b;}
						txtHasil.setText(String.valueOf(hasil));
					}catch ( NumberFormatException ex) {
						pesanEror("bilangan 1 dan bilangan 2 harus angka");
					}
				}
			}
			
		});
		btnNewButton.setBounds(176, 129, 84, 20);
		contentPane.add(btnNewButton);
	}
}
