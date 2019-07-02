//Code generated for the grafcet metamodel "G7_Eval_Efficiency3_Modified"

#include "TimerOne.h"


//NB: The default value for every pin is 0. The user is supposed to modify it according to its need
//**** 	 Declare INPUT pins mapped	**** Total : 2
const byte pin_temperature_in = 0;
const byte pin_door_opened = 0;

//**** 	 Declare OUTPUT pins mapped	**** Total : 10
const byte pin_E = 0;
const byte pin_G = 0;
const byte pin_C = 0;
const byte pin_A = 0;
const byte pin_tmp = 0;
const byte pin_M = 0;
const byte pin_N = 0;
const byte pin_B = 0;
const byte pin_F = 0;
const byte pin_D = 0;


//**** 	 Declare DIGITAL INPUT pins states	**** Total : 1
boolean door_opened = false, door_opened_Old = false ;

//**** 	 Declare states of DIGITAL OUTPUT	**** Total : 8
boolean E = false, E_Old = false ;
boolean G = false, G_Old = false ;
boolean C = false, C_Old = false ;
boolean A = false, A_Old = false ;
boolean M = false, M_Old = false ;
boolean B = false, B_Old = false ;
boolean F = false, F_Old = false ;
boolean D = false, D_Old = false ;

//**** 	 Declare states of ANALOG INPUT	**** Total : 1
int temperature_in = 0, temperature_in_Old = 0 ;

//**** 	 Declare ANALOG OUTPUT pins states	**** Total : 2
int tmp = 0, tmp_Old = 0 ;
int N = 0, N_Old = 0 ;

//**** 	 Declare BOOLEAN Internal variables (With steps activity)	**** Total : 9
boolean boo1 = false, boo1_Old = false ;
boolean X_2 = false, X_2_Old = false ;
boolean X_1 = false, X_1_Old = false ;
boolean X_5 = false, X_5_Old = false ;
boolean X_3 = false, X_3_Old = false ;
boolean X_4 = false, X_4_Old = false ;
boolean X_6 = false, X_6_Old = false ;
boolean vv = false, vv_Old = false ;
boolean boo2 = false, boo2_Old = false ;

//**** 	 Declare NUMERICAL Internal variables	**** Total : 1
int local_tmp = 0, local_tmp_Old = 0;

//Variables to evaluate firing transitions
//**** 	 Declare Validated Transitions variables	****
boolean VT_t1 = false;
boolean VT_t6 = false;
boolean VT_test_tr = false;
boolean VT_t3 = false;
boolean VT_t2 = false;
boolean VT_t4 = false;
boolean VT_t5 = false;

//**** 	 Declare Receptivities of Transitions variables	****
boolean R_t1 = false;
boolean R_t6 = false;
boolean R_test_tr = false;
boolean R_t3 = false;
boolean R_t2 = false;
boolean R_t4 = false;
boolean R_t5 = false;

//**** 	 Declare Firing Transitions variables	****
boolean FT_t1 = false;
boolean FT_t6 = false;
boolean FT_test_tr = false;
boolean FT_t3 = false;
boolean FT_t2 = false;
boolean FT_t4 = false;
boolean FT_t5 = false;

//**** 	 Declare STEPs timing variables for duration activity 	****
unsigned int X_1_duration = 0;
unsigned int X_2_duration = 0;
unsigned int X_3_duration = 0;
unsigned int X_4_duration = 0;
unsigned int X_5_duration = 0;
unsigned int X_6_duration = 0;


//Number of timing Variables in the Grafcet Expressions : 6

//[4200ms/(X_6 and (local_tmp > 0))]: The following variable measures the duration since which <(X_6 and (local_tmp > 0))> has been ON, until its next RE
unsigned long X_6__AND_local_tmp__GT_0__00_duration = 0;
unsigned long X_6__AND_local_tmp__GT_0__00_duration_Old = 0;

//[25m/X_4]: The following variable measures the duration since which <X_4> has been ON, until its next RE
unsigned long X_4_00_duration = 0;
unsigned long X_4_00_duration_Old = 0;

//[not 15s/X_5]: The following variable measures the duration since which <X_5> has been ON, until its next RE
unsigned long X_5_00_duration = 0;
unsigned long X_5_00_duration_Old = 0;

//[6m/(boo1 or boo2)]: The following variable measures the duration since which <(boo1 or boo2)> has been ON, until its next RE
unsigned long boo1__OR_boo2__00_duration = 0;
unsigned long boo1__OR_boo2__00_duration_Old = 0;

//[6m/(boo1 or boo2)]: The following variable measures the duration since which <(boo1 or boo2)> has been ON, until its next RE
unsigned long boo1__OR_boo2__00_duration = 0;
unsigned long boo1__OR_boo2__00_duration_Old = 0;

//[8s/X_1]: The following variable measures the duration since which <X_1> has been ON, until its next RE
unsigned long X_1_00_duration = 0;
unsigned long X_1_00_duration_Old = 0;


//To manage timer or measuring duration of active steps
const unsigned int PROGRAM_PERIOD = 100; //i.e. 100 ms = 1/10 seconds

//Program Initialization
void setup(){
	initializeTimer1();
	Serial.begin(9600);

	//INPUT PINs Configuration
	pinMode(pin_door_opened, INPUT);
	pinMode(pin_temperature_in, INPUT);

	//OUTPUT PINs Configuration
	pinMode(pin_N, OUTPUT);
	pinMode(pin_A, OUTPUT);
	pinMode(pin_B, OUTPUT);
	pinMode(pin_C, OUTPUT);
	pinMode(pin_D, OUTPUT);
	pinMode(pin_E, OUTPUT);
	pinMode(pin_F, OUTPUT);
	pinMode(pin_G, OUTPUT);
	pinMode(pin_tmp, OUTPUT);
	pinMode(pin_M, OUTPUT);

	//Inital steps activity variables initialization
	X_1_Old = true; //X_1 = true; //But not necessary
	X_4_Old = true; //X_4 = true; //But not necessary

}

//Program loop
void loop(){
	//Reading states of Digital INPUT pins 
	door_opened = digitalRead(pin_door_opened);

	//Reading states of ANALOG/Numeric INPUT pins 	
	temperature_in = analogRead(pin_temperature_in);

	//Evaluate validated transitions variabless
	VT_t1 =  X_6 && true ;
	VT_t2 =  X_1 && true ;
	VT_t3 =  X_2 && true ;
	VT_t4 =  X_3 && true ;
	VT_t5 =  X_4 && true ;
	VT_t6 =  X_5 && true ;
	VT_test_tr =  true ;

	//Evaluate Receptivities of transitions
	R_t1 = (VT_t1)? (X_6__AND_local_tmp__GT_0__00_duration >= 4200/PROGRAM_PERIOD) && (X_6 && (local_tmp > 0)): false ; 
	R_t2 = (VT_t2)? (X_5 || (door_opened_Old == true && door_opened == false)): false ; 
	R_t3 = (VT_t3)? X_4: false ; 
	R_t4 = (VT_t4)? (X_5 || ((boo1_Old && boo2_Old) == false && (boo1 && boo2) == true)): false ; 
	R_t5 = (VT_t5)? (X_4_00_duration >= 1500000/PROGRAM_PERIOD) && X_4: false ; 
	R_t6 = (VT_t6)? (X_5_00_duration <= 15000/PROGRAM_PERIOD): false ; 
	R_test_tr = (VT_test_tr)? (( || ) && (temperature_in > 29)): false ; 

	//Evaluate Clearing/firing conditions
	FT_t1 = (VT_t1)? VT_t1 && R_t1  : false ; 
	FT_t2 = (VT_t2)? VT_t2 && R_t2  : false ; 
	FT_t3 = (VT_t3)? VT_t3 && R_t3  : false ; 
	FT_t4 = (VT_t4)? VT_t4 && R_t4  : false ; 
	FT_t5 = (VT_t5)? VT_t5 && R_t5  : false ; 
	FT_t6 = (VT_t6)? VT_t6 && R_t6  : false ; 
	FT_test_tr = (VT_test_tr)? VT_test_tr && R_test_tr  : false ; 

	//Evaluate steps activity variables
	X_1 =  FT_t1 ||  (X_1_Old  && ! R_t1 );
	X_2 =  FT_t2 ||  (X_2_Old  && ! R_t2 );
	X_3 =  FT_t3 ||  (X_3_Old  && ! R_t3 );
	X_4 =  FT_t6 ||  (X_4_Old  && ! R_t6 );
	X_5 =  FT_t5 ||  (X_5_Old  && ! R_t5 );
	X_6 =  FT_t4 ||  (X_6_Old  && ! R_t4 );

	//Reinitialize all the Digital Output variables
	A = false;
	B = false;
	C = false;
	D = false;
	E = false;
	F = false;
	G = false;
	M = false;

	//Evaluate Digital OUTPUTs variables
	//Level Actions Associated to Step 1
	if(X_1){
		if(((temperature_in > 15) || ((boo1_Old || boo2_Old) == true && (boo1 || boo2) == false))){A = true; }
	}
	//Level Actions Associated to Step 2
	if(X_2){
		if(1){B = true; }
	}
	//Level Actions Associated to Step 3
	if(X_3){
		if(1){C = true; }
	}
	//Level Actions Associated to Step 4
	if(X_4){
		if(1){D = true; }
		if(1){E = true; }
	}
	//Level Actions Associated to Step 5
	if(X_5){
		if(1){F = true; }
		if(1){G = true; }
	}
	//Level Actions Associated to Step 6
	if(X_6){
		if(((boo1_Old && boo2_Old) == false && (boo1 && boo2) == true)){M = true; }
	}

	//Evaluate Analog/Stored OUTPUTs variables
	//Stored Actions Associated to Step 1
	//Step 1: Action N On Activation
	if(X_1_Old == false && X_1 == true){
		N = 0;
	}

	//Step 1: Action local_tmp On Activation
	if(X_1_Old == false && X_1 == true){
		local_tmp = ((local_tmp * 10) - 25);
	}

	//Step 1: Action boo1 On Activation
	if(X_1_Old == false && X_1 == true){
		boo1 = 1;
	}

	//Step 1: Action boo2 On Desactivation
	if(X_1_Old == true && X_1 == false){
		boo2 = 0;
	}

	//Step 1: Action vv On Desactivation
	if(X_1_Old == true && X_1 == false){
		vv = invalid;
	}

	//Stored Actions Associated to Step 5
	//Step 5: Action N On Activation
	if(X_5_Old == false && X_5 == true){
		N = (N + 1);
	}

	//Step 5: Action tmp On Activation
	if(X_5_Old == false && X_5 == true){
		tmp = (tmp + 1);
	}


	//Updating DIGITAL OUTPUTs
	if(A_Old != A){ digitalWrite(pin_A, A); }
	if(B_Old != B){ digitalWrite(pin_B, B); }
	if(C_Old != C){ digitalWrite(pin_C, C); }
	if(D_Old != D){ digitalWrite(pin_D, D); }
	if(E_Old != E){ digitalWrite(pin_E, E); }
	if(F_Old != F){ digitalWrite(pin_F, F); }
	if(G_Old != G){ digitalWrite(pin_G, G); }
	if(M_Old != M){ digitalWrite(pin_M, M); }

	//Updating Analog/Stored Actions/OUTPUTs
	analogWrite(pin_N, N);
	analogWrite(pin_tmp, tmp);


	// UPDATE Old DIGITAL INPUT pins states/variables
	door_opened_Old = door_opened ;

	// UPDATE Old DIGITAL OUTPUT pins states/variables
	E_Old = E ;
	G_Old = G ;
	C_Old = C ;
	A_Old = A ;
	M_Old = M ;
	B_Old = B ;
	F_Old = F ;
	D_Old = D ;

	// UPDATE Old ANALOG INPUT pins states/variables
	temperature_in_Old = temperature_in ;

	// UPDATE Old ANALOG OUTPUT pins states/variables
	tmp_Old = tmp ;
	N_Old = N ;

	// UPDATE Old BOOLEAN Internal variables (With steps activity)
	boo1_Old = boo1;
	X_2_Old = X_2;
	X_1_Old = X_1;
	X_5_Old = X_5;
	X_3_Old = X_3;
	X_4_Old = X_4;
	X_6_Old = X_6;
	vv_Old = vv;
	boo2_Old = boo2;

	// UPDATE Old NUMERICAL Internal variables	
	local_tmp_Old = local_tmp;

	//Updating old timing Variables of the Grafcet Expressions : 6
	//fOR [4200ms/(X_6 and (local_tmp > 0))]
	X_6__AND_local_tmp__GT_0__00_duration_Old = X_6__AND_local_tmp__GT_0__00_duration;
	//fOR [25m/X_4]
	X_4_00_duration_Old = X_4_00_duration;
	//fOR [not 15s/X_5]
	X_5_00_duration_Old = X_5_00_duration;
	//fOR [6m/(boo1 or boo2)]
	boo1__OR_boo2__00_duration_Old = boo1__OR_boo2__00_duration;
	//fOR [6m/(boo1 or boo2)]
	boo1__OR_boo2__00_duration_Old = boo1__OR_boo2__00_duration;
	//fOR [8s/X_1]
	X_1_00_duration_Old = X_1_00_duration;

}

void initializeTimer1(){
	//Timer1.initialize(1000000);// initialize timer1, and set a 1 second period
	unsigned int FT_Steps = 1000/PROGRAM_PERIOD; //FT_Steps = frequency_timer
	// initialize timer1, and set a PROGRAM_PERIOD second period
  	Timer1.initialize(1000000/FT_Steps);       
	// attaches callback() as a timer overflow interrupt
	Timer1.attachInterrupt(timingVariable_timer_update_callback);   
}


void timingVariable_timer_update_callback(){
	//Updating steps activity variables
	if(X_1){X_1_duration ++ ; } else { X_1_duration = 0;}
	if(X_2){X_2_duration ++ ; } else { X_2_duration = 0;}
	if(X_3){X_3_duration ++ ; } else { X_3_duration = 0;}
	if(X_4){X_4_duration ++ ; } else { X_4_duration = 0;}
	if(X_5){X_5_duration ++ ; } else { X_5_duration = 0;}
	if(X_6){X_6_duration ++ ; } else { X_6_duration = 0;}

	//Updating other variables for timing operations. Number of timing variables: 6
	//Why durations reset to 1 ?: we consider that when expressions moves from false to true, we already have the duration = 1 x PROGRAM_PERIOD

	//if RE ( (X_6 and (local_tmp > 0)) ), the duration counter of (X_6 and (local_tmp > 0)) is reinitialized to 1
	if((X_6_Old && (local_tmp_Old > 0)) == false && (X_6 && (local_tmp > 0)) == true){
		X_6__AND_local_tmp__GT_0__00_duration = 1;
	}
	else{  //Increase the duration since which the expression (X_6 and (local_tmp > 0)) is on
		X_6__AND_local_tmp__GT_0__00_duration ++ ;
	}

	//if RE ( X_4 ), the duration counter of X_4 is reinitialized to 1
	if(X_4_Old == false && X_4 == true){
		X_4_00_duration = 1;
	}
	else{  //Increase the duration since which the expression X_4 is on
		X_4_00_duration ++ ;
	}

	//if RE ( X_5 ), the duration counter of X_5 is reinitialized to 1
	if(X_5_Old == false && X_5 == true){
		X_5_00_duration = 1;
	}
	else{  //Increase the duration since which the expression X_5 is on
		X_5_00_duration ++ ;
	}

	//if RE ( (boo1 or boo2) ), the duration counter of (boo1 or boo2) is reinitialized to 1
	if((boo1_Old || boo2_Old) == false && (boo1 || boo2) == true){
		boo1__OR_boo2__00_duration = 1;
	}
	else{  //Increase the duration since which the expression (boo1 or boo2) is on
		boo1__OR_boo2__00_duration ++ ;
	}

	//if RE ( (boo1 or boo2) ), the duration counter of (boo1 or boo2) is reinitialized to 1
	if((boo1_Old || boo2_Old) == false && (boo1 || boo2) == true){
		boo1__OR_boo2__00_duration = 1;
	}
	else{  //Increase the duration since which the expression (boo1 or boo2) is on
		boo1__OR_boo2__00_duration ++ ;
	}

	//if RE ( X_1 ), the duration counter of X_1 is reinitialized to 1
	if(X_1_Old == false && X_1 == true){
		X_1_00_duration = 1;
	}
	else{  //Increase the duration since which the expression X_1 is on
		X_1_00_duration ++ ;
	}

}
