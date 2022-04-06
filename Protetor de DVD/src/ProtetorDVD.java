import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProtetorDVD extends JFrame {

	static private JPanel painel;
	static private JLabel dvd;

	public ProtetorDVD() {
		super("DVD");

//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setSize(800, 720);
//		this.setLocationRelativeTo(null);
//		this.setJLabel(getDvd());
//		this.setVisible(true);
//		setLayout(null);
//		repaint();
	}
//	
//	private void setJLabel(JLabel dvd) {
//		this.dvd = dvd;
//	}
//
//	public JLabel getDvd() {
//		
//		if(dvd == null) {
//			
//		}
//		
//		return dvd;
//	}

	public static void main(String[] args) {

		new ProtetorDVD();

		ProtetorDVD tela = new ProtetorDVD();
		tela.setVisible(true);
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tela.setSize(800, 800);
		tela.setLocationRelativeTo(null);
		

		painel = new JPanel();
		painel.setLayout(null);
		tela.setContentPane(painel);
		tela.setContentPane(painel);
		painel.setBackground(Color.BLACK);

		dvd = new JLabel("DVD");
		dvd.setBounds(5, 5, 85, 40);
		dvd.setFont(new Font("Arial", Font.BOLD, 40));
		dvd.setForeground(Color.WHITE);
		painel.add(dvd);

		tela.repaint();

		try {

			while (true) {

				for (int i = 0; i < 690; i++) {

					if (dvd.getLocation().x >= 5 & dvd.getLocation().y >= 5) {

						dvd.setLocation(dvd.getLocation().x + 1, dvd.getLocation().y + 1);
						Thread.sleep(2);
						dvd.setForeground(Color.WHITE);

					}
				}

				for (int i = 0; i < 690; i++) {

					if (dvd.getLocation().x >= 5 & dvd.getLocation().y >= 5) {

						dvd.setLocation(dvd.getLocation().x - 1, dvd.getLocation().y - 1);
						Thread.sleep(2);
						dvd.setForeground(Color.RED);
					}
				}

				for (int i = 0; i < 690; i++) {

					if (dvd.getLocation().x >= 5 & dvd.getLocation().y >= 5) {

						dvd.setLocation(dvd.getLocation().x + 1, dvd.getLocation().y);
						Thread.sleep(2);
						dvd.setForeground(Color.GREEN);
					}
				}

				for (int i = 0; i < 690; i++) {

					if (dvd.getLocation().x >= 5 & dvd.getLocation().y >= 5) {

						dvd.setLocation(dvd.getLocation().x - 1, dvd.getLocation().y + 1);
						Thread.sleep(2);
						dvd.setForeground(Color.BLUE);
					}
				}

				for (int i = 0; i < 690; i++) {

					if (dvd.getLocation().x >= 5 & dvd.getLocation().y >= 5) {

						dvd.setLocation(dvd.getLocation().x, dvd.getLocation().y - 1);
						Thread.sleep(2);
						dvd.setForeground(Color.YELLOW);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
