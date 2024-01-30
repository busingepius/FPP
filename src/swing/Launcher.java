/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 25/01/2024
 * Time : 10:24
 * Project Name : swing
 */
package swing;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MainWindow().show();
//            }
//        });

        SwingUtilities.invokeLater(() -> new MainWindow().show());
    }
}
