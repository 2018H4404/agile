package controleur;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

public class EtatDefaut implements Etat{

	@Override
	public void chargerFichierPlan(File f) throws Exception {
		
	}

	@Override
	public void CalculerLesTournees(int nbLivreur) throws Exception {
		
	}

	@Override
	public void lectureLivraisonEntrepotXML(File f) throws Exception {
		
	}

	@Override
	public int getNbLivreurMaximum() throws Exception {
		return 0;
	}

	@Override
	public void modifierPointLivraison() throws Exception {
		
	}

	@Override
	public void ajouterListenerOnClick() {
		
	}

	@Override
	public void ajouterPointLivraison() throws Exception {
		
	}

	@Override
	public void choixNouvellePointLivraison() throws Exception {
		
	}

	@Override
	public void effectuerAjoutPointLivraison(long idDepart, long idNouvelle, int duree) throws Exception {
		
	}

	@Override
	public void effectuerSupprimerPointLivraison(long id) throws Exception {
		
	}

	@Override
	public void choixPointLivraisonApresDeplacer() throws Exception {
		
	}

	@Override
	public void effectuerDeplacement(long idADeplacer, long idApres) throws Exception {
		
	}

	@Override
	public void supprimerPointLivraison() throws Exception {
		
	}

	@Override
	public void deplacerPointLivraison() throws Exception {
		
	}

	@Override
	public void undo() {
		
	}

	@Override
	public void redo() {
		
	}

	@Override
	public Document exportFeuilleDeRoute() throws FileNotFoundException, DocumentException {
		return new Document();
	}
	
	/*
	@Override
	public void effaceListenerOnClick() {
		
	}*/
	
}
	

