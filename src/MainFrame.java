
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {
    
    public void initialize(){
    
        setTitle("Welcome");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        MainFrame myframe = new MainFrame();
        
        myframe.initialize();
    }
    
}
