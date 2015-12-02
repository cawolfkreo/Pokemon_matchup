package interfaz;

import mundo.Tipos;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Created by Camilo on 30/11/2015.
 */
public class PanelDef extends JPanel {

    private MarcoPrincipal mp;

    private JLabel texto;

    private JComboBox<Tipos> box;

    public PanelDef(MarcoPrincipal p, Collection<Tipos> tps){
        mp = p;

        //configuración del panel
        setLayout(new BorderLayout());

        //texto antes del combo
        texto=new JLabel("Tipo de pokemon defensor");
        add(BorderLayout.NORTH, texto);

        //inicializa la lista del panel
        box = new JComboBox(tps.toArray());

        add(BorderLayout.CENTER,box);
    }

    public Tipos darOjeto(){
        Tipos t2 = (Tipos)box.getSelectedItem();
        return t2;
    }
}
