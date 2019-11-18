package es.ulpgc;

import org.junit.Test;
import org.mockito.Mockito.*;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ConditionTest {

//    @Test
//    public void shouldAnswerWithTrue() {
//        // Configurar
//        // Configure mock (Collaborators)
//        ConcreteSensor concreteSensorMock = mock(ConcreteSensor.class);
//        doReturn(0).when(concreteSensorMock).getValue();
//
//        // Configure SUT
//        Object threshold = new Object();
//        Operator operator = new Operator();
//        Condition condition = new Condition(threshold, operator, concreteSensorMock);
//
//        // Ejecutar
//        int v_Value_0 = (int) condition.getSensor().getValue();
//        int v_Value_1 = (int) condition.getSensor().getValue();
//
//
//        // Verificar
//        assertTrue(v_Value_0 == 0);
////        assertTrue(v_Value_0 == 0);
//
//        // Finalizar
//    }

    @Test
    public void conditionWorkingWithIntegersShouldAnswerWithTrue() {
        /* Conf */
        // Collaborators
        ConcreteSensor concreteSensor = mock(ConcreteSensor.class);
        doReturn((Integer) 0).when(concreteSensor).getValue();
        Object threshold = new Integer(0);
        ConditionOperatorInteger conditionOperatorInteger = new ConditionOperatorInteger(OPERATOR.EQUAL);

        // SUT
        Condition condition = new Condition(threshold, conditionOperatorInteger, concreteSensor, new Log());

        /* Exec */
        // no existe, puede unirse con Verif phase
        /* Verif */
        assertTrue(condition.isTrue());


        /* Final */
    }

    @Test
    public void conditionWorkingWithIntegersShouldAnswerWithFalse() {
        /* Conf */
        // Collaborators
        ConcreteSensor concreteSensor = mock(ConcreteSensor.class);
        doReturn((Integer) 1).when(concreteSensor).getValue();
        Object threshold = new Integer(0);
        ConditionOperatorInteger conditionOperatorInteger = new ConditionOperatorInteger(OPERATOR.EQUAL);

        // SUT
        Condition condition = new Condition(threshold, conditionOperatorInteger, concreteSensor, new Log());

        /* Exec */
        // no existe, puede unirse con Verif phase
        /* Verif */
        assertTrue(!condition.isTrue());


        /* Final */
    }

}
