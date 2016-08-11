package br.scp.visao;

import org.apache.log4j.Logger;

import br.scp.controle.Controle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Formulario extends JFrame {
	private JPanel jContentPane = null;
	private JPanel pnlCentral = null;
	private JPanel pnlInferior = null;

	private JButton btnConfirma = null;
	private JButton btnLimpar = null;
	private JButton btnSair = null;
	
	static Logger logger = Logger.getLogger(Formulario.class);
	/***************************************************************************
	 * campos do formulario
	 **************************************************************************/
	private JTextField txtCPF = null;
	private JTextField txtNome = null;
	private JTextField txtEndereco= null;
	private JTextField txtTelefone= null;
	private JTextField txtHI= null;
	private JTextField txtMensagem = null;
	Controle controle;
	public Formulario() {
		super();
		logger.info("Inicializa o sistema de controle predial."); 
		inicializa();
	}
	private void inicializa() {
		this.setSize(600, 420);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastra Empresa");
		
		// Dimensiona a tela
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 600) / 2, (screenSize.height - 460) / 2,
				600, 460);// largura x altura

		// registro no listener dos objetos controlados
		controle = new Controle();
		
		// btnNovoAutor.addActionListener(this);

		// Limpa informações da tela

		// limpaCampos();
		setVisible(true);
	}
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getPnlCentral(), BorderLayout.CENTER);
			jContentPane.add(getPnlInferior(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	private JPanel getPnlInferior() {
		if (pnlInferior == null) {
			pnlInferior = new JPanel();
			pnlInferior.setBorder(BorderFactory
					.createEtchedBorder(EtchedBorder.RAISED));
			pnlInferior.add(getBtnConfirma(), null);

			pnlInferior.add(getBtnLimpar(), null);
			pnlInferior.add(getBtnSair(), null);

		}
		return pnlInferior;
	}

	private JPanel getPnlCentral() {
		if (pnlCentral == null) {
			pnlCentral = new JPanel();
			pnlCentral.setLayout(null);
			pnlCentral.setFont(new Font("Dialog", Font.PLAIN, 11));
			pnlCentral.add(getTxtCPF(), null);
			pnlCentral.add(getTxtNome(), null);
			pnlCentral.add(getTxtEndereco(), null);
			pnlCentral.add(getTxtTelefone(), null);
			pnlCentral.add(getTxtHI(), null);
			pnlCentral.add(getTxtMensagem(), null);
			

		}
		return pnlCentral;
	}
	public JTextField getTxtCPF() {
		if (txtCPF == null) {
			txtCPF = new JTextField();
			txtCPF.setSize(95, 40); // largura x altura
			txtCPF.setLocation(150, 50); // horizontal x vertical
			txtCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "CNPJ",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtCPF.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtCPF;
	}
	public JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setSize(285, 40); // largura x altura
			txtNome.setLocation(150, 100); // horizontal x vertical
			txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Razao Social",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtNome.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtNome;
	}
	public JTextField getTxtEndereco() {
		if (txtEndereco == null) {
			txtEndereco = new JTextField();
			txtEndereco.setSize(285, 40); // largura x altura
			txtEndereco.setLocation(150, 150); // horizontal x vertical
			txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Endereco",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtEndereco.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtEndereco;
	}
	public JTextField getTxtTelefone() {
		if (txtTelefone == null) {
			txtTelefone = new JTextField();
			txtTelefone.setSize(95, 40); // largura x altura
			txtTelefone.setLocation(150, 200); // horizontal x vertical
			txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Telefone",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtTelefone.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtTelefone;
	}
	public JTextField getTxtHI() {
		if (txtHI == null) {
			txtHI = new JTextField();
			txtHI.setSize(125, 40); // largura x altura
			txtHI.setLocation(150, 250); // horizontal x vertical
			txtHI.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Horario de inicio",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtHI.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtHI;
	}
	public JTextField getTxtMensagem() {
		if (txtMensagem == null) {
			txtMensagem = new JTextField();
			txtMensagem.setSize(550, 40); // largura x altura
			txtMensagem.setLocation(10, 315); // horizontal x vertical
			txtMensagem.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Mensagem",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtMensagem.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtMensagem;
	}
	public JButton getBtnConfirma() {

		if (btnConfirma == null) {
			btnConfirma = new JButton();
			btnConfirma.setFont(new Font("Dialog", Font.BOLD, 11));
			btnConfirma.setText("Confirma");
			btnConfirma.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//getTxtMensagem().setText(controle.cadastra(getTxtCPF().getText(),getTxtNome().getText(),getTxtEndereco().getText(),
							                                //   getTxtTelefone().getText()));
				}
			});
		}
		return btnConfirma;
	}

	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton();
			btnSair.setText("Sair");
			btnSair.setFont(new Font("Dialog", Font.BOLD, 11));
			btnSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return btnSair;
	}

	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setFont(new Font("Dialog", Font.BOLD, 11));
			btnLimpar.setText("Limpar");
		}
		return btnLimpar;
	}
	
}
