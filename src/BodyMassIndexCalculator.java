import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Name und Vorname setzen
 *
 * Im Anschluss Datei senden an msferlazza@gmail.com
 */
public class BodyMassIndexCalculator implements ActionListener {
    private JFrame frame;

    // hier kommen alle Komponenten dier verwendet werden
    private JRadioButton rbMale = new JRadioButton("männlich", true);
    private JRadioButton rbFemale = new JRadioButton("weiblich", false);

    public BodyMassIndexCalculator() {
        frame = new JFrame("BodyMassIndex Calculator");
        // frame.setLayout(....);

        ButtonGroup g = new ButtonGroup();
        g.add(rbMale);
        g.add(rbFemale);

        // hier code ergänzen
        //
        //
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double weight = 0.0,height= 0.0;
        double bmi = weight / (height * height);
        String bmiType = getBMIType(rbMale.isSelected(), bmi);

        // hier Code ergänzen
        //
        //
    }

    public String getBMIType(boolean male, double bmi){
        String erg = "";
        if (male) {
            if (bmi<20) erg="Untergewicht";
            // else
            // else
        }
        else {
            if (bmi<19) erg="Untergewicht";
            //else
            //else
        }
        return erg;
    }

    public static void main(String[] args) {
        new BodyMassIndexCalculator();
    }

}
