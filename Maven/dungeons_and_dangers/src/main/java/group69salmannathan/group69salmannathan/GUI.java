package group69salmannathan;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class GUI
{
  public void GUITEST()
  {
    JFrame jframe = new JFrame();
    
    JButton jButton = new JButton("Click");
    JLabel jLabel = new JLabel("Number of clicks: 0");

    JPanel jPanel = new JPanel();
    jPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    jPanel.setLayout(new GridLayout());
    jPanel.add(jButton);
    jPanel.add(jLabel);

    jframe.add(jPanel, BorderLayout.CENTER);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.setTitle("Opening Scene");
    jframe.pack();
    jframe.setVisible(true);
  }  

  public static void main(String[] args) 
  {
    new GUI();  
  }
}