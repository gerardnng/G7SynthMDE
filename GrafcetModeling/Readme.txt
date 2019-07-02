Quelques indications pour bien utiliser le plugin généré
--------------------------------------------------------

Il est possible et préférable de construire une instance du métamodèle en utilisant le plugin généré automatiquement, et modifié selon les besoins.

Au terme du chargement d'une instance du métamodèle Grafcet, 
- les références vers les variables (d'étapes, ...) ne sont pas encore résolues
- les expressions associées aux conditions et actions impulsionnelles ne sont pas encore réalisées ou construites.

Pour bien référencer les variables dans les expressions, les méthodes suivantes sont appelées lorsqu'on modifie le nom du Grafcet:

<
	//Generate variables associated to steps if not yet
	this.generateStepsVariables();
	//generate again expressions transitions Conditions
	this.generateTransitionsExpressions();
	//Call other methods concerning actions (stored and level)
	this.generateActionsExpressions();
> 

Pour l'appeler, il faut mettre à jour le nom du Grafcet. on modifie quelque chose dessus et on enregistre. Cette méthode sera alors appelée automatiquement et toutes les références seront résolues

NB: ces expressions seront enregistrées à la fin, car elles ne sont pas <Transcient> dans le métamodèle. Ceci permet de passer facilement à la génération de code.

--------------
Pour toute modification dans le métamodèle, il faut recharger le .genmodel puis générer les codes associés (application, éditeur, tests, ...)