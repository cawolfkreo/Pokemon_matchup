package mundo;

import java.util.Collection;

/**
 * Created by Camilo on 30/11/2015.
 */
public class MundoPokemon {

    private double[][] elementos;
    public Tipos ele;

    public MundoPokemon(){
        elementos= new double[18][18];

        //cree la tabla y para cada celda agregué el valor que le corresponde.

        //Primera Fila (atk normal)
        elementos[Tipos.NORMAL.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.ROCA.darElem()]=0.5;
        elementos[Tipos.NORMAL.darElem()][Tipos.FANTASMA.darElem()]=0;
        elementos[Tipos.NORMAL.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.NORMAL.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.NORMAL.darElem()][Tipos.HADA.darElem()]=1;

        //Segunda Fila atk Fuego
        elementos[Tipos.FUEGO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.FUEGO.darElem()]=0.5;
        elementos[Tipos.FUEGO.darElem()][Tipos.AGUA.darElem()]=0.5;
        elementos[Tipos.FUEGO.darElem()][Tipos.PLANTA.darElem()]=2;
        elementos[Tipos.FUEGO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.HIELO.darElem()]=2;
        elementos[Tipos.FUEGO.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.BICHO.darElem()]=2;
        elementos[Tipos.FUEGO.darElem()][Tipos.ROCA.darElem()]=0.5;
        elementos[Tipos.FUEGO.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.DRAGON.darElem()]=0.5;
        elementos[Tipos.FUEGO.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.FUEGO.darElem()][Tipos.ACERO.darElem()]=2;
        elementos[Tipos.FUEGO.darElem()][Tipos.HADA.darElem()]=1;

        //Tercera Fila atk agua
        elementos[Tipos.AGUA.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.FUEGO.darElem()]=2;
        elementos[Tipos.AGUA.darElem()][Tipos.AGUA.darElem()]=0.5;
        elementos[Tipos.AGUA.darElem()][Tipos.PLANTA.darElem()]=0.5;
        elementos[Tipos.AGUA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.TIERRA.darElem()]=2;
        elementos[Tipos.AGUA.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.ROCA.darElem()]=2;
        elementos[Tipos.AGUA.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.DRAGON.darElem()]=0.5;
        elementos[Tipos.AGUA.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.ACERO.darElem()]=1;
        elementos[Tipos.AGUA.darElem()][Tipos.HADA.darElem()]=1;

        //Cuarta fila atk Planta
        elementos[Tipos.PLANTA.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.FUEGO.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.AGUA.darElem()]=2;
        elementos[Tipos.PLANTA.darElem()][Tipos.PLANTA.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.VENENO.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.TIERRA.darElem()]=2;
        elementos[Tipos.PLANTA.darElem()][Tipos.VOLADOR.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.BICHO.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.ROCA.darElem()]=2;
        elementos[Tipos.PLANTA.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.DRAGON.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.PLANTA.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.PLANTA.darElem()][Tipos.HADA.darElem()]=1;

        //quinta fila atk Elécttrico
        elementos[Tipos.ELECTRICO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.AGUA.darElem()]=2;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.PLANTA.darElem()]=0.5;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.ELECTRICO.darElem()]=0.5;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.TIERRA.darElem()]=0;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.VOLADOR.darElem()]=2;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.DRAGON.darElem()]=0.5;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.ACERO.darElem()]=1;
        elementos[Tipos.ELECTRICO.darElem()][Tipos.HADA.darElem()]=1;

        //Sexta fila atk hielo
        elementos[Tipos.HIELO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.FUEGO.darElem()]=0.5;
        elementos[Tipos.HIELO.darElem()][Tipos.AGUA.darElem()]=0.5;
        elementos[Tipos.HIELO.darElem()][Tipos.PLANTA.darElem()]=2;
        elementos[Tipos.HIELO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.HIELO.darElem()]=0.5;
        elementos[Tipos.HIELO.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.TIERRA.darElem()]=2;
        elementos[Tipos.HIELO.darElem()][Tipos.VOLADOR.darElem()]=2;
        elementos[Tipos.HIELO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.DRAGON.darElem()]=2;
        elementos[Tipos.HIELO.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.HIELO.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.HIELO.darElem()][Tipos.HADA.darElem()]=1;

        //Séptima fila atk lucha
        elementos[Tipos.LUCHA.darElem()][Tipos.NORMAL.darElem()]=2;
        elementos[Tipos.LUCHA.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.HIELO.darElem()]=2;
        elementos[Tipos.LUCHA.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.VENENO.darElem()]=0.5;
        elementos[Tipos.LUCHA.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.VOLADOR.darElem()]=0.5;
        elementos[Tipos.LUCHA.darElem()][Tipos.PSIQUICO.darElem()]=0.5;
        elementos[Tipos.LUCHA.darElem()][Tipos.BICHO.darElem()]=0.5;
        elementos[Tipos.LUCHA.darElem()][Tipos.ROCA.darElem()]=2;
        elementos[Tipos.LUCHA.darElem()][Tipos.FANTASMA.darElem()]=0;
        elementos[Tipos.LUCHA.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.LUCHA.darElem()][Tipos.SINIESTRO.darElem()]=2;
        elementos[Tipos.LUCHA.darElem()][Tipos.ACERO.darElem()]=2;
        elementos[Tipos.LUCHA.darElem()][Tipos.HADA.darElem()]=0.5;

        //Octava fila atk Veneno
        elementos[Tipos.VENENO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.PLANTA.darElem()]=2;
        elementos[Tipos.VENENO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.VENENO.darElem()]=0.5;
        elementos[Tipos.VENENO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.ROCA.darElem()]=0.5;
        elementos[Tipos.VENENO.darElem()][Tipos.FANTASMA.darElem()]=0.5;
        elementos[Tipos.VENENO.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.VENENO.darElem()][Tipos.ACERO.darElem()]=0;
        elementos[Tipos.VENENO.darElem()][Tipos.HADA.darElem()]=2;

        // Novena Fila Tierra
        elementos[Tipos.TIERRA.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.FUEGO.darElem()]=2;
        elementos[Tipos.TIERRA.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.PLANTA.darElem()]=0.5;
        elementos[Tipos.TIERRA.darElem()][Tipos.ELECTRICO.darElem()]=2;
        elementos[Tipos.TIERRA.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.VENENO.darElem()]=2;
        elementos[Tipos.TIERRA.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.VOLADOR.darElem()]=0;
        elementos[Tipos.TIERRA.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.BICHO.darElem()]=0.5;
        elementos[Tipos.TIERRA.darElem()][Tipos.ROCA.darElem()]=2;
        elementos[Tipos.TIERRA.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.TIERRA.darElem()][Tipos.ACERO.darElem()]=2;
        elementos[Tipos.TIERRA.darElem()][Tipos.HADA.darElem()]=1;

        //Decima fila atk Volador
        elementos[Tipos.VOLADOR.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.PLANTA.darElem()]=2;
        elementos[Tipos.VOLADOR.darElem()][Tipos.ELECTRICO.darElem()]=0.5;
        elementos[Tipos.VOLADOR.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.LUCHA.darElem()]=2;
        elementos[Tipos.VOLADOR.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.BICHO.darElem()]=2;
        elementos[Tipos.VOLADOR.darElem()][Tipos.ROCA.darElem()]=0.5;
        elementos[Tipos.VOLADOR.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.VOLADOR.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.VOLADOR.darElem()][Tipos.HADA.darElem()]=1;

        //Undecima fila atk psíquico
        elementos[Tipos.PSIQUICO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.LUCHA.darElem()]=2;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.VENENO.darElem()]=2;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.SINIESTRO.darElem()]=0;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.PSIQUICO.darElem()][Tipos.HADA.darElem()]=1;

        //Duodecima fila atk bicho
        elementos[Tipos.BICHO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.FUEGO.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.PLANTA.darElem()]=2;
        elementos[Tipos.BICHO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.LUCHA.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.VENENO.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.VOLADOR.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.PSIQUICO.darElem()]=2;
        elementos[Tipos.BICHO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.FANTASMA.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.BICHO.darElem()][Tipos.SINIESTRO.darElem()]=2;
        elementos[Tipos.BICHO.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.BICHO.darElem()][Tipos.HADA.darElem()]=0.5;

        //fila13 atk Roca
        elementos[Tipos.ROCA.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.FUEGO.darElem()]=2;
        elementos[Tipos.ROCA.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.HIELO.darElem()]=2;
        elementos[Tipos.ROCA.darElem()][Tipos.LUCHA.darElem()]=0.5;
        elementos[Tipos.ROCA.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.TIERRA.darElem()]=0.5;
        elementos[Tipos.ROCA.darElem()][Tipos.VOLADOR.darElem()]=2;
        elementos[Tipos.ROCA.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.BICHO.darElem()]=2;
        elementos[Tipos.ROCA.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.ROCA.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.ROCA.darElem()][Tipos.HADA.darElem()]=1;

        //fila 14 atk fantasma
        elementos[Tipos.FANTASMA.darElem()][Tipos.NORMAL.darElem()]=0;
        elementos[Tipos.FANTASMA.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.PSIQUICO.darElem()]=2;
        elementos[Tipos.FANTASMA.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.FANTASMA.darElem()]=2;
        elementos[Tipos.FANTASMA.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.SINIESTRO.darElem()]=0;
        elementos[Tipos.FANTASMA.darElem()][Tipos.ACERO.darElem()]=1;
        elementos[Tipos.FANTASMA.darElem()][Tipos.HADA.darElem()]=1;

        //fila 15 atk dragon
        elementos[Tipos.DRAGON.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.DRAGON.darElem()]=2;
        elementos[Tipos.DRAGON.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.DRAGON.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.DRAGON.darElem()][Tipos.HADA.darElem()]=0;

        //fila 16 atk Siniestro
        elementos[Tipos.SINIESTRO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.FUEGO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.LUCHA.darElem()]=0.5;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.PSIQUICO.darElem()]=2;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.FANTASMA.darElem()]=2;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.SINIESTRO.darElem()]=0.5;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.ACERO.darElem()]=1;
        elementos[Tipos.SINIESTRO.darElem()][Tipos.HADA.darElem()]=0.5;

        //fila 17 atk Acero
        elementos[Tipos.ACERO.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.FUEGO.darElem()]=0.5;
        elementos[Tipos.ACERO.darElem()][Tipos.AGUA.darElem()]=0.5;
        elementos[Tipos.ACERO.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.ELECTRICO.darElem()]=0.5;
        elementos[Tipos.ACERO.darElem()][Tipos.HIELO.darElem()]=2;
        elementos[Tipos.ACERO.darElem()][Tipos.LUCHA.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.VENENO.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.ROCA.darElem()]=2;
        elementos[Tipos.ACERO.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.DRAGON.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.SINIESTRO.darElem()]=1;
        elementos[Tipos.ACERO.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.ACERO.darElem()][Tipos.HADA.darElem()]=1;

        //fila 19 y última! :D atk Hada
        elementos[Tipos.HADA.darElem()][Tipos.NORMAL.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.FUEGO.darElem()]=2;
        elementos[Tipos.HADA.darElem()][Tipos.AGUA.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.PLANTA.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.ELECTRICO.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.HIELO.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.LUCHA.darElem()]=2;
        elementos[Tipos.HADA.darElem()][Tipos.VENENO.darElem()]=0.5;
        elementos[Tipos.HADA.darElem()][Tipos.TIERRA.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.VOLADOR.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.PSIQUICO.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.BICHO.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.ROCA.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.FANTASMA.darElem()]=1;
        elementos[Tipos.HADA.darElem()][Tipos.DRAGON.darElem()]=2;
        elementos[Tipos.HADA.darElem()][Tipos.SINIESTRO.darElem()]=2;
        elementos[Tipos.HADA.darElem()][Tipos.ACERO.darElem()]=0.5;
        elementos[Tipos.HADA.darElem()][Tipos.HADA.darElem()]=1;

        ele= Tipos.AGUA;

    }

    public double[][] darElementos(){
        return elementos;
    }

    public String prueba(){
        return ele.toString();
    }

    public Collection<Tipos> darTipos(){
        return ele.darArregloTipos();
    }
    public double darCompatibilidad(int t1, int t2){
        return elementos[t1][t2];
    }
}
