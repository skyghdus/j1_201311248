//2017년 5월 2일 패키지주소 수정하였습니다.
//package com.sd.gui;
package com.sd.address.v0;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AddressBookGUIMain {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JFrame r = new JFrame();
    Object[][] data = {
      {"정호연", 
        "01062791476"},
      {"홍길동", 
        "01012345678"}
    };
    String[] columnNames = {"Name", 
      "Phone Number"};
    JTable table = new JTable(data, columnNames);
    JPanel panel = new JPanel(new GridLayout(3, 2));
    JPanel panel2 = new JPanel(new GridLayout());
    f.getContentPane().add(panel);
    r.getContentPane().add(panel2);
    JLabel label1 = new JLabel("이름");
    JLabel label2 = new JLabel("전화번호");
    JTextField nameTf1= new JTextField(20);
    JTextField phoneTf1= new JTextField(20);
    JScrollPane scrollPane = new JScrollPane(table);
    JButton b1 = new JButton("저장");
    JButton b2 = new JButton("제거");
    b1.addActionListener(new AddressListener());
    b2.addActionListener(new AddressListener());
    panel.add(label1);
    panel.add(nameTf1);
    panel.add(label2);
    panel.add(phoneTf1);
    panel.add(b1);
    panel.add(b2);
    panel2.add(scrollPane);
    f.pack();
    f.setVisible(true);
    r.pack();
    r.setVisible(true);
  }
}

