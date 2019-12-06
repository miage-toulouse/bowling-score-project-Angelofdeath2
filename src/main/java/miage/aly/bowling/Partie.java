package miage.aly.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux = new ArrayList<>();

    public Partie(Jeu leJeu) {
        for (int i=0;i<10;i++){
            jeux.add(leJeu);
        }
        if (jeux.get(9).isSpare())
            this.jeux.add(leJeu);

        if (jeux.get(9).isStrike())
            this.jeux.add(leJeu);
    }


    public Integer calculeScore() {
        Integer score = 0;
        for (int i = 0; i < 10; i++) {
            Jeu jeuCourant = jeux.get(i);
            score += jeuCourant.nombreQuillesTombees();
            if (jeuCourant.isSpare()) {
                score += jeux.get(i+1).nombreQuillesTombeesLancer1();

            }
            if (jeuCourant.isStrike()) {
                score += jeux.get(i+1).nombreQuillesTombeesLancer1() + jeux.get(i+1).nombreQuillesTombeesLancer2();
            }
            /*if (score == 100)
                score=score+ (jeuCourant.nombreQuillesTombeesLancer1()*10);*/
        }
        return score;
    }
}
