package formulaParser.formulaAbsyntree;
import formulaParser.Visitor;
public class UserVariable {
	public int pos;
	  public String s;

	  public UserVariable(int p, String as) {
	    pos=p; s=as;
	  }
		public void accept(Visitor v){
			v.visit(this);
		}
}
