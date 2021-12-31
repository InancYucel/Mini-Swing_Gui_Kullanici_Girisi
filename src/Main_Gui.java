import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Main_Gui extends javax.swing.JFrame {


    private JTextField ID_text_field;
    private JPasswordField passwordField1;
    private JButton girişYapButton;
    private JPanel panel1;
    private JLabel ID_LABEL;

    public Main_Gui(){

        add(panel1);
        setSize(400, 200);
        setTitle("İlk Swing Form");
        girişYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanıcı_adı = ID_text_field.getText();
                String Şifre = new String(passwordField1.getPassword());
                String message;

                if (kullanıcı_adı.equals("InancYucel") && Şifre.equals("12345")) {

                    message = "Hoşgeldiniz, " + kullanıcı_adı;

                }
                else if (!kullanıcı_adı.equals("InancYucel") && Şifre.equals("12345")) {

                    message = "Kullanıcı Adı Hatalı";


                }
                else if (kullanıcı_adı.equals("InancYucel") && !Şifre.equals("12345")) {

                    message = "Parola Hatalı";

                }
                else {
                    message = "Kullanıcı Adı ve Parola Hatalı";

                }
                if (message.equals("Hoşgeldiniz, " + kullanıcı_adı)){


                    JOptionPane.showMessageDialog(null, message);
                    System.exit(0);


                }
                else {
                    JOptionPane.showMessageDialog(null, message);
                }

                ID_text_field.setText("");
                passwordField1.setText("");


            }
        });
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Main_Gui MG = new Main_Gui();
                MG.setVisible(true);

            }
        });


    }

}
