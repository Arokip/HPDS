package es.ulpgc;

public abstract class ConditionOperator {
    private OPERATOR operator;

    public ConditionOperator(OPERATOR operator) {
        this.operator = operator;
    }

    public boolean evaluate(Object leftObject, Object rightObject) {
        boolean result;
        switch (this.operator) {
            case EQUAL:
                result = equal(leftObject, rightObject);
                break;
            case NOT_EQUAL:
                result = notEqual(leftObject, rightObject);
                break;
            case LESS_THAN:
                result = lessThan(leftObject, rightObject);
                break;
            case GREATER_THAN:
                result = greaterThan(leftObject, rightObject);
                break;
            case LESS_EQUAL_THAN:
                result = lessEqualThan(leftObject, rightObject);
                break;
            case GREATER_EQUAL_THAN:
                result = greaterEqualThan(leftObject, rightObject);
                break;
            default:
                result = false;
        }

        return result;
    }

    protected abstract boolean equal(Object leftObject, Object rightObject);

    protected abstract boolean notEqual(Object leftObject, Object rightObject);

    protected abstract boolean lessThan(Object leftObject, Object rightObject);

    protected abstract boolean greaterThan(Object leftObject, Object rightObject);

    protected abstract boolean lessEqualThan(Object leftObject, Object rightObject);

    protected abstract boolean greaterEqualThan(Object leftObject, Object rightObject);

}
