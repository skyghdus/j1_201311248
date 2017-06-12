package com.sd.address.v1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookGUIMain {
  public static JTextField nameTf1 = new JTextField(20);
  public static JTextField phoneTf1 =  new JTextField(20);
  public static JTextField numberTf1 = new JTextField(20);
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(10,100));
    f.getContentPane().add(panel);
    JLabel label3 = new JLabel("ID");
    JLabel label1 = new JLabel("이름");
    JLabel label2 = new JLabel("전화번호");
    JButton b1 = new JButton("저장");
    JButton b2 = new JButton("제거");
    JButton b3 = new JButton("찾기");
    JButton b4 = new JButton("수정");
    b1.addActionListener(new AddressListener());
    b2.addActionListener(new AddressListener());
    b3.addActionListener(new AddressListener());
    b4.addActionListener(new AddressListener());
    panel.add(label3);
    panel.add(numberTf1);
    panel.add(label1);
    panel.add(nameTf1);
    panel.add(label2);
    panel.add(phoneTf1);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(b4);
    f.pack();
    f.setVisible(true);
  }
}
