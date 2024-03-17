package BluePrint;

import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0, 255, 182));
        g.drawLine(100, 100, 500, 500);

    }

    public static void main(String[] args) {
        try {
            // Aqui se  realiza una ventana grafica
            JFrame ventana = new JFrame("Ventana");
            Main objeto = new Main();
            ventana.add(objeto);
            ventana.setSize(700, 700);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Que se instancian las clases
            Scanner sc = new Scanner(System.in);
            Enemy Goblin = new Goblin();
            Player player = new Player();
            // Se desplega el menu del jugador donde asigna sus atributos y nombre
            player.player_menu();
            while (player.Fuerza > 10 || player.Espiritu > 10 || player.Fuerza < 0 || player.Espiritu < 0 || player.Fuerza + player.Espiritu > 10) {
                System.out.println("Atributos no válidos, mínimo 0 máximo 10");
                System.out.println("Asigna tus atributos");
                System.out.println("Fuerza");
                player.Fuerza = sc.nextInt();
                System.out.println("Espiritu");
                player.Espiritu = sc.nextInt();
            }
            // Se crea un archivo que almacena las variables player.Fuerza, player.Espiritu y player.Nombre
            try {
                File x = new File("C:\\Users\\jdsas\\Java\\src\\BluePrint\\Game.txt");
                Scanner FileV = new Scanner(x);
                Formatter f = new Formatter("C:\\Users\\jdsas\\Java\\src\\BluePrint\\Game.txt");
                f.format("%s %s", "Fuerza", player.Fuerza);
                f.format("%s %s", "Espiritu", player.Espiritu);
                f.format("%s %s", "Nombre", player.Nombre);
                System.out.println(FileV);
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
            //Goblin es el mounstruo al que hay que derrotar player.attack determina si el ataque es un exito o un fracaso
            Goblin.Monster();
            player.attack(player.Fuerza, Goblin.DefensaM);
            player.level(player.attack(player.Fuerza, Goblin.DefensaM), Goblin.ExperienciaM);
            player.levelUP();

        } catch (SecurityException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}