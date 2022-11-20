import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SettingsView {

	 private JFrame frame;
	 
	 //Setting One needed View elements
	 //ITAF
	 private JLabel settingItafLabel;
	 private JTextField settingItafTextfield;
	 private JButton settingItafSaveButton;
	 private JButton settingItafPrintButton;
	 //ITAF
	 
	 public SettingsView() {
	 
		  frame = new JFrame("Settings");
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 120);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);  
		  
		  // Create UI elements
		  //ITAF
		  settingItafLabel = new JLabel("Setting Itaf:");
		  settingItafTextfield = new JTextField();
		  settingItafSaveButton = new JButton("Save setting one");
		  settingItafPrintButton = new JButton("Print to Console!");
		  //ITAF  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafTextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafPrintButton)));
		  
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingItafLabel)
		    .addComponent(settingItafTextfield).addComponent(settingItafSaveButton).addComponent(settingItafPrintButton)));
		  
		  
		  frame.getContentPane().setLayout(layout);
		  
		 } 
	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 } 
	 //ITAF
	 public JLabel getSettingOneLabel() {
	  return settingItafLabel;
	 } 
	 
	 public void setSettingOneLabel(JLabel settingOneLabel) {
	  this.settingItafLabel = settingOneLabel;
	 } 
	 
	 	 
	 public JTextField getSettingOneTextfield() {
	  return settingItafTextfield;
	 } 
	 
	 public void setSettingOneTextfield(JTextField settingOneTextfield) {
	  this.settingItafTextfield = settingOneTextfield;
	 } 
	 
	 
	 
	 public JButton getSettingOneSaveButton() {
	  return settingItafSaveButton;
	 } 
	 
	 public void setSettingOneSaveButton(JButton settingOneSaveButton) {
	  this.settingItafSaveButton = settingOneSaveButton;
	 } 
	 
	 	 
	 public JButton getSettingOnePrintButton() {
	  return settingItafPrintButton;
	 } 
	 
	 public void setPrintButton(JButton print) {
	  this.settingItafPrintButton = print;
	 } 
	 //ITAF
}
