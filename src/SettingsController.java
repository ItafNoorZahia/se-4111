
public class SettingsController {
	private SettingsModel model;
	private SettingsView view; 
 
	 public SettingsController(SettingsModel m, SettingsView v) {
	  model = m;
	  view = v;
	  initView();
	 } 
	 
	
	 
	 public void initView() {
	  view.getSettingOneTextfield().setText(Integer.toString(model.getItafConfig()));
	  view.getSettingTwoTextfield().setText(Integer.toString(model.getNoorConfig()));
	  view.getSettingTwoTextfield().setText(Integer.toString(model.getZahiaConfig()));
	 } 
	 
	 
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
	  
      view.getSettingTwoSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingTwoPrintButton().addActionListener(e -> printToConsole());
      view.getSettingThreeSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingThreePrintButton().addActionListener(e -> printToConsole());
	 } 
	 
	 private void saveSettingOne() {
	  model.setItafConfig(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  model.setNoorConfig(Integer.parseInt(view.getSettingTwoTextfield().getText()));
	  model.setZahiaConfig(Integer.parseInt(view.getSettingThreeTextfield().getText()));

	  } 
	 
	 private void printToConsole() {
	  System.out.println(model.getItafConfig());
	  System.out.println(model.getNoorConfig());
	  System.out.println(model.getZahiaConfig());


	 } 
	 
	
}
