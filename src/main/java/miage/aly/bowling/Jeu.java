package miage.aly.bowling;

public class Jeu {

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }

    private Integer lancer1;
    private Integer lancer2;
    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer nombreQuillesTombees() {
        return this.lancer1 + this.lancer2;
    }

    public Integer nombreQuillesTombeesLancer1() {
        return this.lancer1;
    }

    public boolean isSpare() {
        return this.lancer1+this.lancer2==10;
    }

    public boolean isStrike() {
        return this.lancer1==10;
    }

    public Integer nombreQuillesTombeesLancer2() {
        return this.lancer2;
    }
}
