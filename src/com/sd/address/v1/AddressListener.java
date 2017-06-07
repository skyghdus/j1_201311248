package com.sd.address.v1;
  
 import java.awt.event.*;
import javax.swing.*;

class AddressListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    AddressBookGUIMain a = new AddressBookGUIMain();
    
    if (cmd.equals("����")) {
     person.setName(a.nameTf1.getText());
     person.setAddress(a.phoneTf1.getText());
     personDAOImpl.insert(person);
    } else if (cmd.equals("����")) {
      int x=Integer.parseInt(a.numberTf1.getText());
      personDAOImpl.delete(x);
    } else if (cmd.equals("ã��")) {
      String n = person.getName();
      System.out.println(n);
    }
  }
}