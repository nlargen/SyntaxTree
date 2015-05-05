
public class MathExpression extends Expression
{
	private Expression leftOperand;
	private Expression rightOperand;
	private OpExpression operator;
	
	public Expression getLeftOperand() {
		return leftOperand;
	}

	public Expression getRightOperand() {
		return rightOperand;
	}

	public OpExpression getOperator() {
		return operator;
	}

	public MathExpression(Expression leftOperand, Expression rightOperand, OpExpression operator)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}
	public String toString()
	{
		return ("(" + leftOperand.toString() + " " + operator.toString() + rightOperand.toString() + ")");
	}
}
