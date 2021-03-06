package pipe.gui.widgets;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;

import pipe.dataLayer.Arc;
import pipe.dataLayer.DataLayer;
import pipe.dataLayer.DataType;

import pipe.gui.GuiView;

public class ArcEditorPanel extends JPanel 
{
		Arc arc;

	   String name;
	   DataLayer pnmlData;
	   GuiView view;
	   JRootPane rootPane;
	   
	   
	   /**
	    * Creates new form PlaceEditor
	    */
	   public ArcEditorPanel(JRootPane _rootPane, Arc _arc,
	           DataLayer _pnmlData, GuiView _view) {
		   arc = _arc;
	      pnmlData = _pnmlData;
	      view = _view;
	      name = arc.getType() + arc.getName();
	      rootPane = _rootPane;
	      
	      initComponents();
	      rootPane.setDefaultButton(okButton);
	      
	   }
	   
	   /** This method is called from within the constructor to
	    * initialize the form.
	    * WARNING: Do NOT modify this code. The content of this method is
	    * always regenerated by the Form Editor.
	    */
	   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
	   private void initComponents() {
	      java.awt.GridBagConstraints gridBagConstraints;

	      ArcEditorPanel = new javax.swing.JPanel();
	      nameLabel = new javax.swing.JLabel();
	      nameTextField = new javax.swing.JTextField();

	      buttonPanel = new javax.swing.JPanel();
	      okButton = new javax.swing.JButton();
	      cancelButton = new javax.swing.JButton();
	      varTextField = new javax.swing.JTextField();
	      varLabel = new javax.swing.JLabel();
	      
	      dataTypename = new javax.swing.JLabel();
	      dataTypeLabel = new javax.swing.JLabel();

	      setLayout(new java.awt.GridBagLayout());

	      ArcEditorPanel.setLayout(new java.awt.GridBagLayout());

	      ArcEditorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Arc Editor"));
	      
	      dataTypename.setText("Type: ");
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 0;
	      gridBagConstraints.gridy = 0;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(dataTypename, gridBagConstraints);
	      
	      dataTypeLabel.setText("(Not Defined)");
	      if(arc.getDataType() != null)
	      {
	    	  DataType d = arc.getDataType();
	    	  if(d.getDef())
	    	  {
	    		  Vector<String> types = d.getTypes();
				  String s;
				  if(d.getPow())
					  s = "P(< ";
				  else s = "< ";
				  for(int j = 0; j < types.size(); j ++)
				  {
					  s += types.get(j);
					  if(j < types.size() - 1)
					  {
						  s += " ,";
					  }
				  }
				  if(d.getPow())
					  s += " >)";
				  else s += " >";
			   this.dataTypeLabel.setText(s);
	    	  }
	      }
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 1;
	      gridBagConstraints.gridy = 0;
	      dataTypeLabel.setMaximumSize(new java.awt.Dimension(150, 20));
	      dataTypeLabel.setMinimumSize(new java.awt.Dimension(150, 20));
	      dataTypeLabel.setPreferredSize(new java.awt.Dimension(150, 20));
	      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(dataTypeLabel, gridBagConstraints);
	      
	      nameLabel.setText("Name:");
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 0;
	      gridBagConstraints.gridy = 1;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(nameLabel, gridBagConstraints);

	      nameTextField.setText(arc.getName());
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 1;
	      gridBagConstraints.gridy = 1;
	      nameTextField.setMaximumSize(new java.awt.Dimension(150, 20));
	      nameTextField.setMinimumSize(new java.awt.Dimension(150, 20));
	      nameTextField.setPreferredSize(new java.awt.Dimension(150, 20));
	      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(nameTextField, gridBagConstraints);
	      
	      varLabel.setText("Variable:");
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 0;
	      gridBagConstraints.gridy = 2;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(varLabel, gridBagConstraints);

	      varTextField.setText(arc.getVar());
	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 1;
	      gridBagConstraints.gridy = 2;
	      varTextField.setMaximumSize(new java.awt.Dimension(150, 20));
	      varTextField.setMinimumSize(new java.awt.Dimension(150, 20));
	      varTextField.setPreferredSize(new java.awt.Dimension(150, 20));
	      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	      ArcEditorPanel.add(varTextField, gridBagConstraints);

	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridwidth = 2;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
	      gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
	      add(ArcEditorPanel, gridBagConstraints);

	      buttonPanel.setLayout(new java.awt.GridBagLayout());

	      okButton.setText("OK");
	      okButton.setMaximumSize(new java.awt.Dimension(75, 25));
	      okButton.setMinimumSize(new java.awt.Dimension(75, 25));
	      okButton.setPreferredSize(new java.awt.Dimension(75, 25));
	      okButton.addActionListener(new java.awt.event.ActionListener() {
	         public void actionPerformed(java.awt.event.ActionEvent evt) {
	            okButtonHandler(evt);
	         }
	      });
	      okButton.addKeyListener(new java.awt.event.KeyAdapter() {
	         public void keyPressed(java.awt.event.KeyEvent evt) {
	            okButtonKeyPressed(evt);
	         }
	      });

	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 0;
	      gridBagConstraints.gridy = 0;
	      gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	      gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 9);
	      buttonPanel.add(okButton, gridBagConstraints);

	      cancelButton.setText("Cancel");
	      cancelButton.addActionListener(new java.awt.event.ActionListener() {
	         public void actionPerformed(java.awt.event.ActionEvent evt) {
	            cancelButtonHandler(evt);
	         }
	      });

	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 1;
	      gridBagConstraints.gridy = 0;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
	      gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 10);
	      buttonPanel.add(cancelButton, gridBagConstraints);

	      gridBagConstraints = new java.awt.GridBagConstraints();
	      gridBagConstraints.gridx = 1;
	      gridBagConstraints.gridy = 1;
	      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	      add(buttonPanel, gridBagConstraints);

	   }// </editor-fold>//GEN-END:initComponents

	   
	   ChangeListener changeListener = new javax.swing.event.ChangeListener() {
	      public void stateChanged(javax.swing.event.ChangeEvent evt) {
	         JSpinner spinner = (JSpinner)evt.getSource();
	         JSpinner.NumberEditor numberEditor =
	                 ((JSpinner.NumberEditor)spinner.getEditor());
	         numberEditor.getTextField().setBackground(new Color(255,255,255));
	         spinner.removeChangeListener(this);
	      }
	   };   

	   
	   private void okButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyPressed
	      if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
	         doOK();
	      }
	   }//GEN-LAST:event_okButtonKeyPressed

	   private void doOK(){
	
		  arc.setName(nameTextField.getText());
		  arc.setVar(varTextField.getText());
		  arc.setVar();
	      arc.repaint();
	      exit();
	   }
	   
	   
	   private void okButtonHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonHandler
	      doOK();
	   }//GEN-LAST:event_okButtonHandler

	   
	   private void exit() {
	      rootPane.getParent().setVisible(false);
	   }
	   
	   
	   private void cancelButtonHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonHandler
	      exit();
	   }//GEN-LAST:event_cancelButtonHandler


	      
	   
	   // Variables declaration - do not modify//GEN-BEGIN:variables
	   private javax.swing.JPanel buttonPanel;
	   private javax.swing.JButton cancelButton;


	   private javax.swing.JLabel nameLabel;
	   private javax.swing.JTextField nameTextField;
	   private javax.swing.JButton okButton;
	   private javax.swing.JPanel ArcEditorPanel;
	   
	   private javax.swing.JTextField varTextField;
	   private javax.swing.JLabel varLabel;
	   private javax.swing.JLabel dataTypename;
	   private javax.swing.JLabel dataTypeLabel;
	   // End of variables declaration//GEN-END:variables

}
