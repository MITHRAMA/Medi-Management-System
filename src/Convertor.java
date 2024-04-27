import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convertor extends JFrame {
    String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };

    private JTextField tf1;
    private JComboBox cb1;

    private JTextField tf2;
    private JComboBox cb2;
    private JPanel pannel;

    public void initCompnents()
    {
        pannel.setLayout(null);
        tf1.setBounds(50,50,100,20);
        cb1.setBounds(170,50,100,20);
        tf2.setBounds(290,50,100,20);
        cb2.setBounds(460,50,100,20);
        pannel.add(tf1);
        pannel.add(cb1);
        pannel.add(tf2);
        pannel.add(cb2);
        cb1.addItem("Kilometer");
        cb1.addItem("Meter");
        cb1.addItem("Centimeter");
        cb2.addItem("Kilometer");
        cb2.addItem("Meter");
        cb2.addItem("Centimeter");
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(tf1.getText());
                int b=a*1000;
                String c= Integer.toString(b);
                if(cb1.getSelectedItem().equals("Kilometer") && cb2.getSelectedItem().equals("Meter"))
                {
                    tf2.setText(c);
                }
            }
        });

    }

    public Convertor() {
        initCompnents();
        setContentPane(pannel);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}