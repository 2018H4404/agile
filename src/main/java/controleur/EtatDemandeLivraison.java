package controleur;

import javafx.scene.Node;
import vue.element.IntersectionNormalVue;

/**
 * La classe de l'etat de demande de livraison.
 * @author H4404
 */
public class EtatDemandeLivraison extends EtatDefaut {

	@Override
	public void CalculerLesTournees(int nbLivreur,int mode) throws Exception{
		
		Controleur.getInstance().getMonManager().calculerLesTourneesSelonMode(Controleur.getInstance().getMaDemande(), Controleur.getInstance().getMonPlan(), nbLivreur, mode);
		Controleur.getInstance().setEtat(Controleur.getInstance().getEtatPosteCalcul());
	}
	
	@Override
	public int getNbLivreurMaximum() {
		return Controleur.getInstance().getMaDemande().getNbLivreurMaximum();
	}
	
	public void ajouterListenerOnClick() {
		for(Node vue : Controleur.getInstance().getGraph().getNoeudGroup().getChildren()) {
			if(vue instanceof IntersectionNormalVue) {
				
				IntersectionNormalVue temp = (IntersectionNormalVue) vue;
				temp.ajouterListenerOnClick();
				
			}
		}
	}
	

	
	@Override
	public void modifierPointLivraison() throws Exception{
		
	}
	
}
