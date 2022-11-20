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
	 private JLabel settingNoorLabel;
	 private JTextField settingNoorTextfield;
	 private JButton settingNoorSaveButton;
	 private JButton settingNoorPrintButton;
	 
	 private JLabel settingZahiaLabel;
	 private JTextField settingZahiaTextfield;
	 private JButton settingZahiaSaveButton;
	 private JButton settingZahiaPrintButton;
	 
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
		  settingNoorLabel = new JLabel("Setting Noor:");
		  settingNoorTextfield = new JTextField();
		  settingNoorSaveButton = new JButton("Save setting one");
		  settingNoorPrintButton = new JButton("Print to Console!");
		  
		  settingZahiaLabel = new JLabel("Setting Zahia:");
		  settingZahiaTextfield = new JTextField();
		  settingZahiaSaveButton = new JButton("Save setting one");
		  settingZahiaPrintButton = new JButton("Print to Console!");
		  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafLabel).addComponent(settingNoorLabel).addComponent(settingZahiaLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafTextfield).addComponent(settingNoorTextfield).addComponent(settingZahiaTextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafSaveButton).addComponent(settingNoorSaveButton).addComponent(settingZahiaSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingItafPrintButton).addComponent(settingNoorPrintButton).addComponent(settingZahiaPrintButton)));
		  
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingItafLabel)
		    .addComponent(settingItafTextfield).addComponent(settingItafSaveButton).addComponent(settingItafPrintButton))
		  
		  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingNoorLabel)
				    .addComponent(settingNoorTextfield).addComponent(settingNoorSaveButton).addComponent(settingNoorPrintButton))
		  
		  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingZahiaLabel)
				    .addComponent(settingZahiaTextfield).addComponent(settingZahiaSaveButton).addComponent(settingZahiaPrintButton)));
		  
		  
		  
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
	 public JLabel getSettingTwoLabel() {
		  return settingNoorLabel;
		 } 
		 
		 public void setSettingTwoLabel(JLabel settingTwoLabel) {
		  this.settingNoorLabel = settingTwoLabel;
		 } 
		 
		 	 
		 public JTextField getSettingTwoTextfield() {
		  return settingNoorTextfield;
		 } 
		 
		 public void setSettingTwoTextfield(JTextField settingTwoTextfield) {
		  this.settingNoorTextfield = settingTwoTextfield;
		 } 
		 
		 
		 
		 public JButton getSettingTwoSaveButton() {
		  return settingNoorSaveButton;
		 } 
		 
		 public void setSettingTowSaveButton(JButton settingTwoSaveButton) {
		  this.settingNoorSaveButton = settingTwoSaveButton;
		 } 
		 
		 	 
		 public JButton getSettingTwoPrintButton() {
		  return settingNoorPrintButton;
		 } 
		 
		 public void setPrintButton1(JButton print) {
		  this.settingNoorPrintButton = print;
		 } 
		 public JLabel getSettingThreeLabel() {
			  return settingZahiaLabel;
			 } 
			 
			 public void setSettingThreeLabel(JLabel settingThreeLabel) {
			  this.settingZahiaLabel = settingThreeLabel;
			 } 
			 
			 	 
			 public JTextField getSettingThreeTextfield() {
			  return settingZahiaTextfield;
			 } 
			 
			 public void setSettingThreeTextfield(JTextField settingThreeTextfield) {
			  this.settingZahiaTextfield = settingThreeTextfield;
			 } 
			 
			 
			 
			 public JButton getSettingThreeSaveButton() {
			  return settingZahiaSaveButton;
			 } 
			 
			 public void setSettingThreeSaveButton(JButton settingThreeSaveButton) {
			  this.settingZahiaSaveButton = settingThreeSaveButton;
			 } 
			 
			 	 
			 public JButton getSettingThreePrintButton() {
			  return settingZahiaPrintButton;
			 } 
			 
			 public void setPrintButton2(JButton print) {
			  this.settingZahiaPrintButton = print;
			 } 
}
