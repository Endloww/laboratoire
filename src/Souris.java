public class Souris {

    private int age; // en mois
    private float poids; // en gramme
    private String couleur;
    private boolean clone;
    private int EsperanceVie;

    public static final int ESPERANCE_VIE_DEFAUT = 36;

    public Souris(float poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0 ;
        this.EsperanceVie = 36;
        this.clone = false;

        System.out.println("Une nouvelle souris !");
    }

    public Souris(int unAge, float unPoids, String uneCouleur){
        this.age = unAge;
        this.poids = unPoids;
        this.couleur = uneCouleur;
        this.EsperanceVie = 36;
        this.clone = false;

        System.out.println("Une nouvelle souris !");
                
    }
    public Souris(Souris sourisClonee){
        this.age = sourisClonee.getAge();
        this.couleur = sourisClonee.getCouleur();
        this.poids = sourisClonee.getPoids();
        this.EsperanceVie = sourisClonee.getEsperanceVie() * (4/5);
        
        System.out.println("Clone d'une souris !");
    }
        

    public int getEsperanceVie() {
        return EsperanceVie;
    }

    public int getAge() {
        return age;
    }

    public float getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }



    public void vieillir() {
    }

    public void evolue() {
    }

    
}