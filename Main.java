import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Enemy enemyG = new Enemy();
            Player player = new Player();
            player.player_menu();
            while (player.Fuerza > 10 || player.Espiritu > 10 || player.Fuerza < 0 || player.Espiritu < 0 || player.Fuerza + player.Espiritu > 10) {
                System.out.println("Atributos no válidos, mínimo 0 máximo 10");
                System.out.println("Asigna tus atributos");
                System.out.println("Fuerza");
                player.Fuerza = sc.nextInt();
                System.out.println("Espíritu");
                player.Espiritu = sc.nextInt();
            }
            enemyG.enemy();
            player.attack(player.Fuerza, enemyG.DefensaM);
            player.level(player.attack(player.Fuerza, enemyG.VidaM), enemyG.ExperienciaM);
        } catch (SecurityException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}