public static void main(String[] args) {
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
      
        protected void enemy() {
          System.out.println("Se ha creado un enemigo");
      
        }
        class EnemyG {
          public void enemy() {
            NombreM = "Goblin";
            VidaM = 10;
            ExperienciaM = 10;
            NivelM = 1;
            ArmaM = "Daga";
            ArmaduraM = "Cuero";
            AtaqueM = 5;
            DefensaM = 5;
            System.out.println("Se ha creado un Goblin");
          }
        }
      }
}