package interfaz;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Camilo on 30/11/2015.
 */
public class PanelOpciones extends JPanel implements ActionListener {

    /**
     * constante boton compatibilidad
     */
    private final static String BOTTONC="btnC";
    /**
     * constante boton 1
     */
    private final static String BOTTTON1="btn1";
    /**
     * constante boton 2
     */
    private final static String BOTTTON2="btn2";


    private JButton compatibiliidad;

    private JButton algo1;

    private JButton algo2;

    private MarcoPrincipal p;

    public PanelOpciones(MarcoPrincipal t){
        //agregar la interfaz
        p=t;

        //configuracion del panel
        setLayout(new GridLayout());
        setBorder(new TitledBorder("Opciones"));

        //agregar boton compatibilidad
        compatibiliidad = new JButton("Calcular Compatibilidad");
        compatibiliidad.setActionCommand(BOTTONC);
        compatibiliidad.addActionListener(this);
        add(compatibiliidad);

        //agregar boton 1
        algo1=new JButton("Nada por aquí");
        algo1.setActionCommand(BOTTTON1);
        algo1.addActionListener(this);
        add(algo1);

        //agregar boton 2
        algo2=new JButton("Nada por acá");
        algo2.setActionCommand(BOTTTON2);
        algo2.addActionListener(this);
        add(algo2);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals(BOTTONC)){
            p.respuesta();
        }else if (actionEvent.getActionCommand().equals(BOTTTON1)){
            p.prueba();
        }else if (actionEvent.getActionCommand().equals(BOTTTON2)){
            p.creditos();
        }
    }
}
