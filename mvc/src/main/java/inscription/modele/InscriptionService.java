package inscription.modele;

public class InscriptionService {
	
	public Inscription inscrire(String nom, String prenom) throws InscriptionInvalideException {
		InscriptionInvalideException ex = new InscriptionInvalideException();
		
		if (nom == null) {
			ex.addMessage("nom", "Le nom entré n'est pas valide");
		}
		if (prenom == null) {
			ex.addMessage("prenom", "Le prenom n'est pas valide");
		}
		if (ex.mustBeThrown()) {
			throw ex;
		}
		
		return new Inscription(nom, prenom);
	}
	
}
