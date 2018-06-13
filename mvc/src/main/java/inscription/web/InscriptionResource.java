package inscription.web;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import inscription.modele.InscriptionInvalideException;
import inscription.modele.InscriptionService;

@Path("/inscription")
public class InscriptionResource {

		@POST
		public void creerInscription(@FormParam("nom"), @FormParam("prenom"))
}
