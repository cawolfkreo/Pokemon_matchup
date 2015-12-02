package mundo;

import java.util.Collection;
import java.util.Vector;

/**
 * Created by Camilo on 30/11/2015.
 */
public enum Tipos {
    NORMAL(0),
    FUEGO(1),
    AGUA(2),
    PLANTA(3),
    ELECTRICO(4),
    HIELO(5),
    LUCHA(6),
    VENENO(7),
    TIERRA(8),
    VOLADOR(9),
    PSIQUICO(10),
    BICHO(11),
    ROCA(12),
    FANTASMA(13),
    DRAGON(14),
    SINIESTRO(15),
    ACERO(16),
    HADA(17);
    private final int elemento;

    Tipos(int pElem){
        elemento=pElem;
    }

    public int darElem(){
        return elemento;
    }

    public Collection<Tipos> darArregloTipos(){
        Collection<Tipos> tps = new Vector<Tipos>();
        tps.add(NORMAL);
        tps.add(FUEGO);
        tps.add(AGUA);
        tps.add(PLANTA);
        tps.add(ELECTRICO);
        tps.add(HIELO);
        tps.add(LUCHA);
        tps.add(VENENO);
        tps.add(TIERRA);
        tps.add(VOLADOR);
        tps.add(PSIQUICO);
        tps.add(BICHO);
        tps.add(ROCA);
        tps.add(FANTASMA);
        tps.add(DRAGON);
        tps.add(SINIESTRO);
        tps.add(ACERO);
        tps.add(HADA);

        return tps;
    }
}
