import java.util.HashMap;

public class Formation {

	private String identifiant;
	private HashMap<Matiere,Double> matieres;

	public Formation(String id, HashMap<Matiere, String> matieres) {
		this.identifiant = id;
		this.matieres = new HashMap<>();
	}

	public void ajouter(String nomMatiere,double coef){
		Matiere m = new Matiere(nomMatiere);
		this.matieres.put(m,coef);
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public HashMap<Matiere, Double> getMatieres() {
		return matieres;
	}
}
