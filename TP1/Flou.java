import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/*
public class Flou {

    static public void main(String argv[]) {
        // chargement de l'image initiale
        ImageIcon fond=new ImageIcon("damier_00.jpg");
        int largeur=fond.getIconWidth();
        int hauteur=fond.getIconHeight();

        // affichage de cette image dans une fenêtre témoin
        Fenetre initiale=new Fenetre(largeur+9,hauteur+53);
        initiale.obtenirZoneGraphique().drawImage(fond.getImage(),0,0,initiale);
        initiale.miseAJour();

        // transformation de cette image en tableau de pixels
        int[] tableauDePixels=new int[largeur*hauteur];
        // un pixel est codé par 4 octets : alpha,rouge,vert,bleu
        // le premier en dose la tranparence 0 = transparent ... 255 = opaque
        PixelGrabber pg = new PixelGrabber(fond.getImage(), 0, 0, largeur, hauteur,
                tableauDePixels, 0, largeur);
        try { pg.grabPixels(); }
        catch (InterruptedException e) {
            System.err.println("interruption pendant la récupération des pixels de l'image!");
        }

        // Traitement de ce tableau de pixels (ici changement de la couleur de fond)
        //Color couleurDuFond=new Color(tableauDePixels[0]); // couleur 1er pixel = couleur fond
        //Color modifie=new Color(200,150,50); // nouvelle couleur de fond
        int[] tabx = new int[largeur*hauteur];
        double[] tabYplus = new double[largeur*hauteur];
        int[] tabY = new int[largeur*hauteur];
        double alpha = 0.1;

        for (int l = 0; l < hauteur; l++) {
            for (int c = 0; c < largeur; c++) {

                Color coul=new Color(tableauDePixels[l * largeur + c]); //couleur pixel courant
                tabx[l*largeur+c]=coul.getGreen();
			
			/*if (coul.equals(couleurDuFond)) { // s'il est couleur fond
				tableauDePixels[l*largeur + c]=modifie.getRGB(); // on le change
            }
        }

        // Calcul de Yplus: équations traitement horizontal

        for (int l=0; l<hauteur; l++) {
            for (int c=1; c<largeur; c++){
                tabYplus[l*largeur+c]=tabx[l*largeur+c]+ Math.exp(-alpha)*(tabYplus[l*largeur+c-1]-tabx[l*largeur+c]);
            }
            for (int c=largeur-2; c>=0; c--){
                tabY[l*largeur+c]=(int) (tabYplus[l*largeur+c]+ Math.exp(-alpha)*(tabY[l*largeur+c+1]-tabYplus[l*largeur+c]));
            }
        }

        // Traitement vertical
        for (int c=0; c<largeur; c++) {
            for (int l=1; l<hauteur; l++){
                tabYplus[l*largeur+c]=tabY[l*largeur+c]+ Math.exp(-alpha)*(tabYplus[(l-1)*largeur+c]-tabY[l*largeur+c]);
            }
            for (int l=hauteur-2; l>=0; l--){
                tabY[l*largeur+c]=(int) (tabYplus[l*largeur+c]+ Math.exp(-alpha)*(tabY[(l+1)*largeur+c]-tabYplus[l*largeur+c]));
            }
        }

        // Régénération de pixels RVB = [vvv]
        for (int l = 0; l < hauteur; l++) {
            for (int c = 0; c < largeur; c++) {
                int vert = tabY[l*largeur+c];
                Color coul=new Color(vert,vert,vert); // couleur pixeel en NDG
                tableauDePixels[l*largeur+c]=coul.getRGB(); //récupère 3 comp (VVV)
            }}



        // conversion du tableau de pixels en objet de classe Image
        Image resultat=initiale.createImage(new MemoryImageSource(largeur, hauteur,
                tableauDePixels, 0, largeur));
        // conversion du tableau de pixels en objet de classe ImageIcon (si on en a besoin)
        ImageIcon resultatIcone=new ImageIcon(resultat);

        // affichage du résultat dans une autre fenêtre
        Fenetre finale=new Fenetre(resultatIcone.getIconWidth()+9,
                resultatIcone.getIconHeight()+53);
        finale.prepareImage(resultat);
        finale.obtenirZoneGraphique().drawImage(resultat,0,0,finale);
        finale.miseAJour();

    }

}*/