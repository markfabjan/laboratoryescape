
package laboratoryescape;

/**
 *
 * @author Mark Fabjan
 */
import javax.swing.JFrame;

public class LaboratoryEscape extends JFrame{

    public LaboratoryEscape() {

        add(new Game());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(506, 328);
        setLocationRelativeTo(null);
        setTitle("LaboratoryEscape");
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        LaboratoryEscape laboratoryEscape = new LaboratoryEscape();
    }
}