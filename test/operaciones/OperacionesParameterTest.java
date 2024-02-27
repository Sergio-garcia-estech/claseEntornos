package operaciones;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(Parameterized.class)
public class OperacionesParameterTest {

    @Parameters
    public static  Object data(){
        return new Object[][]{
                {4,2,2},
                {6,3,18},
                {5,5,1},
                {10,5,50}
        };
    }
    private int num1;
    private int num2;
    private int res;

    public OperacionesParameterTest(int num1, int num2, int res){
        this.num1 = num1;
        this.num2 = num2;
        this.res = res;
    }

    @Test
    public void testParametrico(){
        Assert.assertEquals(res,OperacionesParameter.multiplicacion(num1,num2));
    }

}