//Code generated from the grafcet metamodel instance "Grafcet Example"
//Date: 2019-02-18 22:18:14.352


#include "TimerOne.h"


//NB: The default value for every pin is 0. The user is supposed to modify it according to its need
//**** 	 Declare INPUT pins mapped	**** Total : 9
const byte pin_ppM1 = 0;
const byte pin_init_ = 0;
const byte pin_bT1 = 0;
const byte pin_hT1 = 0;
const byte pin_ppM2 = 0;
const byte pin_bWD = 0;
const byte pin_hT2 = 0;
const byte pin_rain = 0;
const byte pin_mT2 = 0;

//**** 	 Declare OUTPUT pins mapped	**** Total : 7
const byte pin_VR1 = 0;
const byte pin_C = 0;
const byte pin_IP = 0;
const byte pin_AV = 0;
const byte pin_N = 0;
const byte pin_REC = 0;
const byte pin_A = 0;

//**** 	 Declare DIGITAL INPUT pins states	**** Total : 9
boolean init_ = false, init__Old = false ;
boolean ppM1 = false, ppM1_Old = false ;
boolean bT1 = false, bT1_Old = false ;
boolean hT1 = false, hT1_Old = false ;
boolean ppM2 = false, ppM2_Old = false ;
boolean bWD = false, bWD_Old = false ;
boolean hT2 = false, hT2_Old = false ;
boolean rain = false, rain_Old = false ;
boolean mT2 = false, mT2_Old = false ;

//**** 	 Declare states of DIGITAL OUTPUT	**** Total : 5
boolean VR1 = false, VR1_Old = false ;
boolean IP = false, IP_Old = false ;
boolean AV = false, AV_Old = false ;
boolean REC = false, REC_Old = false ;
boolean A = false, A_Old = false ;


//**** 	 Declare ANALOG OUTPUT pins states	**** Total : 2
int C = 0, C_Old = 0 ;
int N = 0, N_Old = 0 ;

//**** 	 Declare BOOLEAN Internal variables (With steps activity)	**** Total : 8
boolean X8 = false, X8_Old = false ;
boolean X1 = false, X1_Old = false ;
boolean X4 = false, X4_Old = false ;
boolean X7 = false, X7_Old = false ;
boolean X6 = false, X6_Old = false ;
boolean X5 = false, X5_Old = false ;
boolean X3 = false, X3_Old = false ;
boolean X2 = false, X2_Old = false ;


//Variables to evaluate firing transitions
//**** 	 Declare Validated Transitions variables	****
boolean VT_3 = false;
boolean VT_2 = false;
boolean VT_9 = false;
boolean VT_1 = false;
boolean VT_5 = false;
boolean VT_4 = false;
boolean VT_6 = false;
boolean VT_7 = false;
boolean VT_8 = false;

//**** 	 Declare Receptivities of Transitions variables	****
boolean R_3 = false;
boolean R_2 = false;
boolean R_9 = false;
boolean R_1 = false;
boolean R_5 = false;
boolean R_4 = false;
boolean R_6 = false;
boolean R_7 = false;
boolean R_8 = false;

//**** 	 Declare Firing Transitions variables	****
boolean FT_3 = false;
boolean FT_2 = false;
boolean FT_9 = false;
boolean FT_1 = false;
boolean FT_5 = false;
boolean FT_4 = false;
boolean FT_6 = false;
boolean FT_7 = false;
boolean FT_8 = false;

//**** 	 Declare STEPs timing variables for duration activity 	****
unsigned long X1_duration = 0, X1_duration_Old = 0;
unsigned long X2_duration = 0, X2_duration_Old = 0;
unsigned long X3_duration = 0, X3_duration_Old = 0;
unsigned long X4_duration = 0, X4_duration_Old = 0;
unsigned long X5_duration = 0, X5_duration_Old = 0;
unsigned long X6_duration = 0, X6_duration_Old = 0;
unsigned long X7_duration = 0, X7_duration_Old = 0;
unsigned long X8_duration = 0, X8_duration_Old = 0;

//****	Declare timing variables for duration activity of not step activity vars i.e. other Boolean Variables ****
unsigned long init__duration = 0, init__duration_Old = 0;
unsigned long VR1_duration = 0, VR1_duration_Old = 0;
unsigned long bT1_duration = 0, bT1_duration_Old = 0;
unsigned long IP_duration = 0, IP_duration_Old = 0;
unsigned long AV_duration = 0, AV_duration_Old = 0;
unsigned long A_duration = 0, A_duration_Old = 0;
unsigned long ppM1_duration = 0, ppM1_duration_Old = 0;
unsigned long hT1_duration = 0, hT1_duration_Old = 0;
unsigned long REC_duration = 0, REC_duration_Old = 0;
unsigned long ppM2_duration = 0, ppM2_duration_Old = 0;
unsigned long bWD_duration = 0, bWD_duration_Old = 0;
unsigned long hT2_duration = 0, hT2_duration_Old = 0;
unsigned long rain_duration = 0, rain_duration_Old = 0;
unsigned long mT2_duration = 0, mT2_duration_Old = 0;


//Number of timing Variables in Grafcet Expressions : 2

//[5 s/X4/10s]: The following variable measures the duration since which <X4> has been ON, until its next Rising Edge (RE)

//[not 10 s/X8]: The following variable measures the duration since which <X8> has been ON, until its next Rising Edge (RE)

//To manage timer or measuring duration of active steps
const unsigned int TIMER_PERIOD = 100; //With 100 ms = 1/10 seconds

//Variable to detect if at least one transitions is fired
boolean transitions_fired;

//Program Initialization
void setup(){
	initializeTimer(); 
	//INPUT PINs Configuration
	pinConfigMode(pin_init_, INPUT);
	pinConfigMode(pin_hT2, INPUT);
	pinConfigMode(pin_rain, INPUT);
	pinConfigMode(pin_hT1, INPUT);
	pinConfigMode(pin_bWD, INPUT);
	pinConfigMode(pin_ppM1, INPUT);
	pinConfigMode(pin_ppM2, INPUT);
	pinConfigMode(pin_bT1, INPUT);
	pinConfigMode(pin_mT2, INPUT);

	//OUTPUT PINs Configuration
	pinConfigMode(pin_VR1, OUTPUT);
	pinConfigMode(pin_C, OUTPUT);
	pinConfigMode(pin_N, OUTPUT);
	pinConfigMode(pin_AV, OUTPUT);
	pinConfigMode(pin_IP, OUTPUT);
	pinConfigMode(pin_A, OUTPUT);
	pinConfigMode(pin_REC, OUTPUT);

	//Inital steps activity variables initialization
	X1_Old = true; //X1 = true; //But not necessary

}

//Program loop
void loop(){
	//Reading states of Digital INPUT pins (Digital Input variables)
	init_ = digitalPinRead(pin_init_);
	hT2 = digitalPinRead(pin_hT2);
	rain = digitalPinRead(pin_rain);
	hT1 = digitalPinRead(pin_hT1);
	bWD = digitalPinRead(pin_bWD);
	ppM1 = digitalPinRead(pin_ppM1);
	ppM2 = digitalPinRead(pin_ppM2);
	bT1 = digitalPinRead(pin_bT1);
	mT2 = digitalPinRead(pin_mT2);

	transitions_fired = false;
	//Evaluate validated transitions (variables)
	VT_1 =  X1_Old ;
	VT_2 =  X2_Old ;
	VT_3 =  X2_Old ;
	VT_4 =  X2_Old ;
	VT_5 =  X3_Old ;
	VT_6 =  X4_Old  &&  X5_Old ;
	VT_7 =  X6_Old ;
	VT_8 =  X7_Old ;
	VT_9 =  X8_Old ;

	//Evaluate Receptivities of transitions
	R_1 = (VT_1)? (init__Old == false && init_ == true): false ; 
	R_2 = (VT_2)? (hT2 && rain): false ; 
	R_3 = (VT_3)? (((! rain) && bWD) && ppM1): false ; 
	R_4 = (VT_4)? (X2 && (ppM2 || (! bT1))): false ; 
	R_5 = (VT_5)? ((hT1 || (! mT2)) || (! rain)): false ; 
	R_6 = (VT_6)? (((X4_duration >= 5000/TIMER_PERIOD) && X4) || ((X4_duration <= 10000/TIMER_PERIOD) && !X4) || (bT1 == 1)): false ; 
	R_7 = (VT_7)? ((hT1 || (! bWD)) || (! ppM1)): false ; 
	R_8 = (VT_8)? ((! bWD) && bT1): false ; 
	R_9 = (VT_9)? ((((N + 1) > 0) && (X8_duration <= 10000/TIMER_PERIOD)) || bT1): false ; 

	//Evaluate Clearing/firing transitions conditions
	FT_1 = VT_1 && R_1;
	FT_2 = VT_2 && R_2;
	FT_3 = VT_3 && R_3;
	FT_4 = VT_4 && R_4;
	FT_5 = VT_5 && R_5;
	FT_6 = VT_6 && R_6;
	FT_7 = VT_7 && R_7;
	FT_8 = VT_8 && R_8;
	FT_9 = VT_9 && R_9;

	//Calculation if there is any transition fired : 2nd alternative
	transitions_fired =  FT_1  ||  FT_2  ||  FT_3  ||  FT_4  ||  FT_5  ||  FT_6  ||  FT_7  ||  FT_8  ||  FT_9 ;

	//Evaluate steps activity variables
	X1 = (X1_Old );
	X2 = FT_9 || FT_1 || FT_6 || (X2_Old && ! R_9 && ! R_1 && ! R_6);
	X3 = FT_2 || (X3_Old && ! R_2);
	X4 = FT_5 || (X4_Old && ! R_5);
	X5 = FT_5 || (X5_Old && ! R_5);
	X6 = FT_3 || (X6_Old && ! R_3);
	X7 = FT_4 || (X7_Old && ! R_4);
	X8 = FT_7 || FT_8 || (X8_Old && ! R_7 && ! R_8);

	//Reinitialize all the Digital Output variables
	VR1 = false;
	AV = false;
	IP = false;
	A = false;
	REC = false;

	//Evaluate Digital OUTPUTs variables : 8
	if(transitions_fired == false){
		//Evaluate Level Actions Associated to Step 3 : 1
		if(X3){ if (1) {VR1 = true;}}

		//Evaluate Level Actions Associated to Step 4 : 1
		if(X4){ if (1) {AV = true;}}

		//Evaluate Level Actions Associated to Step 5 : 1
		if(X5){ if (1) {IP = true;}}

		//Evaluate Level Actions Associated to Step 6 : 2
		if(X6){ if (1) {IP = true;}}
		if(X6){ if ((bWD || ppM1)) {A = true;}}

		//Evaluate Level Actions Associated to Step 7 : 2
		if(X7){ if (1) {IP = true;}}
		if(X7){ if ((bWD && (! ppM2))) {A = true;}}

		//Evaluate Level Actions Associated to Step 8 : 1
		if(X8){ if (1) {REC = true;}}

	}

	//Evaluate Analog/Stored OUTPUTs variables
	//Evaluate Stored Actions Associated to Step 1
	//Step 1: Action C On Activation
	if(X1_Old == false && X1 == true){
		C = 0;
	}

	//Step 1: Action N On Desactivation
	if(X1_Old == true && X1 == false){
		N = 10;
	}

	//Evaluate Stored Actions Associated to Step 4
	//Step 4: Action C On Desactivation
	if(X4_Old == true && X4 == false){
		C = (C + 1);
	}

	//Evaluate Stored Actions Associated to Step 8
	//Step 8: Action N On Activation
	if(X8_Old == false && X8 == true){
		N = (N - 1);
	}


	//Updating LEVEL ACTIONS OR DIGITAL OUTPUTs
	if(transitions_fired == false){
		//A stable situation is reached
		if(VR1_Old != VR1){
			digitalPinWrite(pin_VR1, VR1); 
		}
		if(AV_Old != AV){
			digitalPinWrite(pin_AV, AV); 
		}
		if(IP_Old != IP){
			digitalPinWrite(pin_IP, IP); 
		}
		if(A_Old != A){
			digitalPinWrite(pin_A, A); 
		}
		if(REC_Old != REC){
			digitalPinWrite(pin_REC, REC); 
		}

	}
	//Updating Analog/Stored Actions/OUTPUTs
	analogPinWrite(pin_C, C);
	analogPinWrite(pin_N, N);
	
	// SAVE DIGITAL INPUT pins states/variables
	init__Old = init_ ;
	ppM1_Old = ppM1 ;
	bT1_Old = bT1 ;
	hT1_Old = hT1 ;
	ppM2_Old = ppM2 ;
	bWD_Old = bWD ;
	hT2_Old = hT2 ;
	rain_Old = rain ;
	mT2_Old = mT2 ;

	// SAVE DIGITAL OUTPUT pins states/variables
	VR1_Old = VR1 ;
	IP_Old = IP ;
	AV_Old = AV ;
	REC_Old = REC ;
	A_Old = A ;


	// SAVE ANALOG OUTPUT pins states/variables
	C_Old = C ;
	N_Old = N ;

	// UPDATE Old BOOLEAN Internal variables (With steps activity)
	X8_Old = X8;
	X1_Old = X1;
	X4_Old = X4;
	X7_Old = X7;
	X6_Old = X6;
	X3_Old = X3;
	X5_Old = X5;
	X2_Old = X2;


}

int main(void)
{
  setup();
  for ( ; ; ) loop(); // repeat indefinitely the function loop()
  return 0;
}

void initializeTimer(){
	unsigned int FT_Steps = 1000/TIMER_PERIOD; //FT_Steps = frequency_timer
  	Timer1.initialize(1000000/FT_Steps);
	Timer1.attachInterrupt(update_G7TimingVars_callback);  
}

void update_G7TimingVars_callback(){
	//function called after every period of the timer to update timing variables
	//Updating durations of steps activity variables
	//for the step 1
	if(X1_Old == true && X1 == false){
		X1_duration = 0;
	}else if(X1 == true){
		X1_duration ++;
	}
	//for the step 2
	if(X2_Old == true && X2 == false){
		X2_duration = 0;
	}else if(X2 == true){
		X2_duration ++;
	}
	//for the step 3
	if(X3_Old == true && X3 == false){
		X3_duration = 0;
	}else if(X3 == true){
		X3_duration ++;
	}
	//for the step 4
	if(X4_Old == true && X4 == false){
		X4_duration = 0;
	}else if(X4 == true){
		X4_duration ++;
	}
	//for the step 5
	if(X5_Old == true && X5 == false){
		X5_duration = 0;
	}else if(X5 == true){
		X5_duration ++;
	}
	//for the step 6
	if(X6_Old == true && X6 == false){
		X6_duration = 0;
	}else if(X6 == true){
		X6_duration ++;
	}
	//for the step 7
	if(X7_Old == true && X7 == false){
		X7_duration = 0;
	}else if(X7 == true){
		X7_duration ++;
	}
	//for the step 8
	if(X8_Old == true && X8 == false){
		X8_duration = 0;
	}else if(X8 == true){
		X8_duration ++;
	}

	//Updating activity duration of other Boolean Variables of the Grafcet. Size = 14
	if(init__Old == true && init_ == false){
		init__duration = 0;
	}else if(init_ == true){
		init__duration ++;
	}
	if(VR1_Old == true && VR1 == false){
		VR1_duration = 0;
	}else if(VR1 == true){
		VR1_duration ++;
	}
	if(bT1_Old == true && bT1 == false){
		bT1_duration = 0;
	}else if(bT1 == true){
		bT1_duration ++;
	}
	if(IP_Old == true && IP == false){
		IP_duration = 0;
	}else if(IP == true){
		IP_duration ++;
	}
	if(AV_Old == true && AV == false){
		AV_duration = 0;
	}else if(AV == true){
		AV_duration ++;
	}
	if(A_Old == true && A == false){
		A_duration = 0;
	}else if(A == true){
		A_duration ++;
	}
	if(ppM1_Old == true && ppM1 == false){
		ppM1_duration = 0;
	}else if(ppM1 == true){
		ppM1_duration ++;
	}
	if(hT1_Old == true && hT1 == false){
		hT1_duration = 0;
	}else if(hT1 == true){
		hT1_duration ++;
	}
	if(REC_Old == true && REC == false){
		REC_duration = 0;
	}else if(REC == true){
		REC_duration ++;
	}
	if(ppM2_Old == true && ppM2 == false){
		ppM2_duration = 0;
	}else if(ppM2 == true){
		ppM2_duration ++;
	}
	if(bWD_Old == true && bWD == false){
		bWD_duration = 0;
	}else if(bWD == true){
		bWD_duration ++;
	}
	if(hT2_Old == true && hT2 == false){
		hT2_duration = 0;
	}else if(hT2 == true){
		hT2_duration ++;
	}
	if(rain_Old == true && rain == false){
		rain_duration = 0;
	}else if(rain == true){
		rain_duration ++;
	}
	if(mT2_Old == true && mT2 == false){
		mT2_duration = 0;
	}else if(mT2 == true){
		mT2_duration ++;
	}


	//Updating activity duration of other Boolean Variables of Grafcet Timing Expressions. Size = 2
	boolean b_old, b_new;
	//For [5 s/X4/10s]
	b_old = X4_Old;
	b_new = X4;
	if((b_old == false && b_new == true) or (b_old == true && b_new == false)){
		X4_duration = 0;
	}
	else{
		X4_duration ++;
	}
	//For [not 10 s/X8]

	//Updating old timing Variables of any Grafcet Boolean variable : 22
	init__duration_Old = init__duration;
	hT2_duration_Old = hT2_duration;
	rain_duration_Old = rain_duration;
	VR1_duration_Old = VR1_duration;
	hT1_duration_Old = hT1_duration;
	bWD_duration_Old = bWD_duration;
	ppM1_duration_Old = ppM1_duration;
	ppM2_duration_Old = ppM2_duration;
	bT1_duration_Old = bT1_duration;
	mT2_duration_Old = mT2_duration;
	AV_duration_Old = AV_duration;
	IP_duration_Old = IP_duration;
	A_duration_Old = A_duration;
	REC_duration_Old = REC_duration;
	X1_duration_Old = X1_duration;
	X2_duration_Old = X2_duration;
	X3_duration_Old = X3_duration;
	X4_duration_Old = X4_duration;
	X5_duration_Old = X5_duration;
	X6_duration_Old = X6_duration;
	X7_duration_Old = X7_duration;
	X8_duration_Old = X8_duration;

	//Updating old timing Variables of the Grafcet Expressions : 2
	//fOR [5 s/X4/10s]
	//fOR [not 10 s/X8]

}

//Expression of functions associated to stored actions

void pinConfigMode(int pin_num, int mode){
	pinMode(pin_num, mode);
}

int digitalPinRead(int pin_num){
	return digitalRead(pin_num);
}

long analogPinRead(int pin_num){
	return analogRead(pin_num);
}

void digitalPinWrite(int pin_num, int value){
	digitalWrite(pin_num, value);
}

void analogPinWrite(int pin_num, int value){
	analogWrite(pin_num, value);
}

