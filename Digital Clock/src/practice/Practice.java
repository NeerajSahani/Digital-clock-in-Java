package practice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;
public class Practice {
    static void time(JLabel time,String s)
    {
        new Timer(0,new ActionListener(){
            public void actionPerformed(ActionEvent e){
             Date d=new Date();
        SimpleDateFormat dt=new SimpleDateFormat(s);
        time.setText(dt.format(d));
            }
        
        }).start();
    }
    public static void main(String[] args) {
       new PracticeGUI().setVisible(true);
    }
    
}
