package es.ulpgc;

public class ConditionOperatorInteger extends ConditionOperator {

    public ConditionOperatorInteger(OPERATOR operator) {
        super(operator);
    }

    @Override
    protected boolean equal(Object leftObject, Object rightObject) {
        return (int) leftObject == (int) rightObject;
    }

    @Override
    protected boolean notEqual(Object leftObject, Object rightObject) {
        return (int) leftObject != (int) rightObject;
    }

    @Override
    protected boolean greaterThan(Object leftObject, Object rightObject) {
        return (int) leftObject > (int) rightObject;
    }

    @Override
    protected boolean greaterEqualThan(Object leftObject, Object rightObject) {
        return (int) leftObject >= (int) rightObject;
    }

    @Override
    protected boolean lessEqualThan(Object leftObject, Object rightObject) {
        return (int) leftObject <= (int) rightObject;
    }

    @Override
    protected boolean lessThan(Object leftObject, Object rightObject) {
        return (int) leftObject < (int) rightObject;
    }
}
