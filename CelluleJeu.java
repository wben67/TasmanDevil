
/**
 * Décrivez votre classe CelluleJeu ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CelluleJeu
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private int y;
    private Mur Top;
    private Mur Bottom;
    private Mur Right;
    private Mur Left;

    /**
     * Constructeur d'objets de classe CelluleJeu
     */
    
    public CelluleJeu( int x, int y, Mur Top, Mur Bottom, Mur Left, Mur Right )
    {
           this.x = x;
           this.y = y;
           this.Top = Top;
           this.Bottom = Bottom;
           this.Left = Left;
           this.Right = Right;
    }
    
    public CelluleJeu( int x, int y )
    {
            this.x = x;
            this.y = y;
            
            if ( y == 0 )
                Top  = new Mur( Mur.ETAT.MUR_VISIBLE );
                
           if ( x == 0 )
               Left = new Mur( Mur.ETAT.MUR_VISIBLE );
    }
    public CelluleJeu()
    {
            this.x = x;
            this.y = y;
            
            Top  = new Mur( Mur.ETAT.MUR_VISIBLE );
                
            Left = new Mur( Mur.ETAT.MUR_VISIBLE );
    }
    

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }
}
