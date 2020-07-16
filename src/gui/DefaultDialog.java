package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class DefaultDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTypeDateHere;
	private JTextField txtTypeNumberOf;
	private JTextField txtTypeBuildNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DefaultDialog dialog = new DefaultDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DefaultDialog() {
		setTitle("Add Testing Instance");
		setBounds(100, 100, 433, 281);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {72, 0, 200};
		gbl_contentPanel.rowHeights = new int[] {22, 22, 30, 30};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("BuildNumber");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 2;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			txtTypeBuildNumber = new JTextField();
			txtTypeBuildNumber.setText("Type Build number here");
			GridBagConstraints gbc_txtTypeBuildNumber = new GridBagConstraints();
			gbc_txtTypeBuildNumber.gridwidth = 5;
			gbc_txtTypeBuildNumber.fill = GridBagConstraints.BOTH;
			gbc_txtTypeBuildNumber.insets = new Insets(0, 0, 5, 0);
			gbc_txtTypeBuildNumber.gridx = 2;
			gbc_txtTypeBuildNumber.gridy = 0;
			contentPanel.add(txtTypeBuildNumber, gbc_txtTypeBuildNumber);
			txtTypeBuildNumber.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Date");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.gridwidth = 2;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			txtTypeDateHere = new JTextField();
			txtTypeDateHere.setText("Type Date Here");
			GridBagConstraints gbc_txtTypeDateHere = new GridBagConstraints();
			gbc_txtTypeDateHere.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtTypeDateHere.anchor = GridBagConstraints.NORTH;
			gbc_txtTypeDateHere.insets = new Insets(0, 0, 5, 0);
			gbc_txtTypeDateHere.gridwidth = 5;
			gbc_txtTypeDateHere.gridx = 2;
			gbc_txtTypeDateHere.gridy = 1;
			contentPanel.add(txtTypeDateHere, gbc_txtTypeDateHere);
			txtTypeDateHere.setColumns(10);
		}
		{
			JLabel lblNumberOfIssues = new JLabel("Number of Issues");
			GridBagConstraints gbc_lblNumberOfIssues = new GridBagConstraints();
			gbc_lblNumberOfIssues.gridwidth = 2;
			gbc_lblNumberOfIssues.insets = new Insets(0, 0, 5, 5);
			gbc_lblNumberOfIssues.gridx = 0;
			gbc_lblNumberOfIssues.gridy = 2;
			contentPanel.add(lblNumberOfIssues, gbc_lblNumberOfIssues);
		}
		{
			txtTypeNumberOf = new JTextField();
			txtTypeNumberOf.setText("Type number of issues here");
			GridBagConstraints gbc_txtTypeNumberOf = new GridBagConstraints();
			gbc_txtTypeNumberOf.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtTypeNumberOf.gridwidth = 5;
			gbc_txtTypeNumberOf.anchor = GridBagConstraints.NORTH;
			gbc_txtTypeNumberOf.insets = new Insets(0, 0, 5, 0);
			gbc_txtTypeNumberOf.gridx = 2;
			gbc_txtTypeNumberOf.gridy = 2;
			contentPanel.add(txtTypeNumberOf, gbc_txtTypeNumberOf);
			txtTypeNumberOf.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Notes");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
			gbc_lblNewLabel_2.gridheight = 2;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_2.gridx = 0;
			gbc_lblNewLabel_2.gridy = 3;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 3;
			gbc_scrollPane.gridwidth = 5;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 2;
			gbc_scrollPane.gridy = 3;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				JTextArea textArea = new JTextArea();
				textArea.setLineWrap(true);
				scrollPane.setViewportView(textArea);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
			{
				Component horizontalStrut = Box.createHorizontalStrut(20);
				buttonPane.add(horizontalStrut);
			}
			{
				JButton okButton = new JButton("Confirm");
				okButton.setActionCommand("Confirm");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				Component horizontalGlue = Box.createHorizontalGlue();
				buttonPane.add(horizontalGlue);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			{
				Component horizontalStrut = Box.createHorizontalStrut(20);
				buttonPane.add(horizontalStrut);
			}
		}
	}

}
