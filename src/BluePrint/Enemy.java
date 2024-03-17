package BluePrint;

public class Enemy {
    protected int VidaM;
    protected int ExperienciaM;
    protected int NivelM;
    protected String NombreM;
    protected String TipoM;
    protected String RazaM;
    protected String ArmaM;
    protected String ArmaduraM;
    protected int AtaqueM;
    protected int DefensaM;

    protected void Monster () {
        System.out.println ( "Se ha creado un enemigo" );
    }
}

class Goblin extends Enemy {
    public void Monster () {
        NombreM = "Goblin";
        TipoM =
        RazaM = "Goblin";
        VidaM = 10;
        ExperienciaM = 200;
        NivelM = 1;
        ArmaM = "Daga";
        ArmaduraM = "Cuero";
        AtaqueM = 5;
        DefensaM = 5;
        System.out.println ( "Se ha creado un Goblin" );
    }
}

