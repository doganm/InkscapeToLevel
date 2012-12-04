 
package sinyalprojesi;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class Spinner extends JPanel  {

    protected JSpinner fazSpinner = new JSpinner();
    protected JSpinner genlikSpinner = new JSpinner();
    protected JSpinner acıSpinner = new JSpinner();
    protected JSpinner yükseklikSpinner=new JSpinner();
    protected JSpinner genislikSpinner=new JSpinner();
    protected JSpinner fazAcısıSpinner=new JSpinner();
    protected JPanel panelSpinner = new JPanel();
    protected JCheckBox secim = new JCheckBox(" Devre Durumu", true);

    public Spinner() {
        panelSpinner.setLayout(new GridLayout(1,7));
        setLayout(new FlowLayout());
        add(panelSpinner);
        panelSpinner.add(fazSpinner);
        panelSpinner.add(acıSpinner);
        panelSpinner.add(genlikSpinner);
        panelSpinner.add(genislikSpinner);        
        panelSpinner.add(yükseklikSpinner);
        panelSpinner.add(fazAcısıSpinner);
        panelSpinner.add(secim);
    }
}