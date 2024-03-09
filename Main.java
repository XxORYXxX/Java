import java.util.Scanner;
import java.util.Formatter;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Enemy Enemy = new Enemy();
            Player player = new Player();
            player.player_menu();
            Formatter f = new Formatter("C:/downloads/Game.txt");
            f.format("%s %s %s %s","Fuerza", player.Fuerza,"Espiritu", player.Espiritu);
            f.close();
            File x = new File("C/downloads/Game.txt");
            Scanner SC = new Scanner(x);
            SC.close();
            while (player.Fuerza > 10 || player.Espiritu > 10 || player.Fuerza < 0 || player.Espiritu < 0 || player.Fuerza + player.Espiritu > 10) {
                System.out.println("Atributos no válidos, mínimo 0 máximo 10");
                System.out.println("Asigna tus atributos");
                System.out.println("Fuerza");
                player.Fuerza = sc.nextInt();
                System.out.println("Espíritu");
                player.Espiritu = sc.nextInt();
            }
            Enemy.enemy();
            player.attack(player.Fuerza, Enemy.DefensaM);
            player.level(player.attack(player.Fuerza, Enemy.VidaM), Enemy.ExperienciaM);
        } catch (SecurityException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}