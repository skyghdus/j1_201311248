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
    if (cmd.equals("����")) {
      System.out.println("�����ư");
      //data += k;
      //t.setText("333333");
      b.setText("�����߽��ϴ�.");
    } else if (cmd.equals("����")) {
      System.out.println("���Ź�ư");
      b.setText("�����߽��ϴ�.");
    } else {
      System.out.println("��ư�� XXX�� �����ϸ� cmd�� ����ȴ�");
    }
  }
}