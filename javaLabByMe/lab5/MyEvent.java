import javax.swing.*;
import java.awt.event.*;

public class MyEvent extends JFrame{
    JButton b1;
    public static void main (String arg[]){
        MyEvent event = new MyEvent();
    }
}

public MyEvent(){
    super("Window title: Event Handling");
    b1= new JBUtton ("click me ");
    getContentPane().add(b1);
    ButtonListener listen = new ButtonListener();
    b1.addActionListener(listen);
    setVisibke(true);
    setSize(200,200);
}

class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        JButton source = (JButton)evt.getSource();
        source.setText("Button Clicked");
    }
}