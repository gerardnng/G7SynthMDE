Quelques indications pour bien utiliser le plugin g�n�r�
--------------------------------------------------------

Il est possible et pr�f�rable de construire une instance du m�tamod�le en utilisant le plugin g�n�r� automatiquement, et modifi� selon les besoins.

Au terme du chargement d'une instance du m�tamod�le Grafcet, 
- les r�f�rences vers les variables (d'�tapes, ...) ne sont pas encore r�solues
- les expressions associ�es aux conditions et actions impulsionnelles ne sont pas encore r�alis�es ou construites.

Pour bien r�f�rencer les variables dans les expressions, les m�thodes suivantes sont appel�es lorsqu'on modifie le nom du Grafcet:

<
	//Generate variables associated to steps if not yet
	this.generateStepsVariables();
	//generate again expressions transitions Conditions
	this.generateTransitionsExpressions();
	//Call other methods concerning actions (stored and level)
	this.generateActionsExpressions();
> 

Pour l'appeler, il faut mettre � jour le nom du Grafcet. on modifie quelque chose dessus et on enregistre. Cette m�thode sera alors appel�e automatiquement et toutes les r�f�rences seront r�solues

NB: ces expressions seront enregistr�es � la fin, car elles ne sont pas <Transcient> dans le m�tamod�le. Ceci permet de passer facilement � la g�n�ration de code.

--------------
Pour toute modification dans le m�tamod�le, il faut recharger le .genmodel puis g�n�rer les codes associ�s (application, �diteur, tests, ...)