public class Identite {

    private String nom;
    private String prenom;
    private String NIP;

    public Identite(String n, String p, String nip){
        this.nom = n;
        this.prenom = p;
        this.NIP = nip;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNIP() {
        return NIP;
    }
}