package adelium.cours;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

// Le BEAN sert � stocker et manipuler des donn�es de formulaire

// Annotations impl�ment�es depuis JSF v2
@ManagedBean
public class Student {

	private String nom;
	private String prenom;
	private String pays;
	private String langage;
	private List<String> techs; // Admet plusieurs options
	private String mail;

	// Liste de pays (utilis� pour le drop-down)
	List<String> optionsPays;

	// Liste de langages de programmation
	List<String> optionsLangage;

	// Liste de technologies
	List<String> optionsTechno;

	/*
	 * Pr�requis d'un BEAN : 1. un constructeur sans arguments ; 2. des getters et
	 * setters.
	 */
	public Student() {

		// Instancier la liste de pays
		optionsPays = new ArrayList<>();
		optionsPays.add("Allemagne");
		optionsPays.add("Bulgarie");
		optionsPays.add("Chine");
		optionsPays.add("Danemark");

		// Instancier la liste de langages
		optionsLangage = new ArrayList<>();
		optionsLangage.add("Java");
		optionsLangage.add("Python");
		optionsLangage.add("C");
		optionsLangage.add("Cobol");

		// Instancier les options de technologies
		optionsTechno = new ArrayList<String>();
		optionsTechno.add("le ML");
		optionsTechno.add("la blockchain");
		optionsTechno.add("l'IoT");
		optionsTechno.add("le cloud");

	}

	/*
	 * Quand la nouvelle page est appell�e, JSF utilise student.getNom(). Le langage
	 * JSF utilis� dans la page XHTML sera de la forme #{student.nom}
	 * 
	 * Quand le formulaire est charg�, JSF appelle le getter de chaque attribut (la
	 * majuscule est transform�e automatiquement)
	 */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getLangage() {
		return langage;
	}

	public void setLangage(String langage) {
		this.langage = langage;
	}

	public List<String> getTechs() {
		return techs;
	}

	public void setTechs(List<String> techs) {
		this.techs = techs;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<String> getOptionsPays() {
		return optionsPays;
	}

	public List<String> getOptionsLangage() {
		return optionsLangage;
	}

	public List<String> getOptionsTechno() {
		return optionsTechno;
	}

}
