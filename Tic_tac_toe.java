import java.awt.*;

import java.awt.event.*;

import javax.lang.model.util.ElementScanner6;

 class tic_tac_toe implements ActionListener {
    
    Frame f;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    
    TextField t1;

    int counter = 1;
    String entry, x, y, z, win;

    tic_tac_toe() {
        f = new Frame("Tic Tac Toe");
        b1 = new Button("");
        b2 = new Button(" ");
        b3 = new Button("  ");
        b4 = new Button("   ");
        b5 = new Button("    ");
        b6 = new Button("     ");
        b7 = new Button("      ");
        b8 = new Button("       ");
        b9 = new Button("        ");
        t1 = new TextField();

        f.setLayout(null);

        b1.setBounds(20, 50, 50, 50);
        b2.setBounds(70, 50, 50, 50);
        b3.setBounds(120, 50, 50, 50);
        b4.setBounds(20, 100, 50, 50);
        b5.setBounds(70, 100, 50, 50);
        b6.setBounds(120, 100, 50, 50);
        b7.setBounds(20, 150, 50, 50);
        b8.setBounds(70, 150, 50, 50);
        b9.setBounds(120, 150, 50, 50);
        t1.setBounds(20 ,250,150, 50);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(t1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        t1.addActionListener(this);

        f.setSize(200, 350);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        counter = counter + 1;

        if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9) {
            entry = "X";
        } else {
            entry = "O";
        }

        if (event.getSource() == b1) {
            b1.setLabel(entry);
            b1.setEnabled(false);
        } else if (event.getSource() == b2) {
            b2.setLabel(entry);
            b2.setEnabled(false);
        } else if (event.getSource() == b3) {
            b3.setLabel(entry);
            b3.setEnabled(false);
        } else if (event.getSource() == b4) {
            b4.setLabel(entry);
            b4.setEnabled(false);
        } else if (event.getSource() == b5) {
            b5.setLabel(entry);
            b5.setEnabled(false);
        } else if (event.getSource() == b6) {
            b6.setLabel(entry);
            b6.setEnabled(false);
        } else if (event.getSource() == b7) {
            b7.setLabel(entry);
            b7.setEnabled(false);
        } else if (event.getSource() == b8) {
            b8.setLabel(entry);
            b8.setEnabled(false);
        } else if (event.getSource() == b9) {
            b9.setLabel(entry);
            b9.setEnabled(false);
        }



        //a = entry;  
        
        // 1,2,3
        // 1,4,7
        // 1,5,9
        // 5,6,4
        // 5,8,2
        // 5,3,7
        // 9,7,8
        // 9,3,6
        // // x = b1.getLabel();
        // // y = b5.getLabel();
        // // z = b9.getLabel();
        if(b1.getLabel().equals(b2.getLabel()) && b1.getLabel().equals(b3.getLabel()) ){
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
                }
        else if(b1.getLabel().equals(b4.getLabel()) && b1.getLabel().equals(b7.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
         
    }
        else if(b1.getLabel().equals(b5.getLabel()) && b1.getLabel().equals(b9.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
        }
        else if(b9.getLabel().equals(b3.getLabel()) && b9.getLabel().equals(b6.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
        }
        else if(b9.getLabel().equals(b7.getLabel()) && b9.getLabel().equals(b8.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
        }
        else if(b5.getLabel().equals(b3.getLabel()) && b5.getLabel().equals(b7.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
        }
        else if(b5.getLabel().equals(b8.getLabel()) && b5.getLabel().equals(b2.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
            
    }
        else if(b5.getLabel().equals(b6.getLabel()) && b5.getLabel().equals(b4.getLabel()))
        {
        win = entry;
        t1.setText("winner is "+win+" player");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
            
    }
        else
        {
            t1.setText("Match Drawn");
        }
        }
        public static void main(String[] args) {
        tic_tac_toe t = new tic_tac_toe();
    }
}