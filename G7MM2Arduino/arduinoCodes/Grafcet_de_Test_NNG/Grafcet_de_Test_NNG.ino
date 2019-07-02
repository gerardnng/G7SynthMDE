//Code generated for the grafcet metamodel "Grafcet de Test NNG"



//NB: The default value for every pin is 0. The user is supposed to modify it according to its need
//**** 	 Declare INPUT pins mapped	**** Total : 2
const byte pin_a = 0;
const byte pin_b = 0;






//**** 	 Declare BOOLEAN Internal variables (With steps activity)	**** Total : 3
boolean X_s3 = false, X_s3_Old = false ;
boolean X_s2 = false, X_s2_Old = false ;
boolean X_s11 = false, X_s11_Old = false ;


//Variables to evaluate firing transitions
//**** 	 Declare Validated Transitions variables	****
boolean VT_t = false;

//**** 	 Declare Receptivities of Transitions variables	****
boolean R_t = false;

//**** 	 Declare Firing Transitions variables	****
boolean FT_t = false;




//Variable to detect if there is fired transitions
boolean transitions_fired;

//Program Initialization
void setup(){

	//INPUT PINs Configuration
	pinMode(pin_b, INPUT);
	pinMode(pin_a, INPUT);


	//Inital steps activity variables initialization
	X_s11_Old = true; //X_s11 = true; //But not necessary

}

//Program loop
void loop(){

	transitions_fired = false;
	//Evaluate validated transitions (variables)
	VT_t =  X_s11 ;

	//Evaluate Receptivities of transitions
	R_t = (VT_t)? ((a && b) || (a_Old == false && a == true)): false ; 

	//Evaluate Clearing/firing transitions conditions
	if(VT_t){
		FT_t = VT_t && R_t;
		if(FT_t) {transitions_fired = true;}
	}	

	//Calculation if there is any transition fired : 2nd alternative
	//transitions_fired =  FT_t ;

	//Evaluate steps activity variables
	X_s11 = (X_s11_Old );
	X_s2 = FT_t || (X_s2_Old && ! R_t);
	X_s3 = (X_s3_Old );



	//Evaluate Analog/Stored OUTPUTs variables


	if(transitions_fired == false){

	}





	// UPDATE Old BOOLEAN Internal variables (With steps activity)
	X_s3_Old = X_s3;
	X_s2_Old = X_s2;
	X_s11_Old = X_s11;



}


