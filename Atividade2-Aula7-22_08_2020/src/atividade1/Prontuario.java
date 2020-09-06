package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Prontuario extends JFrame {
	
	// Declaração global dos componentes
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextField fieldNome;
	private JTextField fieldDataNascimento;
	private JTextField fieldNaturalidade;
	private JTextField fieldTelefone;
	private JTextField fieldEndereco;
	private JTextField textFieldExame;
	private JTextField textFieldData;
	private JTextField textFieldTratamentoTipo;
	private JTextField textFieldCPF;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prontuario frame = new Prontuario();
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
	public Prontuario() {
		setResizable(false);
		setTitle("Prontu\u00E1rio M\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		
		// Barra de menu
		JMenuBar barraDeMenu = new JMenuBar();
		setJMenuBar(barraDeMenu);
		
		// Menu
		JMenu mnMenu = new JMenu("Menu");
		barraDeMenu.add(mnMenu);
		
		// Item de menu => Sair
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		mnMenu.add(menuItemSair); // inserção de item no menu
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM); // Container de painéis
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel painelDadosPessoais = new JPanel(); // Primeiro painel (painel de dados)
		painelDadosPessoais.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Dados Pessoais", new ImageIcon(Prontuario.class.getResource("/figuras/folder.png")), painelDadosPessoais, null); // Setando ícone na guia dados pessoais do tabbedPane
		painelDadosPessoais.setLayout(new MigLayout("", "[][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelNome = new JLabel("Nome"); 
		painelDadosPessoais.add(labelNome, "cell 0 0,alignx left"); 
		
		fieldNome = new JTextField(); // Campo de nome do paciente
		painelDadosPessoais.add(fieldNome, "cell 1 0 3 1,growx"); // Inserção do campo no painel
		fieldNome.setColumns(10);
		
		JLabel labelCPF = new JLabel("CPF"); 
		painelDadosPessoais.add(labelCPF, "cell 0 1,alignx left"); 
		
		textFieldCPF = new JTextField(); // Campo de cpf do paciente
		painelDadosPessoais.add(textFieldCPF, "cell 1 1,growx"); // Inserção do campo no painel
		textFieldCPF.setColumns(10);
		
		JLabel labelNaturalidade = new JLabel("Naturalidade");
		painelDadosPessoais.add(labelNaturalidade, "flowx,cell 2 1,alignx right");
		
		fieldNaturalidade = new JTextField(); // Campo de cidade de origem do paciente
		painelDadosPessoais.add(fieldNaturalidade, "cell 3 1,growx"); // Inserção do campo no painel
		fieldNaturalidade.setColumns(10);
		
		JLabel labelSexo = new JLabel("Sexo");
		painelDadosPessoais.add(labelSexo, "cell 0 2,alignx left");
		
		JComboBox comboBoxSexo = new JComboBox(); // Caixa de combinação do sexo do paciente
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"})); // Definição dos parâmetros da caixa de combinação
		painelDadosPessoais.add(comboBoxSexo, "cell 1 2,growx"); // Inserção do componente no painel
		
		JLabel labelDataNascimento = new JLabel("Data de nascimento");
		painelDadosPessoais.add(labelDataNascimento, "cell 2 2,alignx right");
		
		fieldDataNascimento = new JTextField(); // Campo de data de nascimento do paciente
		painelDadosPessoais.add(fieldDataNascimento, "cell 3 2,growx"); // Inserção do campo no painel
		fieldDataNascimento.setColumns(10);
		
		JLabel labelEstadoCivil = new JLabel("Estado Civil"); 
		painelDadosPessoais.add(labelEstadoCivil, "cell 0 3,alignx trailing");
		
		JComboBox comboBoxEstadoCivil = new JComboBox(); // Caixa de combinação do estado civil do paciente
		comboBoxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Uniao Estavel", "Casado", "Divorciado", "Viuvo"})); // Definição dos parâmetros da caixa de combinação
		painelDadosPessoais.add(comboBoxEstadoCivil, "cell 1 3,growx"); // Inserção do componente no painel
		
		JLabel labelTelefone = new JLabel("Telefone");
		painelDadosPessoais.add(labelTelefone, "cell 2 3,alignx right");
		
		fieldTelefone = new JTextField(); // Campo de telefone do paciente
		painelDadosPessoais.add(fieldTelefone, "cell 3 3,growx"); // Inserção do componente no painel
		fieldTelefone.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		painelDadosPessoais.add(labelEndereco, "cell 0 4,alignx left");
		
		fieldEndereco = new JTextField(); // Campo de telefone do paciente
		painelDadosPessoais.add(fieldEndereco, "cell 1 4 3 1,growx"); // Inserção do componente no painel
		fieldEndereco.setColumns(10);
		
		JButton buttonSalvarDadosPessoais = new JButton("Salvar");
		buttonSalvarDadosPessoais.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png"))); // Setando ícone no botão
		painelDadosPessoais.add(buttonSalvarDadosPessoais, "cell 0 5 4 1,alignx center"); // Adicionanndo botão ao painel 
		
		JPanel painelAnamnese = new JPanel(); // Segundo painel (painel de anamnese)
		painelAnamnese.setBackground(new Color(144, 238, 144));
		tabbedPane.addTab("Anamnese", new ImageIcon(Prontuario.class.getResource("/figuras/conversa.png")), painelAnamnese, null); // Setando ícone na guia anamnese do tabbedPane
		painelAnamnese.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelQueixaPrincipal = new JLabel("Queixa Principal");
		painelAnamnese.add(labelQueixaPrincipal, "cell 0 0");
		
		JScrollPane scrollPaneQueixaPrincipal = new JScrollPane(); 
		painelAnamnese.add(scrollPaneQueixaPrincipal, "cell 0 1 2 1,grow");
		
		JTextArea textAreaQueixaPrincipal = new JTextArea(); // Área de texto para queixa do paciente
		scrollPaneQueixaPrincipal.setViewportView(textAreaQueixaPrincipal); // Inserção da área de texto no viewport do painel de rolagem
		
		JLabel labelHistoricoDoenca = new JLabel("Hist\u00F3rico da Doen\u00E7a Atual");
		painelAnamnese.add(labelHistoricoDoenca, "cell 0 2");
		
		JLabel labelHistoricoFamiliar = new JLabel("Hist\u00F3rico Familiar");
		painelAnamnese.add(labelHistoricoFamiliar, "cell 1 2");
		
		JScrollPane scrollPaneHistoricoDoenca = new JScrollPane(); 
		painelAnamnese.add(scrollPaneHistoricoDoenca, "cell 0 3,grow");
		
		JTextArea textAreaHistoricoDoenca = new JTextArea(); // Área de texto para histórico da doença no paciente
		scrollPaneHistoricoDoenca.setViewportView(textAreaHistoricoDoenca); // Inserção da área de texto no viewport do painel de rolagem
		
		JScrollPane scrollPaneHistoricoFamiliar = new JScrollPane();
		painelAnamnese.add(scrollPaneHistoricoFamiliar, "cell 1 3,grow");
		
		JTextArea textAreaHistoricoFamiliar = new JTextArea(); // Área de texto do historico familiar do paciente
		scrollPaneHistoricoFamiliar.setViewportView(textAreaHistoricoFamiliar); // Inserção da área de texto no viewport do painel de rolagem
		
		JLabel labelAntecedentes = new JLabel("Antecedentes pessoais"); 
		painelAnamnese.add(labelAntecedentes, "cell 0 4");
		
		JLabel labelHabitos = new JLabel("H\u00E1bitos de vida");
		painelAnamnese.add(labelHabitos, "cell 1 4");
		
		JScrollPane scrollPaneAntecedentes = new JScrollPane();
		painelAnamnese.add(scrollPaneAntecedentes, "cell 0 5,grow");
		
		JTextArea textAreaAntecedentes = new JTextArea(); // Área de texto para antecedentes do paciente
		scrollPaneAntecedentes.setViewportView(textAreaAntecedentes); // Inserção da área de texto no viewport do painel de rolagem
		
		JScrollPane scrollPaneHabitos = new JScrollPane();
		painelAnamnese.add(scrollPaneHabitos, "cell 1 5,grow");
		
		JTextArea textAreaHabitos = new JTextArea(); // Área de texto para hábitos do paciente
		scrollPaneHabitos.setViewportView(textAreaHabitos); // Inserção da área de texto no viewport do painel de rolagem
		
		JButton buttonSalvarAnamnese = new JButton("Salvar");
		buttonSalvarAnamnese.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png"))); // Setando ícone no botão
		painelAnamnese.add(buttonSalvarAnamnese, "cell 0 6 2 1,alignx center"); // Adicionanndo botão ao painel 
		
		JPanel painelExames = new JPanel(); // Terceiro painel (painel de exames)
		painelExames.setBackground(new Color(255, 165, 0));
		tabbedPane.addTab("Exames", new ImageIcon(Prontuario.class.getResource("/figuras/test.png")), painelExames, null); // Setando ícone na guia exames do tabbedPane
		painelExames.setLayout(new MigLayout("", "[][grow]", "[grow][grow][grow][grow][grow]"));
		
		JLabel labelTipoExame = new JLabel("Tipo de Exame");
		painelExames.add(labelTipoExame, "cell 0 0,alignx trailing");
		
		textFieldExame = new JTextField(); // Campo de texto para o nome do exame do paciente
		painelExames.add(textFieldExame, "cell 1 0,growx");
		textFieldExame.setColumns(10);
		
		JLabel labelData = new JLabel("Data"); 
		painelExames.add(labelData, "cell 0 1,alignx left");
		
		textFieldData = new JTextField(); // Campo de texto para data do exame do paciente
		painelExames.add(textFieldData, "cell 1 1,alignx left");
		textFieldData.setColumns(10);
		
		JLabel labelLaudo = new JLabel("Laudo");
		painelExames.add(labelLaudo, "cell 0 2");
		
		TextArea textAreaLaudo = new TextArea();
		painelExames.add(textAreaLaudo, "cell 1 2,growx");
		
		JButton buttonSalvarExames = new JButton("Salvar");
		buttonSalvarExames.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png"))); // Setando ícone no botão
		painelExames.add(buttonSalvarExames, "cell 0 4 2 1,alignx center"); // Adicionanndo botão ao painel 
		
		JPanel painelTratamento = new JPanel(); // Quarto painel (painel de tratamento)
		painelTratamento.setBackground(new Color(233, 150, 122));
		tabbedPane.addTab("Tratamento", new ImageIcon(Prontuario.class.getResource("/figuras/remedio.png")), painelTratamento, null); // Setando ícone na guia tratamento do tabbedPane
		painelTratamento.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelTratamentoTipo = new JLabel("Tipo de Tratamento");
		painelTratamento.add(labelTratamentoTipo, "cell 0 0");
		
		textFieldTratamentoTipo = new JTextField(); // Campo de texto para o nome do tipo de tratamento do paciente
		painelTratamento.add(textFieldTratamentoTipo, "cell 0 1,growx"); // Inserção do campo no painel
		textFieldTratamentoTipo.setColumns(10);
		
		JLabel labelTratamentoDescricao = new JLabel("Descri\u00E7\u00E3o");
		painelTratamento.add(labelTratamentoDescricao, "cell 0 2");
		
		TextArea textAreaTratamentoDescricao = new TextArea(); // Área de texto para a descrição do tratamento do paciente
		painelTratamento.add(textAreaTratamentoDescricao, "cell 0 3,growx"); // Inserção da área de texto no painel
		
		JButton buttonSalvarTratamento = new JButton("Salvar"); 
		buttonSalvarTratamento.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png"))); // Setando ícone no botão
		painelTratamento.add(buttonSalvarTratamento, "cell 0 5,alignx center"); // Adicionanndo botão ao painel 
	} // public Prontuario()

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}
	
} // public class Prontuario extends JFrame
