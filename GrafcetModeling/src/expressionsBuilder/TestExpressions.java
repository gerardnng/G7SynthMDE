package expressionsBuilder;
import grafcetmodeling.model.grafcetModeling.Expression;

public class TestExpressions {
	private static String [] tabExpr1 = {
			"a or b or c or d or e and f",
			"a and b or c and (-bc-5+d)>10",
			"a and b",
			"(a or b) and c",
			"a and (b or c)",
			"(a and (b or c))",
			"init and (not X5)",
			"init and not X5",
			"(RE init) or (FE X4) and not X5",
			"RE init or FE X4 and not X5",
			"RE init or (FE X4 and not X5)",
	
	
			"25",
			"a+b",
			"_a254+8",
			"abs - rach",
			"a3-8",
			"2*z+t",
			"2*(z+t)",
			"b*b-4*a*c",
			"(a+b)/(2*z+t)",
			
			"-335",
			"-bc-5+d",
	
			"not a and b or not c or x>25 and not (y<=2*z+t)",
			
			"[3s/init and not b]",
			"[3s/init and not b/4s]",
			"[not 3s/init and not b]",
			"[3s/init] or [3s/init and not b/4s] and RE [not 3s/init]",
		
			"true and not false",
			"RE true and RE not false",
			"true",
			"false",
			"not true and not false"
	};
	//Test for expressions evaluation
	private static String [] tabExpr2 = {
		"false and true",
		"false or true",
		"true and not false", 
		"false and not true",
		"not true and not true",
		"not true and not false",
		"not false and not false",
		"-3+3",
		"3*4",
		"2+3*4",
		"(2*3-1)/5+1",
		"2*3-1/5+1"
	};
	
	public static void main(String[] args) {
		//System.out.println(GrafcetExpressionParser.parseAndStringFromFile("./TestExpressions.txt"));
		//run_string();
		//run_eval();
		run_expr();
	}
	
	public static void run_expr() {
		System.out.println("\nParse and string expressions\n");
		for(String str_exp:tabExpr1) {
			System.out.println("\nInput :\t" + str_exp);
			//String result = runExp_ToString_fromFile(exp);
			Expression g7ExpTree = GrafcetExpressionParser.parseBuildExprTree(str_exp, null);
			//System.out.println("Out :\t" + GrafcetExpressionParser.getInfixTreeString(g7ExpTree));
			System.out.println("Out :\t" + GrafcetExpressionParser.getRPN_StringTree(g7ExpTree));
		}
	}
	
	public static void run_eval() {
		System.out.println("\nParse and EVAL expressions\n");
		for(String exp:tabExpr2) {
			System.out.println("\nInput :\t\t" + exp);
			//String result = runExp_ToString_fromFile(exp);
			Integer result = GrafcetExpressionParser.ParseAndEvalSimpleExpr(exp);
			System.out.println("Out :\t\t" + result.intValue());
		}
	}
	public static void run_string() {
		for(String exp:tabExpr1) {
			System.out.println("\nInput :\t\t" + exp);
			//String result = runExp_ToString_fromFile(exp);
			String result = GrafcetExpressionParser.parseAndStringExpr(exp);
			System.out.println("Out :\t\t" + result);
		}
	}

}
