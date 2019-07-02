package testActionsExpr;

public class TestG7ActionsExpressions {
	private static String [] tabExpr1 = {
			"A",
			"A if (init or not b and (N>258)) or [10s/X_8]",
			//"A := N*25-(D/2)",
	};

	public static void main(String[] args) {
		ExtendedG7Action exA ;
		for(String exp:tabExpr1) {
			exA = null;
			System.out.println("\n-----------------------Input :\t\t" + exp);
			try {
				exA = ExtendedG7ActionParser.parseActionExpression(exp, "A");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			if(exA != null) {
				System.out.println(
					"Action Name : "+exA.getVariableName() + "\n" +
					"Action Expression : "+exA.getG7xpression() + "\n" +
					"Action Type : "+exA.getType() + "\n"
				);
			}	
		}
	}
	
}
