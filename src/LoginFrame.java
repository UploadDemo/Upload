import java.awt.Dimension;  
import java.awt.Rectangle;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JOptionPane;  
import javax.swing.JPanel;  
  
public class LoginFrame extends JFrame {  
      
    JButton button = new JButton("点击我");  
    JButton button1 = new JButton("ok");  
      
      
      
      
      
    public LoginFrame(){  
        super();  
        this.setResizable(false);  
        this.setSize(new Dimension(300, 205));  
        this.setTitle("第一个窗体");  
        this.setLayout(null);  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
        this.setLocation(300, 200);  
        this.setVisible(true);  
          
        this.getContentPane().add(button, null);  
        button.setBounds(new Rectangle(111, 70, 78, 27));  
        button.addActionListener(new LoginOKAction());//给按钮加事件监听器  
          
          
    }  
      
      
    class LoginOKAction implements ActionListener {  
          
        public void actionPerformed(ActionEvent e) {  
              
      JFrame jf = new JFrameTest();  
      jf.setSize(300,300);  
      jf.pack();  
      jf.setVisible(true);  
              
              
              
        }  
    }  
      
      
      
    public static void main(String[] args) {  
        new LoginFrame();  
    }  
}  
  
  
class JFrameTest extends JFrame{    
      
    JButton jb1 = new JButton("java let's go ");  
      
    public JFrameTest(){    
         this.setSize(300, 300);    
         this.setTitle("弹出框");    
         this.add(jb1);  
    }    
}    