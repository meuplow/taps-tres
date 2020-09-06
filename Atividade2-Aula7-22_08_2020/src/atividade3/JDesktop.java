package atividade3;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import atividade1.Prontuario;
import atividade2.JSplit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDesktop extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDesktop frame = new JDesktop();
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
	public JDesktop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Adicionar");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem1 = new JMenuItem("JTabbedPaneDemo");
		menuItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame jifTP = new JInternalFrame("JTabbedPaneDemo", false);
				Prontuario p = new Prontuario();
				jifTP.setBounds(p.getBounds());
				jifTP.setVisible(true);
				jifTP.setContentPane(p.getTabbedPane());;
				desktopPane.add(jifTP);
				jifTP.setClosable(true);
			}
		});
		mnNewMenu.add(menuItem1);
		
		JMenuItem menuItem2 = new JMenuItem("JSplitDemo");
		menuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame jifSP = new JInternalFrame("JTabbedPaneDemo", false);
				JSplit sp = new JSplit();
				jifSP.setBounds(sp.getBounds());
				jifSP.setVisible(true);
				jifSP.setContentPane(sp.getSplitPane());
				desktopPane.add(jifSP);
				jifSP.setClosable(true);
			}
		});
		mnNewMenu.add(menuItem2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

}
