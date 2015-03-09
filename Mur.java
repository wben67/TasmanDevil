
/**
 * Décrivez votre classe Mur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */


public class Mur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ETAT etat; // visible ou invisible
    public enum ETAT { MUR_INVISIBLE , MUR_VISIBLE };

    /**
     * Constructeur d'objets de classe Mur
     */
    public Mur( )
    {
        // initialisation des variables d'instance
        etat= ETAT.MUR_INVISIBLE;
    }
    
    public Mur( ETAT etat_initial)
    {
        // initialisation des variables d'instance
        etat=etat_initial;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public ETAT setVisible()
    {
        // Insérez votre code ici
        return etat=ETAT.MUR_VISIBLE;
    }
    
    public ETAT setInvisible()
    {
        return etat=ETAT.MUR_INVISIBLE;
    }
}
