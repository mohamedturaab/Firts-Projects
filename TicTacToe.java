package omar.com;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

  Random random = new Random();
  JFrame fram = new JFrame();
  JPanel title_Panel = new JPanel();
  JPanel button_Panel = new JPanel();
  JLabel textFilled = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_trun;


  TicTacToe(){
    fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fram.setSize(700,700);
    fram.getContentPane().setBackground(new Color(50,50,50));
    fram.setLayout(new BorderLayout());
    fram.setVisible(true);
    textFilled.setBackground(new Color(25,25,25));
    textFilled.setForeground(new Color(25,255,00));
    textFilled.setFont(new Font("In free",Font.BOLD,75));
    textFilled.setHorizontalAlignment(JLabel.CENTER);
    textFilled.setText("Tic-Tac-Toe");
    textFilled.setOpaque(true);

    title_Panel.setLayout(new BorderLayout());
    title_Panel.setBounds(0,0,800,100);
    button_Panel.setLayout(new GridLayout(3,3));
    button_Panel.setBackground(new Color(150,150,150));
    for (int i =0; i<9; i++){
      buttons[i] = new JButton();
      button_Panel.add((buttons[i]));
      buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }

    title_Panel.add(textFilled);
    fram.add(title_Panel,BorderLayout.NORTH);
    fram.add(button_Panel);

    firstTrun();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i =0; i<9; i++){
      if (e.getSource()==buttons[i]){
        if (player1_trun){
          if (buttons[i].getText()==""){
            buttons[i].setForeground(new Color(255,0,0));
            buttons[i].setText("X");
            player1_trun=false;
            textFilled.setText("O trun");
          }
        }
      }
      else {
        if (buttons[i].getText()==""){
          buttons[i].setForeground((new Color(00,0,255)));
          buttons[i].setText("O");
          player1_trun=true;
          textFilled.setText("X trun");
          check();
        }
      }
    }

  }
  public void firstTrun(){
    try {
      Thread.sleep(2000);
    }catch (InterruptedException e){
      e.printStackTrace();
    }
    if (random.nextInt(2)==0){
      player1_trun=true;
      textFilled.setText("X trun");
    }
    else {
      player1_trun =false;
      textFilled.setText("O trun");
    }

  }
  public void check(){



  }
  public void xWins(int a, int b,int c){

  }
  public  void oWins(int a , int b , int c){

  }

}
