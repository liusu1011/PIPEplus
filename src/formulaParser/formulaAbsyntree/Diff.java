package formulaParser.formulaAbsyntree;
import pipe.dataLayer.abToken;
import formulaParser.Visitor;
public class Diff extends SetExp{
	public abToken abTok;
	public Term t1, t2;
	public Diff(int p, Term t1, Term t2){
		this.pos = p;
		this.t1 = t1;
		this.t2 = t2;
	}
	public void accept(Visitor v){
		v.visit(this);
	}
}
