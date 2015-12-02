package interfaz;

import mundo.MundoPokemon;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Camilo on 30/11/2015.
 */
public class MarcoPrincipal extends JFrame {

    private MundoPokemon arena;

    private PanelATK pa;

    private PanelDef pd;

    private JLabel texto;

    private PanelOpciones po;

    public MarcoPrincipal(){
        arena = new MundoPokemon();

        //config del tamaño
        setSize(550,360);
        setTitle("Pokemon Match up");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //configuración del borde
        setLayout(new BorderLayout());

        //agregar los paneles
        pa = new PanelATK(this, arena.darTipos());
        pd = new PanelDef(this, arena.darTipos());
        JPanel combo = new JPanel();
        combo.setBorder(new TitledBorder("seleción de tipos"));
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc= new GridBagConstraints();
        combo.setLayout(gbl);
        combo.add(pa,gbc);

        //texto VS
        texto=new JLabel("   VS   ");
        combo.add(texto, gbc);

        combo.add(pd, gbc);
        add(BorderLayout.CENTER,combo);

        //agregar botones de opción
        po=new PanelOpciones(this);
        add(BorderLayout.SOUTH, po);
    }

    public void respuesta(){
        String s = "Error";
        int t1 = pa.darOjeto().darElem();
        int t2 = pd.darOjeto().darElem();
        double res = arena.darCompatibilidad(t1,t2);
        if(res==2){
            s="Superefectivo!! :D";
        }else if(res==1){
            s="Ataque normal";
        }else if(res==0.5){
            s="poco efectivo :C";
        }else if(res==0){
            s="No surte efecto :_(";
        }
        JOptionPane.showMessageDialog(null,s ,"Compatibilidad de tipos",JOptionPane.INFORMATION_MESSAGE);

    }

    public void prueba(){
        String s = arena.prueba();
        JOptionPane.showMessageDialog(null,s ,"hola mundo",JOptionPane.INFORMATION_MESSAGE);
    }

    public void creditos(){
        String s = "Derechos Camilo Zambrano Votto 2015 \n pronto en github! :D";
        JOptionPane.showMessageDialog(null,s ,"Creditos",JOptionPane.WARNING_MESSAGE);
    }


    public static void main (String[] Args){
        MarcoPrincipal p = new MarcoPrincipal();
        p.setVisible(true);
    }
}
