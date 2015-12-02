package interfaz;

import mundo.Tipos;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

/**
 * Created by Camilo on 30/11/2015.
 */
public class PanelATK extends JPanel {

    private MarcoPrincipal principal;

    private JLabel texto;

    private JComboBox<Tipos> lista;


    public PanelATK(MarcoPrincipal p, Collection<Tipos> tiposes){
        principal=p;

        //configuración del panel
        setLayout(new BorderLayout());

        //texto antes del cobo
        texto= new JLabel("Tipo de ataque");
        add(BorderLayout.NORTH,texto);

        //inicializa la lista del panel
        lista = new JComboBox(tiposes.toArray());

        add(BorderLayout.CENTER,lista);

    }

    public Tipos darOjeto(){
        Tipos t = (Tipos) lista.getSelectedItem();
        return t;
    }

}
