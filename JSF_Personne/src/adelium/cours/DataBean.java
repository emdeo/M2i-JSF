package adelium.cours;

import javax.faces.bean.ManagedBean;

import adelium.cours.java.Genre;

@ManagedBean
public class DataBean {

	// Renvoie une liste d'�l�ments contenus dans l'enum Genre
	public Genre[] EnumValues() {
		return Genre.values();
	}

}
