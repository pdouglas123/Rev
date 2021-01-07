package mockito_test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JUnit_Test {
    @Mock
    Service service;
 
    @InjectMocks
    ServiceI_Implementation Service_Impl = new ServiceI_Implementation();
 
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_doubleLong_Pass() {
        long expected = 20;
        Mockito.when(Service.doubleLong(Mockito.anyLong())).thenReturn(expected);
 
        long actual = Service.doubleLong(Mockito.anyLong());
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void test_doubleLong_Inject() {
        long expected = 20;
        //this method is actually called
        long actual = ServiceI_Implementation.doubleLong(10);
 
        Assert.assertEquals(expected, actual);
    }
 
}
