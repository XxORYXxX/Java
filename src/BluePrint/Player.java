package BluePrint;

import java.util.Scanner;

public class Player {

    protected String Nombre;
    protected int Fuerza;
    protected int Espiritu;
    protected int ExpPoints;
    protected int LevelBar;
    public int Level;
    static Scanner sc = new Scanner ( System.in );

    public void player_menu () {
        System.out.println ( "Introduce tu nombre: " );
        String Nombre = sc.nextLine ();
        System.out.println ( "Bienvenido " + Nombre );
        System.out.println ( "Asigna tus atributos" );
        System.out.println ( "Fuerza" );
        Fuerza = sc.nextInt ();
        System.out.println ( "Espiritu" );
        Espiritu = sc.nextInt ();
    }

    public boolean attack ( int A , int B ) {
        if ( A > B ) {
            System.out.println ( "Has ganado la pelea" );
            return true;
        } else {
            System.out.println ( "Has perdido la pelea" );
            return false;
        }
    }

    public void level ( boolean A , int B ) {
        if ( A ) {
            LevelBar = ExpPoints + B;
        } else {
            System.out.print("");
            System.out.write ( 3 );
        }
    }
    @SuppressWarnings ("unused")
    public void levelUP () {
        if ( LevelBar == 100 ) {
            System.out.println ( "!Has subido de nivel!" );
            Level++;
            if ( LevelBar == 100 ) {
                Level = 0;
            }
        }
    }
}