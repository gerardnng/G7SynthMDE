//Code generated for the grafcet metamodel "Grafcet Example Experimental"

#include "TimerOne.h"


//NB: The default value for every pin is 0. The user is supposed to modify it according to its need
//**** 	 Declare INPUT pins mapped	**** Total : 9
const byte pin_hT1 = 0;
const byte pin_bWD = 0;
const byte pin_rain = 0;
const byte pin_ppM1 = 0;
const byte pin_hT2 = 0;
const byte pin_ppM2 = 0;
const byte pin_mT2 = 0;
const byte pin_init0 = 0;
const byte pin_bT1 = 0;

//**** 	 Declare OUTPUT pins mapped	**** Total : 7
const byte pin_IP = 0;
const byte pin_A = 0;
const byte pin_C = 0;
const byte pin_N = 0;
const byte pin_VR1 = 0;
const byte pin_AV = 0;
const byte pin_REC = 0;

//**** 	 Declare DIGITAL INPUT pins states	**** Total : 9
boolean hT1 = false, hT1_Old = false ;
boolean bWD = false, bWD_Old = false ;
boolean rain = false, rain_Old = false ;
boolean ppM1 = false, ppM1_Old = false ;
boolean hT2 = false, hT2_Old = false ;
boolean ppM2 = false, ppM2_Old = false ;
boolean mT2 = false, mT2_Old = false ;
boolean init0 = false, init0_Old = false ;
boolean bT1 = false, bT1_Old = false ;

//**** 	 Declare states of DIGITAL OUTPUT	**** Total : 5
boolean IP = false, IP_Old = false ;
boolean A = false, A_Old = false ;
boolean VR1 = false, VR1_Old = false ;
boolean AV = false, AV_Old = false ;
boolean REC = false, REC_Old = false ;


//**** 	 Declare ANALOG OUTPUT pins states	**** Total : 2
int C = 0, C_Old = 0 ;
int N = 0, N_Old = 0 ;

//**** 	 Declare BOOLEAN Internal variables (With steps activity)	**** Total : 8
boolean X_7 = false, X_7_Old = false ;
boolean X_2 = false, X_2_Old = false ;
boolean X_8 = false, X_8_Old = false ;
boolean X_6 = false, X_6_Old = false ;
boolean X_1 = false, X_1_Old = false ;
boolean X_5 = false, X_5_Old = false ;
boolean X_4 = false, X_4_Old = false ;
boolean X_3 = false, X_3_Old = false ;

//**** 	 Declare NUMERICAL Internal variables	**** Total : 1
int tmp = 0, tmp_Old = 0;

//Variables to evaluate firing transitions
//**** 	 Declare Validated Transitions variables	****
boolean VT_t3 = false;
boolean VT_t4 = false;
boolean VT_t6 = false;
boolean VT_t8 = false;
boolean VT_t7 = false;
boolean VT_t5 = false;
boolean VT_t2 = false;
boolean VT_t9 = false;
boolean VT_t1 = false;

//**** 	 Declare Receptivities of Transitions variables	****
boolean R_t3 = false;
boolean R_t4 = false;
boolean R_t6 = false;
boolean R_t8 = false;
boolean R_t7 = false;
boolean R_t5 = false;
boolean R_t2 = false;
boolean R_t9 = false;
boolean R_t1 = false;

//**** 	 Declare Firing Transitions variables	****
boolean FT_t3 = false;
boolean FT_t4 = false;
boolean FT_t6 = false;
boolean FT_t8 = false;
boolean FT_t7 = false;
boolean FT_t5 = false;
boolean FT_t2 = false;
boolean FT_t9 = false;
boolean FT_t1 = false;

//**** 	 Declare STEPs timing variables for duration activity 	****
unsigned int X_1_duration = 0;
unsigned int X_2_duration = 0;
unsigned int X_3_duration = 0;
unsigned int X_4_duration = 0;
unsigned int X_5_duration = 0;
unsigned int X_6_duration = 0;
unsigned int X_7_duration = 0;
unsigned int X_8_duration = 0;


//Number of timing Variables in Grafcet Expressions : 2

//[5s/X_4/10s]: The following variable measures the duration since which <X_4> has been ON, until its next Rising Edge (RE)
unsigned long X_4__duration = 0; unsigned long X_4__duration_Old = 0;

//[not 10s/X_8]: The following variable measures the duration since which <X_8> has been ON, until its next Rising Edge (RE)
unsigned long X_8__duration = 0; unsigned long X_8__duration_Old = 0;

//To manage timer or measuring duration of active steps
const unsigned int PROGRAM_PERIOD = 100; //i.e. 100 ms = 1/10 seconds

//Variable to detect if there is fired transitions
boolean transitions_fired;

//Program Initialization
void setup(){
	initializeTimer1();
	//Serial.begin(9600);

	//INPUT PINs Configuration
	pinMode(pin_init0, INPUT);
	pinMode(pin_hT2, INPUT);
	pinMode(pin_rain, INPUT);
	pinMode(pin_hT1, INPUT);
	pinMode(pin_bWD, INPUT);
	pinMode(pin_ppM1, INPUT);
	pinMode(pin_ppM2, INPUT);
	pinMode(pin_bT1, INPUT);
	pinMode(pin_mT2, INPUT);

	//OUTPUT PINs Configuration
	pinMode(pin_VR1, OUTPUT);
	pinMode(pin_C, OUTPUT);
	pinMode(pin_N, OUTPUT);
	pinMode(pin_AV, OUTPUT);
	pinMode(pin_IP, OUTPUT);
	pinMode(pin_A, OUTPUT);
	pinMode(pin_REC, OUTPUT);

	//Inital steps activity variables initialization
	X_1_Old = true; //X_1 = true; //But not necessary

}

//Program loop
void loop(){
	//Reading states of Digital INPUT pins / Input variables
	init0 = digitalRead(pin_init0);
	hT2 = digitalRead(pin_hT2);
	rain = digitalRead(pin_rain);
	hT1 = digitalRead(pin_hT1);
	bWD = digitalRead(pin_bWD);
	ppM1 = digitalRead(pin_ppM1);
	ppM2 = digitalRead(pin_ppM2);
	bT1 = digitalRead(pin_bT1);
	mT2 = digitalRead(pin_mT2);

	transitions_fired = false;
	//Evaluate validated transitions (variables)
	VT_t1 =  X_1 ;
	VT_t2 =  X_2 ;
	VT_t3 =  X_2 ;
	VT_t4 =  X_2 ;
	VT_t5 =  X_3 ;
	VT_t6 =  X_4  &&  X_5 ;
	VT_t7 =  X_6 ;
	VT_t8 =  X_7 ;
	VT_t9 =  X_8 ;

	//Evaluate Receptivities of transitions
	R_t1 = (VT_t1)? (init0_Old == false && init0 == true): false ; 
	R_t2 = (VT_t2)? (hT2 && rain): false ; 
	R_t3 = (VT_t3)? (((! rain) && bWD) && ppM1): false ; 
	R_t4 = (VT_t4)? (X_2 && (ppM2 || (! bT1))): false ; 
	R_t5 = (VT_t5)? ((hT1 || (! mT2)) || (! rain)): false ; 
	R_t6 = (VT_t6)? ((X_4__duration >= 5000/PROGRAM_PERIOD) && (X_4__duration <= 10000/PROGRAM_PERIOD) && (tmp > 21)): false ; 
	R_t7 = (VT_t7)? ((hT1 || (! bWD)) || (! ppM1)): false ; 
	R_t8 = (VT_t8)? ((! bWD) && bT1): false ; 
	R_t9 = (VT_t9)? ((N > 0) && (X_8__duration <= 10000/PROGRAM_PERIOD)): false ; 

	//Evaluate Clearing/firing transitions conditions
	if(VT_t1){
		FT_t1 = VT_t1 && R_t1;
		if(FT_t1) {transitions_fired = true;}
	}	
	if(VT_t2){
		FT_t2 = VT_t2 && R_t2;
		if(FT_t2) {transitions_fired = true;}
	}	
	if(VT_t3){
		FT_t3 = VT_t3 && R_t3;
		if(FT_t3) {transitions_fired = true;}
	}	
	if(VT_t4){
		FT_t4 = VT_t4 && R_t4;
		if(FT_t4) {transitions_fired = true;}
	}	
	if(VT_t5){
		FT_t5 = VT_t5 && R_t5;
		if(FT_t5) {transitions_fired = true;}
	}	
	if(VT_t6){
		FT_t6 = VT_t6 && R_t6;
		if(FT_t6) {transitions_fired = true;}
	}	
	if(VT_t7){
		FT_t7 = VT_t7 && R_t7;
		if(FT_t7) {transitions_fired = true;}
	}	
	if(VT_t8){
		FT_t8 = VT_t8 && R_t8;
		if(FT_t8) {transitions_fired = true;}
	}	
	if(VT_t9){
		FT_t9 = VT_t9 && R_t9;
		if(FT_t9) {transitions_fired = true;}
	}	

	//Calculation if there is any transition fired : 2nd alternative
	//transitions_fired =  FT_t1  ||  FT_t2  ||  FT_t3  ||  FT_t4  ||  FT_t5  ||  FT_t6  ||  FT_t7  ||  FT_t8  ||  FT_t9 ;

	//Evaluate steps activity variables
	X_1 = (X_1_Old );
	X_2 = FT_t6 || FT_t9 || FT_t1 || (X_2_Old && ! R_t6 && ! R_t9 && ! R_t1);
	X_3 = FT_t2 || (X_3_Old && ! R_t2);
	X_4 = FT_t5 || (X_4_Old && ! R_t5);
	X_5 = FT_t5 || (X_5_Old && ! R_t5);
	X_6 = FT_t3 || (X_6_Old && ! R_t3);
	X_7 = FT_t4 || (X_7_Old && ! R_t4);
	X_8 = FT_t8 || FT_t7 || (X_8_Old && ! R_t8 && ! R_t7);

	//Reinitialize all the Digital Output variables
	VR1 = false;
	AV = false;
	IP = false;
	A = false;
	REC = false;

	//Evaluate Digital OUTPUTs variables
	//Level Actions Associated to Step 3
	if(X_3){
		if(1){VR1 = true; }
	}
	//Level Actions Associated to Step 4
	if(X_4){
		if(1){AV = true; }
	}
	//Level Actions Associated to Step 5
	if(X_5){
		if(1){IP = true; }
	}
	//Level Actions Associated to Step 6
	if(X_6){
		if(1){IP = true; }
		if((bWD || ppM1)){A = true; }
	}
	//Level Actions Associated to Step 7
	if(X_7){
		if(1){IP = true; }
	}
	//Level Actions Associated to Step 8
	if(X_8){
		if(1){REC = true; }
	}

	//Evaluate Analog/Stored OUTPUTs variables

	//Stored Actions Associated to Step 1
	//Step 1: Action C On Activation
	if(X_1_Old == false && X_1 == true){
		C = 0;
	}

	//Step 1: Action N On Desactivation
	if(X_1_Old == true && X_1 == false){
		N = 10;
	}

	//Stored Actions Associated to Step 4
	//Step 4: Action C On Desactivation
	if(X_4_Old == true && X_4 == false){
		C = (C + 1);
	}

	//Stored Actions Associated to Step 8
	//Step 8: Action N On Activation
	if(X_8_Old == false && X_8 == true){
		N = (N - 1);
	}


	if(transitions_fired == false){
		//A stable situation is reached
		//Updating LEVEL ACTIONS OR DIGITAL OUTPUTs
		if(VR1_Old != VR1){
			digitalWrite(pin_VR1, VR1); 
		}
		if(AV_Old != AV){
			digitalWrite(pin_AV, AV); 
		}
		if(IP_Old != IP){
			digitalWrite(pin_IP, IP); 
		}
		if(A_Old != A){
			digitalWrite(pin_A, A); 
		}
		if(REC_Old != REC){
			digitalWrite(pin_REC, REC); 
		}

	}
	//Updating Analog/Stored Actions/OUTPUTs
	analogWrite(pin_C, C);
	analogWrite(pin_N, N);

	// UPDATE Old DIGITAL INPUT pins states/variables
	hT1_Old = hT1 ;
	bWD_Old = bWD ;
	rain_Old = rain ;
	ppM1_Old = ppM1 ;
	hT2_Old = hT2 ;
	ppM2_Old = ppM2 ;
	mT2_Old = mT2 ;
	init0_Old = init0 ;
	bT1_Old = bT1 ;

	// UPDATE Old DIGITAL OUTPUT pins states/variables
	IP_Old = IP ;
	A_Old = A ;
	VR1_Old = VR1 ;
	AV_Old = AV ;
	REC_Old = REC ;


	// UPDATE Old ANALOG OUTPUT pins states/variables
	C_Old = C ;
	N_Old = N ;

	// UPDATE Old BOOLEAN Internal variables (With steps activity)
	X_7_Old = X_7;
	X_2_Old = X_2;
	X_8_Old = X_8;
	X_6_Old = X_6;
	X_1_Old = X_1;
	X_5_Old = X_5;
	X_4_Old = X_4;
	X_3_Old = X_3;

	// UPDATE Old NUMERICAL Internal variables	
	tmp_Old = tmp;

	//Updating old timing Variables of the Grafcet Expressions : 2
	//fOR [5s/X_4/10s]
	X_4__duration_Old = X_4__duration;
	//fOR [not 10s/X_8]
	X_8__duration_Old = X_8__duration;

}
void initializeTimer1(){
	//Timer1.initialize(1000000);// initialize timer1, and set a 1 second period
	unsigned int FT_Steps = 1000/PROGRAM_PERIOD; //FT_Steps = frequency_timer
	// initialize timer1
  	Timer1.initialize(1000000/FT_Steps);       
	// attaches callback() as a timer overflow interrupt
	Timer1.attachInterrupt(timingVariable_timer_update_callback);   
}

void timingVariable_timer_update_callback(){
	//Updating durations of steps activity variables
	if(X_1){X_1_duration ++ ; } else { X_1_duration = 0;}
	if(X_2){X_2_duration ++ ; } else { X_2_duration = 0;}
	if(X_3){X_3_duration ++ ; } else { X_3_duration = 0;}
	if(X_4){X_4_duration ++ ; } else { X_4_duration = 0;}
	if(X_5){X_5_duration ++ ; } else { X_5_duration = 0;}
	if(X_6){X_6_duration ++ ; } else { X_6_duration = 0;}
	if(X_7){X_7_duration ++ ; } else { X_7_duration = 0;}
	if(X_8){X_8_duration ++ ; } else { X_8_duration = 0;}

	//Updating other variables for timing operations. Number of timing variables: 2
	//Why durations reset to 1 ?: we consider that when expressions moves from false to true, we already have the duration = 1 x PROGRAM_PERIOD

	//if RE ( X_4 ), the duration counter of X_4 is reinitialized to 1
	if(X_4_Old == false && X_4 == true){
		X_4__duration = 1;
	}
	else{  //Increase the duration since which the expression X_4 is on
		X_4__duration ++ ;
	}

	//if RE ( X_8 ), the duration counter of X_8 is reinitialized to 1
	if(X_8_Old == false && X_8 == true){
		X_8__duration = 1;
	}
	else{  //Increase the duration since which the expression X_8 is on
		X_8__duration ++ ;
	}

}

