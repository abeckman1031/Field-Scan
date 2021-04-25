import javax.swing.JFrame;

class FieldScanFrame extends JFrame {
    public FieldScanFrame() {
        setBounds(200,200,900,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class FieldScan {
    public static void main(String[] args) {
        System.out.println("Starting FieldScan...");

        FieldScanFrame myFieldScanFrame = new FieldScanFrame();
        myFieldScanFrame.setVisible(true);
    }
}