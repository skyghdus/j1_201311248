package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

class AddressListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    //String = nameTf1.getText();
    //String k = "{"+t+"}";
    //Object[][] data = {};
    //JTextField t = (JTextField)e.getSource();
    String cmd = e.getActionCommand();
    if (cmd.equals("저장")) {
      System.out.println("저장버튼");
      //data += k;
      //t.setText("333333");
      b.setText("저장했습니다.");
    } else if (cmd.equals("제거")) {
      System.out.println("제거버튼");
      b.setText("제거했습니다.");
    } else {
      System.out.println("버튼을 XXX로 변경하면 cmd도 변경된다");
    }
  }
}