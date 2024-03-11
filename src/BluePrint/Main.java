package BluePrint;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        try {
            Scanner sc = new Scanner ( System.in );
            Enemy Goblin = new Goblin ();
            Player player = new Player ();
            player.player_menu ();
            while (player.Fuerza > 10 || player.Espiritu > 10 || player.Fuerza < 0 || player.Espiritu < 0 || player.Fuerza + player.Espiritu > 10) {
                System.out.println ( "Atributos no válidos, mínimo 0 máximo 10" );
                System.out.println ( "Asigna tus atributos" );
                System.out.println ( "Fuerza" );
                player.Fuerza = sc.nextInt ();
                System.out.println ( "Espiritu" );
                player.Espiritu = sc.nextInt ();
            }
            try {
                File x = new File ( "\"C:\\Users\\jdsas\\Documents\\GitHub\\Game.txt\"" );
                Scanner FileV = new Scanner ( x );
                Formatter f = new Formatter ( "\"C:\\Users\\jdsas\\Documents\\GitHub\\Game.txt\"" );
                f.format ( "%s %s %S" , "Fuerza" , player.Fuerza );
                f.format ( "%s %s %S" , "Espiritu" , player.Espiritu );
                f.format ( "%s %s %S" , "Nombre" , player.Nombre );
                System.out.println ( FileV );
            } catch (Exception e) {
                System.err.println ( "Error" + e );
            }
            Goblin.Monster ();
            player.attack ( player.Fuerza , Goblin.DefensaM );
            player.level ( player.attack ( player.Fuerza , Goblin.DefensaM ) , Goblin.ExperienciaM );
        } catch (SecurityException e) {
            System.out.println ( "Error de seguridad: " + e.getMessage () );
        } catch (Exception e) {
            System.out.println ( "Error inesperado: " + e.getMessage () );
        }
    }
}