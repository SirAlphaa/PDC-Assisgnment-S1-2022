package group69salmannathan;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javafx.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.Label;
import java.awt.event.*; 
import java.awt.*;

public class GUI implements ActionListener
{
  int count = 0;

  private static JFrame jframe;
  private static JLabel jLabel;
  private static JButton button1;
  private static JPanel jPanel;

  public static void Intro()
  { 
    jframe = new JFrame();
    
    button1 = new JButton("Click");
   // JButton button2 = new JButton("LMAO");
    //JButton button3 = new JButton("ROFL");
    button1.setPreferredSize(new Dimension(300,300));
    //button2.setPreferredSize(new Dimension(70,30));
   // button3.setPreferredSize(new Dimension(70,30));
    button1.addActionListener(Dungeon); //FIXME: Idk how to fix this tbh.

    jLabel = new JLabel("Number of clicks: 0");
    //jLabel.setAlignmentX(alignmentX);
    //jLabel.setAlignmentY(alignmentY);

    jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createEmptyBorder(300, 550, 300, 550));
    jPanel.setLayout(new GridLayout());
    jPanel.add(button1);
    //jPanel.add(button2);
    //jPanel.add(button3);
    jPanel.add(jLabel);

    jframe.add(jPanel, BorderLayout.CENTER);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.setTitle("Opening Scene");
    jframe.pack();
    jframe.setVisible(true);

    //TODO: Actually work on this
  }  

  public static void Battle()
  {
    //TODO: Write da GUI for battle stuff
  }

  public static void DungeonChoice()
  {
    //TODO: Write GUI for the dungeon choice
  }

  public static void Story()
  {
    //TODO: Write GUI for story elements
  }

  public static void main(String[] args) 
  {
    GUI.Intro();  
    //GUI.Battle();
  }

  @Override
  public void actionPerformed(java.awt.event.ActionEvent e) 
  {
    count++;
    jLabel.setText("Number of clicks: " + count);
  }
}