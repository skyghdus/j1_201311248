package com.sd.address.v1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AddressBookGUIMain {
  public static JTextField nameTf1 = new JTextField(20);
  public static JTextField phoneTf1 =  new JTextField(20);
  public static JTextField numberTf1 = new JTextField(20);
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JFrame r = new JFrame();
    Object[][] data = {
      {"정호연", 
        "01062791476"},
      {"홍길동", 
        "01012345678"},
      {"홍길동", 
        "01012345678"}
    };
    String[] columnNames = {"Name", 
      "Phone Number"};
    JTable table = new JTable(data, columnNames);
    JPanel panel = new JPanel(new GridLayout(9,100));
    JPanel panel2 = new JPanel(new GridLayout());
    //f.getContentPane().add(panel);
    //f.setSize(200,400);
    f.getContentPane().add(panel);
    r.getContentPane().add(panel2);
    JLabel label3 = new JLabel("ID");
    JLabel label1 = new JLabel("이름");
    JLabel label2 = new JLabel("전화번호");
    JLabel labelE = new JLabel(" ");
    JScrollPane scrollPane = new JScrollPane(table);
    JButton b1 = new JButton("저장");
    JButton b2 = new JButton("제거");
    JButton b3 = new JButton("찾기");
    b1.addActionListener(new AddressListener());
    b2.addActionListener(new AddressListener());
    b3.addActionListener(new AddressListener());
    panel.add(label3);
    panel.add(numberTf1);
    //panel.add(labelE);
    panel.add(label1);
    panel.add(nameTf1);
    //panel.add(labelE);
    panel.add(label2);
    panel.add(phoneTf1);
    //44panel.add(labelE);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel2.add(scrollPane);
    f.pack();
    f.setVisible(true);
    //r.pack();
    //r.setVisible(true);
  }
}
