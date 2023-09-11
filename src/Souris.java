public class Souris {

    private int age;
    private float poids;
    private String couleur;

    public int EsperanceVie = 36;

    public Souris(float poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
    }

    public Souris(int age, float poids, String couleur){
        this.age = age;
        this.poids = poids;
        this.couleur = couleur;
        System.out.println("nouvelle souris créée");
    
                
    }

    public void vieillir() {
    }

    public void evolue() {
    }

    
}