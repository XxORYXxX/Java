import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Enemy enemyG = new Enemy();
    Player player = new Player();
    player.player_menu();

    while(player.Fuerza > 10 || player.Espiritu > 10 || player.Fuerza < 0 || player.Espiritu < 0 || player.Fuerza + player.Espiritu > 10) {
      System.out.println("Atributos no validos minimo 0 maximo 10");
      System.out.println("Asigna tus atributos");
      System.out.println("Fuerza");
      player.Fuerza = sc.nextInt();
      System.out.println("Espiritu");
      player.Espiritu = sc.nextInt();
    }
    enemyG.enemy();
    player.attack(player.Fuerza, enemyG.DefensaM);
    player.level(player.attack(player.Fuerza, enemyG.VidaM), enemyG.ExperienciaM);
  }
}