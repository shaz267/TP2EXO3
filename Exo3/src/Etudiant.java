import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Etudiant {

    private Identite NIP;
    private Formation formation;
    private HashMap<Matiere, List<Double>> resultats;

    public Etudiant(Identite id, Formation f, HashMap<Matiere, List<Double>> resultats) {
        this.NIP = id;
        this.formation = f;
        this.resultats = new HashMap<Matiere,List<Double>>();
    }

    /**
     * Permet d'ajouter une note à resultats
     * @param mat
     * @param note
     */
    public void ajouterNotes(Matiere mat, double note){
        Matiere m = mat;
        //Vérifie si la matière est déjà dans les matières de l'etudiant
        if(resultats.containsKey(m)){
            //Si la note est située entre 0 et 20 alors on ajoute la note à la liste des notes
            if (note <= 20 && note >= 0){
                List<Double> notesMatieres = resultats.get(m);
                notesMatieres.add(note);
            }
            //Si la matière n'est pas dans resultats mais qu'il est bien dans la formation de l'etudiant
        } else if(formation.getMatieres().containsKey(m)){
            //Si la note est située entre 0 et 20 alors on ajoute la note à la liste des notes
            if (note <= 20 && note >= 0){
                List<Double> notesMatieres = new ArrayList<>();
                notesMatieres.add(note);
                resultats.put(m,notesMatieres);
            }
        }
    }

    public double calculMoyenne(){
        double resultat = 0;

    }
}