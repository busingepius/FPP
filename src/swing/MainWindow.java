/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 25/01/2024
 * Time : 10:13
 * Project Name : swing
 */
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JFrame frame;
    public MainWindow(){
        frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLayout(null);
//        frame.setLocationRelativeTo(null);
        JButton button = new JButton("Click ME");
        button.setSize(100,50);
//        button.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                frame.setTitle("Clicked");
//                button.setText("Clicked");
//                button.setEnabled(false);
//            }
//        });
        button.addActionListener(e -> {
            frame.setTitle("Clicked");
            button.setText("Clicked");
            button.setEnabled(false);
        });
        frame.add(button);
    }
    public void show(){
        frame.setVisible(true);
    }
}
