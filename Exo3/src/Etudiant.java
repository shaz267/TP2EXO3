import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Etudiant {

    private Identite NIP;
    private Formation formation;
    private HashMap<Matiere, List<Double>> resultats;

    public Etudiant(Identite id, Formation f) {
        this.NIP = id;
        this.formation = f;
        this.resultats = new HashMap<Matiere,List<Double>>();
    }

    /**
     * Permet d'ajouter une note à resultats
     * @param mat
     * @param note
     */
    public boolean ajouterNotes(Matiere mat, double note){
        Matiere m = mat;
        boolean res = false;
        //Vérifie si la matière est déjà dans les matières de l'etudiant
        if(resultats.containsKey(m)){
            //Si la note est située entre 0 et 20 alors on ajoute la note à la liste des notes
            if (note <= 20 && note >= 0){
                resultats.get(m).add(note);
                res = true;
            }
            //Si la matière n'est pas dans resultats mais qu'il est bien dans la formation de l'etudiant
        } else if(formation.getMatieres().containsKey(m)){
            //Si la note est située entre 0 et 20 alors on ajoute la note à la liste des notes
            if (note <= 20 && note >= 0){
                List<Double> notesMatieres = new ArrayList<>();
                notesMatieres.add(note);
                resultats.put(m,notesMatieres);
                res = true;
            }
        }
        return res;
    }

    public double calculMoyenne(Matiere m){
        double resultat = 0;

        // On parcourt la liste pour effectuer notre moyenne
        for(int i = 0; i < resultats.get(m).size(); i++){
            resultat += resultats.get(m).get(i);
        }
        // Enfin, on finit le calcul
        resultat = resultat / resultats.get(m).size();
        return resultat;
    }

    /*public double calculMoyenneG(){
        double resultat = 0;

        double coeff = 0;

        for(int i = 0; i < resultats.size(); i++){
            // On récupère le coeff
            coeff = formation.getCoef(resultats.get(i));
            resultat += this.calculMoyenne(resultats.get(i));
        }

        return resultat;
    }*/
}