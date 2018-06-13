<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>Java EE</title>
    <style type="text/css">
    	form > div {
    		padding: .5em;
    	}
    	
    	div > label:first-child {
    		display: inline-block;
			min-width: 18em;
		}
		
		.error {
			color: red;
		}
    </style>
  </head>
  <body>

	<form method="post" accept-charset="utf-8">
		<div>
			<label for="nom">Nom : </label>
			<input id="nom" name="nom" type="text">
			<span class="error"><c:out value="${errors['nom']}"/></span>
		</div>
		<div>
			<label for="prenom">Prenom : </label>
			<input id="prenom" name="prenom" type="text">
			<span class="error"><c:out value="${errors['confirmationMotDePasse']}"/></span>
		</div>
		<div>
			<input id="urgent" name="urgent" value="true" type="checkbox">
			<label for="urgent">Ce rendez-vous est urgent</label>
			<span class="error"><c:out value="${errors['urgent']}"/></span>
		</div>
		<div>
			<button type="submit">Valider</button>
		</div>
	</form>

	<div>
	  	<a href="<c:url value="/"/>">Retour à l'accueil</a>  
	</div>
  
  </body>
</html>