//Code generated from the grafcet metamodel instance "Case Study Water providing"
//Date: 2019-02-18 22:22:15.839




//NB: The default value for every pin is 0. The user is supposed to modify it according to its need
//**** 	 Declare INPUT pins mapped	**** Total : 26
const byte pin_hT1 = 0;
const byte pin_bcl = 0;
const byte pin_VR2 = 0;
const byte pin_rain = 0;
const byte pin_bT1 = 0;
const byte pin_bWD = 0;
const byte pin_pU = 0;
const byte pin_MXSP0 = 0;
const byte pin_hT2 = 0;
const byte pin_SP = 0;
const byte pin_VU2 = 0;
const byte pin_mT2 = 0;
const byte pin_VR = 0;
const byte pin_VU = 0;
const byte pin_MXIP0 = 0;
const byte pin_VF1 = 0;
const byte pin_MXIP1 = 0;
const byte pin_VU1 = 0;
const byte pin_bT2 = 0;
const byte pin_VF2 = 0;
const byte pin_MXSP1 = 0;
const byte pin_mT1 = 0;
const byte pin_pUES = 0;
const byte pin_srl = 0;
const byte pin_IP = 0;
const byte pin_VR1 = 0;

//**** 	 Declare OUTPUT pins mapped	**** Total : 5
const byte pin_MX_IP0 = 0;
const byte pin_MX_IP1 = 0;
const byte pin_MX_SP1 = 0;
const byte pin_MX_SP0 = 0;
const byte pin_SP1 = 0;

//**** 	 Declare DIGITAL INPUT pins states	**** Total : 26
boolean hT1 = false, hT1_Old = false ;
boolean bcl = false, bcl_Old = false ;
boolean VR2 = false, VR2_Old = false ;
boolean rain = false, rain_Old = false ;
boolean bT1 = false, bT1_Old = false ;
boolean bWD = false, bWD_Old = false ;
boolean pU = false, pU_Old = false ;
boolean MXSP0 = false, MXSP0_Old = false ;
boolean hT2 = false, hT2_Old = false ;
boolean SP = false, SP_Old = false ;
boolean VU2 = false, VU2_Old = false ;
boolean mT2 = false, mT2_Old = false ;
boolean VR = false, VR_Old = false ;
boolean VU = false, VU_Old = false ;
boolean MXIP0 = false, MXIP0_Old = false ;
boolean VF1 = false, VF1_Old = false ;
boolean MXIP1 = false, MXIP1_Old = false ;
boolean VU1 = false, VU1_Old = false ;
boolean bT2 = false, bT2_Old = false ;
boolean VF2 = false, VF2_Old = false ;
boolean MXSP1 = false, MXSP1_Old = false ;
boolean mT1 = false, mT1_Old = false ;
boolean pUES = false, pUES_Old = false ;
boolean srl = false, srl_Old = false ;
boolean IP = false, IP_Old = false ;
boolean VR1 = false, VR1_Old = false ;

//**** 	 Declare states of DIGITAL OUTPUT	**** Total : 5
boolean MX_IP0 = false, MX_IP0_Old = false ;
boolean MX_IP1 = false, MX_IP1_Old = false ;
boolean MX_SP1 = false, MX_SP1_Old = false ;
boolean MX_SP0 = false, MX_SP0_Old = false ;
boolean SP1 = false, SP1_Old = false ;



//**** 	 Declare BOOLEAN Internal variables (With steps activity)	**** Total : 23
boolean XT1_2 = false, XT1_2_Old = false ;
boolean XT1_3 = false, XT1_3_Old = false ;
boolean XIP_15 = false, XIP_15_Old = false ;
boolean XSP_11 = false, XSP_11_Old = false ;
boolean XSP_12 = false, XSP_12_Old = false ;
boolean XFL_23 = false, XFL_23_Old = false ;
boolean XT1_1 = false, XT1_1_Old = false ;
boolean XT2_4 = false, XT2_4_Old = false ;
boolean XT2_2 = false, XT2_2_Old = false ;
boolean XSP_10 = false, XSP_10_Old = false ;
boolean XFL_21 = false, XFL_21_Old = false ;
boolean XFL_12 = false, XFL_12_Old = false ;
boolean XIP_16 = false, XIP_16_Old = false ;
boolean XIP_14 = false, XIP_14_Old = false ;
boolean XFL_13 = false, XFL_13_Old = false ;
boolean XVR_6 = false, XVR_6_Old = false ;
boolean XT2_1 = false, XT2_1_Old = false ;
boolean XSP_13 = false, XSP_13_Old = false ;
boolean XVR_7 = false, XVR_7_Old = false ;
boolean XFL_11 = false, XFL_11_Old = false ;
boolean XFL_22 = false, XFL_22_Old = false ;
boolean XT2_3 = false, XT2_3_Old = false ;
boolean XT1_4 = false, XT1_4_Old = false ;


//Variables to evaluate firing transitions
//**** 	 Declare Validated Transitions variables	****
boolean VT_T13 = false;
boolean VT_T25 = false;
boolean VT_T26 = false;
boolean VT_T31 = false;
boolean VT_T17 = false;
boolean VT_T28 = false;
boolean VT_T32 = false;
boolean VT_T3 = false;
boolean VT_T4 = false;
boolean VT_T9 = false;
boolean VT_T24 = false;
boolean VT_T11 = false;
boolean VT_T12 = false;
boolean VT_T18 = false;
boolean VT_T7 = false;
boolean VT_T6 = false;
boolean VT_T21 = false;
boolean VT_T27 = false;
boolean VT_T19 = false;
boolean VT_T22 = false;
boolean VT_T23 = false;
boolean VT_T8 = false;
boolean VT_T2 = false;
boolean VT_T1 = false;
boolean VT_T5 = false;
boolean VT_T10 = false;
boolean VT_T16 = false;
boolean VT_T30 = false;
boolean VT_T14 = false;
boolean VT_T15 = false;
boolean VT_T29 = false;
boolean VT_T20 = false;

//**** 	 Declare Receptivities of Transitions variables	****
boolean R_T13 = false;
boolean R_T25 = false;
boolean R_T26 = false;
boolean R_T31 = false;
boolean R_T17 = false;
boolean R_T28 = false;
boolean R_T32 = false;
boolean R_T3 = false;
boolean R_T4 = false;
boolean R_T9 = false;
boolean R_T24 = false;
boolean R_T11 = false;
boolean R_T12 = false;
boolean R_T18 = false;
boolean R_T7 = false;
boolean R_T6 = false;
boolean R_T21 = false;
boolean R_T27 = false;
boolean R_T19 = false;
boolean R_T22 = false;
boolean R_T23 = false;
boolean R_T8 = false;
boolean R_T2 = false;
boolean R_T1 = false;
boolean R_T5 = false;
boolean R_T10 = false;
boolean R_T16 = false;
boolean R_T30 = false;
boolean R_T14 = false;
boolean R_T15 = false;
boolean R_T29 = false;
boolean R_T20 = false;

//**** 	 Declare Firing Transitions variables	****
boolean FT_T13 = false;
boolean FT_T25 = false;
boolean FT_T26 = false;
boolean FT_T31 = false;
boolean FT_T17 = false;
boolean FT_T28 = false;
boolean FT_T32 = false;
boolean FT_T3 = false;
boolean FT_T4 = false;
boolean FT_T9 = false;
boolean FT_T24 = false;
boolean FT_T11 = false;
boolean FT_T12 = false;
boolean FT_T18 = false;
boolean FT_T7 = false;
boolean FT_T6 = false;
boolean FT_T21 = false;
boolean FT_T27 = false;
boolean FT_T19 = false;
boolean FT_T22 = false;
boolean FT_T23 = false;
boolean FT_T8 = false;
boolean FT_T2 = false;
boolean FT_T1 = false;
boolean FT_T5 = false;
boolean FT_T10 = false;
boolean FT_T16 = false;
boolean FT_T30 = false;
boolean FT_T14 = false;
boolean FT_T15 = false;
boolean FT_T29 = false;
boolean FT_T20 = false;


//****	Declare timing variables for duration activity of not step activity vars i.e. other Boolean Variables ****
unsigned long hT1_duration = 0, hT1_duration_Old = 0;
unsigned long bcl_duration = 0, bcl_duration_Old = 0;
unsigned long VR2_duration = 0, VR2_duration_Old = 0;
unsigned long rain_duration = 0, rain_duration_Old = 0;
unsigned long bWD_duration = 0, bWD_duration_Old = 0;
unsigned long MX_IP0_duration = 0, MX_IP0_duration_Old = 0;
unsigned long SP_duration = 0, SP_duration_Old = 0;
unsigned long VU_duration = 0, VU_duration_Old = 0;
unsigned long SP1_duration = 0, SP1_duration_Old = 0;
unsigned long MXIP1_duration = 0, MXIP1_duration_Old = 0;
unsigned long MX_SP1_duration = 0, MX_SP1_duration_Old = 0;
unsigned long pUES_duration = 0, pUES_duration_Old = 0;
unsigned long srl_duration = 0, srl_duration_Old = 0;
unsigned long IP_duration = 0, IP_duration_Old = 0;
unsigned long VR1_duration = 0, VR1_duration_Old = 0;
unsigned long bT1_duration = 0, bT1_duration_Old = 0;
unsigned long MX_SP0_duration = 0, MX_SP0_duration_Old = 0;
unsigned long pU_duration = 0, pU_duration_Old = 0;
unsigned long MXSP0_duration = 0, MXSP0_duration_Old = 0;
unsigned long hT2_duration = 0, hT2_duration_Old = 0;
unsigned long MX_IP1_duration = 0, MX_IP1_duration_Old = 0;
unsigned long VU2_duration = 0, VU2_duration_Old = 0;
unsigned long mT2_duration = 0, mT2_duration_Old = 0;
unsigned long VR_duration = 0, VR_duration_Old = 0;
unsigned long MXIP0_duration = 0, MXIP0_duration_Old = 0;
unsigned long VF1_duration = 0, VF1_duration_Old = 0;
unsigned long VU1_duration = 0, VU1_duration_Old = 0;
unsigned long bT2_duration = 0, bT2_duration_Old = 0;
unsigned long VF2_duration = 0, VF2_duration_Old = 0;
unsigned long MXSP1_duration = 0, MXSP1_duration_Old = 0;
unsigned long mT1_duration = 0, mT1_duration_Old = 0;



//Variable to detect if at least one transitions is fired
boolean transitions_fired;

//Program Initialization
void setup(){

	//INPUT PINs Configuration
	pinConfigMode(pin_bT1, INPUT);
	pinConfigMode(pin_mT1, INPUT);
	pinConfigMode(pin_hT1, INPUT);
	pinConfigMode(pin_bT2, INPUT);
	pinConfigMode(pin_mT2, INPUT);
	pinConfigMode(pin_hT2, INPUT);
	pinConfigMode(pin_bWD, INPUT);
	pinConfigMode(pin_pU, INPUT);
	pinConfigMode(pin_rain, INPUT);
	pinConfigMode(pin_srl, INPUT);
	pinConfigMode(pin_bcl, INPUT);
	pinConfigMode(pin_pUES, INPUT);
	pinConfigMode(pin_IP, INPUT);
	pinConfigMode(pin_SP, INPUT);
	pinConfigMode(pin_VR, INPUT);
	pinConfigMode(pin_VR1, INPUT);
	pinConfigMode(pin_VR2, INPUT);
	pinConfigMode(pin_VF1, INPUT);
	pinConfigMode(pin_VF2, INPUT);
	pinConfigMode(pin_VU, INPUT);
	pinConfigMode(pin_VU1, INPUT);
	pinConfigMode(pin_VU2, INPUT);
	pinConfigMode(pin_MXSP0, INPUT);
	pinConfigMode(pin_MXSP1, INPUT);
	pinConfigMode(pin_MXIP0, INPUT);
	pinConfigMode(pin_MXIP1, INPUT);

	//OUTPUT PINs Configuration
	pinConfigMode(pin_SP1, OUTPUT);
	pinConfigMode(pin_MX_SP0, OUTPUT);
	pinConfigMode(pin_MX_SP1, OUTPUT);
	pinConfigMode(pin_MX_IP0, OUTPUT);
	pinConfigMode(pin_MX_IP1, OUTPUT);

	//Inital steps activity variables initialization
	XFL_11_Old = true; //XFL_11 = true; //But not necessary
	XFL_21_Old = true; //XFL_21 = true; //But not necessary
	XT1_1_Old = true; //XT1_1 = true; //But not necessary
	XT2_1_Old = true; //XT2_1 = true; //But not necessary
	XSP_10_Old = true; //XSP_10 = true; //But not necessary
	XIP_14_Old = true; //XIP_14 = true; //But not necessary
	XVR_6_Old = true; //XVR_6 = true; //But not necessary

}

//Program loop
void loop(){
	//Reading states of Digital INPUT pins (Digital Input variables)
	bT1 = digitalPinRead(pin_bT1);
	mT1 = digitalPinRead(pin_mT1);
	hT1 = digitalPinRead(pin_hT1);
	bT2 = digitalPinRead(pin_bT2);
	mT2 = digitalPinRead(pin_mT2);
	hT2 = digitalPinRead(pin_hT2);
	bWD = digitalPinRead(pin_bWD);
	pU = digitalPinRead(pin_pU);
	rain = digitalPinRead(pin_rain);
	srl = digitalPinRead(pin_srl);
	bcl = digitalPinRead(pin_bcl);
	pUES = digitalPinRead(pin_pUES);
	IP = digitalPinRead(pin_IP);
	SP = digitalPinRead(pin_SP);
	VR = digitalPinRead(pin_VR);
	VR1 = digitalPinRead(pin_VR1);
	VR2 = digitalPinRead(pin_VR2);
	VF1 = digitalPinRead(pin_VF1);
	VF2 = digitalPinRead(pin_VF2);
	VU = digitalPinRead(pin_VU);
	VU1 = digitalPinRead(pin_VU1);
	VU2 = digitalPinRead(pin_VU2);
	MXSP0 = digitalPinRead(pin_MXSP0);
	MXSP1 = digitalPinRead(pin_MXSP1);
	MXIP0 = digitalPinRead(pin_MXIP0);
	MXIP1 = digitalPinRead(pin_MXIP1);

	transitions_fired = false;
	//Evaluate validated transitions (variables)
	VT_T1 =  XT2_1 ;
	VT_T2 =  XT2_1 ;
	VT_T3 =  XT2_2 ;
	VT_T4 =  XT2_3 ;
	VT_T5 =  XT1_1 ;
	VT_T6 =  XT1_2 ;
	VT_T7 =  XT1_1 ;
	VT_T8 =  XT1_3 ;
	VT_T9 =  XVR_6 ;
	VT_T10 =  XVR_7 ;
	VT_T11 =  XFL_11 ;
	VT_T12 =  XSP_10 ;
	VT_T13 =  XSP_11 ;
	VT_T14 =  XSP_10 ;
	VT_T15 =  XSP_12 ;
	VT_T16 =  XSP_10 ;
	VT_T17 =  XSP_13 ;
	VT_T18 =  XIP_14 ;
	VT_T19 =  XIP_15 ;
	VT_T20 =  XIP_14 ;
	VT_T21 =  XIP_16 ;
	VT_T22 =  XFL_12 ;
	VT_T23 =  XFL_11 ;
	VT_T24 =  XFL_13 ;
	VT_T25 =  XFL_21 ;
	VT_T26 =  XFL_22 ;
	VT_T27 =  XFL_21 ;
	VT_T28 =  XFL_23 ;
	VT_T29 =  XT1_1 ;
	VT_T30 =  XT1_4 ;
	VT_T31 =  XT2_1 ;
	VT_T32 =  XT2_4 ;

	//Evaluate Receptivities of transitions
	R_T1 = (VT_T1)? ((! mT2) && rain): false ; 
	R_T2 = (VT_T2)? ((((srl || bcl) && (! mT2)) && rain) && mT2): false ; 
	R_T3 = (VT_T3)? (hT2 || (! rain)): false ; 
	R_T4 = (VT_T4)? (((((! (srl || bcl)) || (! mT1)) && (((! srl) && (! bcl)) && pUES)) && (! bT2)) && (! rain)): false ; 
	R_T5 = (VT_T5)? (((! mT1) && hT2) && rain): false ; 
	R_T6 = (VT_T6)? ((hT1 || (! mT2)) || (! rain)): false ; 
	R_T7 = (VT_T7)? ((((srl || bcl) && (! mT1)) && (! rain)) && bWD): false ; 
	R_T8 = (VT_T8)? (hT2 || (! pU)): false ; 
	R_T9 = (VT_T9)? ((hT1 && hT2) && rain): false ; 
	R_T10 = (VT_T10)? (((! mT1) || (! mT2)) || (! rain)): false ; 
	R_T11 = (VT_T11)? bT1: false ; 
	R_T12 = (VT_T12)? srl: false ; 
	R_T13 = (VT_T13)? (! srl): false ; 
	R_T14 = (VT_T14)? ((! srl) && bcl): false ; 
	R_T15 = (VT_T15)? (srl || (! bcl)): false ; 
	R_T16 = (VT_T16)? (((! srl) && (! bcl)) && pUES): false ; 
	R_T17 = (VT_T17)? ((srl || bcl) || (! pUES)): false ; 
	R_T18 = (VT_T18)? bcl: false ; 
	R_T19 = (VT_T19)? (! bcl): false ; 
	R_T20 = (VT_T20)? ((! bcl) && pUES): false ; 
	R_T21 = (VT_T21)? (bcl || (! pUES)): false ; 
	R_T22 = (VT_T22)? (! bT1): false ; 
	R_T23 = (VT_T23)? ((((! bT1) && (! bWD)) && (! rain)) && pU): false ; 
	R_T24 = (VT_T24)? (((bT1 || bWD) || rain) || (! pU)): false ; 
	R_T25 = (VT_T25)? bT2: false ; 
	R_T26 = (VT_T26)? (! bT2): false ; 
	R_T27 = (VT_T27)? ((((! bT2) && (! bWD)) && (! rain)) && pU): false ; 
	R_T28 = (VT_T28)? (((bT2 || bWD) || rain) || (! pU)): false ; 
	R_T29 = (VT_T29)? (((((! (srl || bcl)) && (((! srl) && (! bcl)) && pUES)) && (! rain)) && bWD) && (! bT1)): false ; 
	R_T30 = (VT_T30)? (((((! (((! srl) && (! bcl)) && pUES)) || (srl || bcl)) || rain) || (! bWD)) || mT1): false ; 
	R_T31 = (VT_T31)? (((((! (srl || bcl)) || (! mT1)) && (((! srl) && (! bcl)) && pUES)) && (! bT2)) && (! rain)): false ; 
	R_T32 = (VT_T32)? (((((srl || bcl) && mT1) || (! (((! srl) && (! bcl)) && pUES))) || mT2) || rain): false ; 

	//Evaluate Clearing/firing transitions conditions
	FT_T1 = VT_T1 && R_T1;
	FT_T2 = VT_T2 && R_T2;
	FT_T3 = VT_T3 && R_T3;
	FT_T4 = VT_T4 && R_T4;
	FT_T5 = VT_T5 && R_T5;
	FT_T6 = VT_T6 && R_T6;
	FT_T7 = VT_T7 && R_T7;
	FT_T8 = VT_T8 && R_T8;
	FT_T9 = VT_T9 && R_T9;
	FT_T10 = VT_T10 && R_T10;
	FT_T11 = VT_T11 && R_T11;
	FT_T12 = VT_T12 && R_T12;
	FT_T13 = VT_T13 && R_T13;
	FT_T14 = VT_T14 && R_T14;
	FT_T15 = VT_T15 && R_T15;
	FT_T16 = VT_T16 && R_T16;
	FT_T17 = VT_T17 && R_T17;
	FT_T18 = VT_T18 && R_T18;
	FT_T19 = VT_T19 && R_T19;
	FT_T20 = VT_T20 && R_T20;
	FT_T21 = VT_T21 && R_T21;
	FT_T22 = VT_T22 && R_T22;
	FT_T23 = VT_T23 && R_T23;
	FT_T24 = VT_T24 && R_T24;
	FT_T25 = VT_T25 && R_T25;
	FT_T26 = VT_T26 && R_T26;
	FT_T27 = VT_T27 && R_T27;
	FT_T28 = VT_T28 && R_T28;
	FT_T29 = VT_T29 && R_T29;
	FT_T30 = VT_T30 && R_T30;
	FT_T31 = VT_T31 && R_T31;
	FT_T32 = VT_T32 && R_T32;

	//Calculation if there is any transition fired : 2nd alternative
	transitions_fired =  FT_T1  ||  FT_T2  ||  FT_T3  ||  FT_T4  ||  FT_T5  ||  FT_T6  ||  FT_T7  ||  FT_T8  ||  FT_T9  ||  FT_T10  ||  FT_T11  ||  FT_T12  ||  FT_T13  ||  FT_T14  ||  FT_T15  ||  FT_T16  ||  FT_T17  ||  FT_T18  ||  FT_T19  ||  FT_T20  ||  FT_T21  ||  FT_T22  ||  FT_T23  ||  FT_T24  ||  FT_T25  ||  FT_T26  ||  FT_T27  ||  FT_T28  ||  FT_T29  ||  FT_T30  ||  FT_T31  ||  FT_T32 ;

	//Evaluate steps activity variables
	XFL_11 = FT_T24 || FT_T22 || (XFL_11_Old && ! R_T24 && ! R_T22);
	XFL_12 = FT_T11 || (XFL_12_Old && ! R_T11);
	XFL_13 = FT_T23 || (XFL_13_Old && ! R_T23);
	XFL_21 = FT_T26 || FT_T28 || (XFL_21_Old && ! R_T26 && ! R_T28);
	XFL_22 = FT_T25 || (XFL_22_Old && ! R_T25);
	XFL_23 = FT_T27 || (XFL_23_Old && ! R_T27);
	XT1_1 = FT_T30 || FT_T8 || FT_T6 || (XT1_1_Old && ! R_T30 && ! R_T8 && ! R_T6);
	XT1_2 = FT_T5 || (XT1_2_Old && ! R_T5);
	XT1_3 = FT_T7 || (XT1_3_Old && ! R_T7);
	XT1_4 = FT_T29 || (XT1_4_Old && ! R_T29);
	XT2_1 = FT_T32 || FT_T3 || FT_T4 || (XT2_1_Old && ! R_T32 && ! R_T3 && ! R_T4);
	XT2_2 = FT_T1 || (XT2_2_Old && ! R_T1);
	XT2_3 = FT_T2 || (XT2_3_Old && ! R_T2);
	XT2_4 = FT_T31 || (XT2_4_Old && ! R_T31);
	XSP_10 = FT_T13 || FT_T17 || FT_T15 || (XSP_10_Old && ! R_T13 && ! R_T17 && ! R_T15);
	XSP_11 = FT_T12 || (XSP_11_Old && ! R_T12);
	XSP_12 = FT_T14 || (XSP_12_Old && ! R_T14);
	XSP_13 = FT_T16 || (XSP_13_Old && ! R_T16);
	XIP_14 = FT_T21 || FT_T19 || (XIP_14_Old && ! R_T21 && ! R_T19);
	XIP_15 = FT_T18 || (XIP_15_Old && ! R_T18);
	XIP_16 = FT_T20 || (XIP_16_Old && ! R_T20);
	XVR_6 = FT_T10 || (XVR_6_Old && ! R_T10);
	XVR_7 = FT_T9 || (XVR_7_Old && ! R_T9);

	//Reinitialize all the Digital Output variables
	VF1 = false;
	VU = false;
	VU1 = false;
	VF2 = false;
	VU2 = false;
	VR1 = false;
	IP = false;
	VR2 = false;
	SP1 = false;
	MX_SP0 = false;
	MX_SP1 = false;
	MX_IP0 = false;
	MX_IP1 = false;
	VR = false;

	//Evaluate Digital OUTPUTs variables : 19
	if(transitions_fired == false){
		//Evaluate Level Actions Associated to Step FL_12 : 1
		if(XFL_12){ if (1) {VF1 = true;}}

		//Evaluate Level Actions Associated to Step FL_13 : 2
		if(XFL_13){ if (1) {VU = true;}}
		if(XFL_13){ if (1) {VU1 = true;}}

		//Evaluate Level Actions Associated to Step FL_22 : 1
		if(XFL_22){ if (1) {VF2 = true;}}

		//Evaluate Level Actions Associated to Step FL_23 : 2
		if(XFL_23){ if (1) {VU = true;}}
		if(XFL_23){ if (1) {VU2 = true;}}

		//Evaluate Level Actions Associated to Step T1_2 : 1
		if(XT1_2){ if (1) {VR1 = true;}}

		//Evaluate Level Actions Associated to Step T1_3 : 1
		if(XT1_3){ if (1) {IP = true;}}

		//Evaluate Level Actions Associated to Step T1_4 : 1
		if(XT1_4){ if (1) {IP = true;}}

		//Evaluate Level Actions Associated to Step T2_2 : 1
		if(XT2_2){ if (1) {VR2 = true;}}

		//Evaluate Level Actions Associated to Step T2_3 : 1
		if(XT2_3){ if (1) {SP1 = true;}}

		//Evaluate Level Actions Associated to Step T2_4 : 1
		if(XT2_4){ if (1) {SP1 = true;}}

		//Evaluate Level Actions Associated to Step SP_11 : 1
		if(XSP_11){ if (1) {MX_SP0 = true;}}

		//Evaluate Level Actions Associated to Step SP_12 : 1
		if(XSP_12){ if (1) {MX_SP1 = true;}}

		//Evaluate Level Actions Associated to Step SP_13 : 2
		if(XSP_13){ if (1) {MX_SP0 = true;}}
		if(XSP_13){ if (1) {MX_SP1 = true;}}

		//Evaluate Level Actions Associated to Step IP_15 : 1
		if(XIP_15){ if (1) {MX_IP0 = true;}}

		//Evaluate Level Actions Associated to Step IP_16 : 1
		if(XIP_16){ if (1) {MX_IP1 = true;}}

		//Evaluate Level Actions Associated to Step VR_7 : 1
		if(XVR_7){ if (1) {VR = true;}}

	}

	//Evaluate Analog/Stored OUTPUTs variables

	//Updating LEVEL ACTIONS OR DIGITAL OUTPUTs
	if(transitions_fired == false){
		//A stable situation is reached
		if(VF1_Old != VF1){
			digitalPinWrite(pin_VF1, VF1); 
		}
		if(VU_Old != VU){
			digitalPinWrite(pin_VU, VU); 
		}
		if(VU1_Old != VU1){
			digitalPinWrite(pin_VU1, VU1); 
		}
		if(VF2_Old != VF2){
			digitalPinWrite(pin_VF2, VF2); 
		}
		if(VU2_Old != VU2){
			digitalPinWrite(pin_VU2, VU2); 
		}
		if(VR1_Old != VR1){
			digitalPinWrite(pin_VR1, VR1); 
		}
		if(IP_Old != IP){
			digitalPinWrite(pin_IP, IP); 
		}
		if(VR2_Old != VR2){
			digitalPinWrite(pin_VR2, VR2); 
		}
		if(SP1_Old != SP1){
			digitalPinWrite(pin_SP1, SP1); 
		}
		if(MX_SP0_Old != MX_SP0){
			digitalPinWrite(pin_MX_SP0, MX_SP0); 
		}
		if(MX_SP1_Old != MX_SP1){
			digitalPinWrite(pin_MX_SP1, MX_SP1); 
		}
		if(MX_IP0_Old != MX_IP0){
			digitalPinWrite(pin_MX_IP0, MX_IP0); 
		}
		if(MX_IP1_Old != MX_IP1){
			digitalPinWrite(pin_MX_IP1, MX_IP1); 
		}
		if(VR_Old != VR){
			digitalPinWrite(pin_VR, VR); 
		}

	}
	
	// SAVE DIGITAL INPUT pins states/variables
	hT1_Old = hT1 ;
	bcl_Old = bcl ;
	VR2_Old = VR2 ;
	rain_Old = rain ;
	bT1_Old = bT1 ;
	bWD_Old = bWD ;
	pU_Old = pU ;
	MXSP0_Old = MXSP0 ;
	hT2_Old = hT2 ;
	SP_Old = SP ;
	VU2_Old = VU2 ;
	mT2_Old = mT2 ;
	VR_Old = VR ;
	VU_Old = VU ;
	MXIP0_Old = MXIP0 ;
	VF1_Old = VF1 ;
	MXIP1_Old = MXIP1 ;
	VU1_Old = VU1 ;
	bT2_Old = bT2 ;
	VF2_Old = VF2 ;
	MXSP1_Old = MXSP1 ;
	mT1_Old = mT1 ;
	pUES_Old = pUES ;
	srl_Old = srl ;
	IP_Old = IP ;
	VR1_Old = VR1 ;

	// SAVE DIGITAL OUTPUT pins states/variables
	MX_IP0_Old = MX_IP0 ;
	MX_IP1_Old = MX_IP1 ;
	MX_SP1_Old = MX_SP1 ;
	MX_SP0_Old = MX_SP0 ;
	SP1_Old = SP1 ;



	// UPDATE Old BOOLEAN Internal variables (With steps activity)
	XT1_2_Old = XT1_2;
	XT1_3_Old = XT1_3;
	XIP_15_Old = XIP_15;
	XSP_11_Old = XSP_11;
	XSP_12_Old = XSP_12;
	XFL_23_Old = XFL_23;
	XT1_1_Old = XT1_1;
	XT2_2_Old = XT2_2;
	XT2_4_Old = XT2_4;
	XSP_10_Old = XSP_10;
	XFL_12_Old = XFL_12;
	XFL_21_Old = XFL_21;
	XIP_16_Old = XIP_16;
	XFL_13_Old = XFL_13;
	XIP_14_Old = XIP_14;
	XVR_6_Old = XVR_6;
	XT2_1_Old = XT2_1;
	XSP_13_Old = XSP_13;
	XVR_7_Old = XVR_7;
	XFL_11_Old = XFL_11;
	XFL_22_Old = XFL_22;
	XT2_3_Old = XT2_3;
	XT1_4_Old = XT1_4;


}

int main(void)
{
  setup();
  for ( ; ; ) loop(); // repeat indefinitely the function loop()
  return 0;
}



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

