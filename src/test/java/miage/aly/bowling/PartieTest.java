package miage.aly.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    //cas nominaux - cas standards
    @Test
    public void testCalculeScorePartieNormale(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(6,0);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        Integer score = laPartie.calculeScore();
        //then : on obtient un score de 60
        assertEquals(Integer.valueOf(60),score);
    }

    @Test
    public void testCalculeScorePartieSpare(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        Integer score = laPartie.calculeScore();
        //then : on obtient un score de 150
        assertEquals(Integer.valueOf(150),score);
    }

    @Test
    public void testCalculeScorePartieStrike(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(10);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        Integer score = laPartie.calculeScore();
        //then : on obtient un score de 300
        assertEquals(Integer.valueOf(300),score);
    }
    //cas d'erreurs

    //cas limites

}