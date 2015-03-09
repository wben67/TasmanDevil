
/**
 * Décrivez votre classe PlateauJeu ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PlateauJeu
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private CelluleJeu[][] Cellules;

    /**
     * Constructeur d'objets de classe PlateauJeu
     */
    public PlateauJeu()
    {
        // initialisation des variables d'instance
        int i,j;
        Cellules = new CelluleJeu[10][10];
        
        for (i = 0; i < 10; i++ )
        {
           for (j = 0; j < 10; i++)
           {
                Cellules[i][j] = new CelluleJeu( i, j, (j == 0 ? new Mur( Mur.ETAT.MUR_VISIBLE ) : null ), 
                                                   (j == 9 ? new Mur( Mur.ETAT.MUR_VISIBLE ) : null ),
                                                   (i == 0 ? new Mur( Mur.ETAT.MUR_VISIBLE ) : null ),
                                                   (i == 9 ? new Mur( Mur.ETAT.MUR_VISIBLE ) : null ) );
           }
        }
        
        DessinePlateau();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int DessinePlateau()
    {
        // Insérez votre code ici
        return x;
    }
}
