import org.junit.*;
import org.mockito.Mockito;

/**
 * Created by soroosh on 1/26/15.
 */
public class MockitoTest {
    @org.junit.Test
    public void ttt(){
        class  HttpUriRequest{
            public String getFirstHeader(){
                return "Header";
            }
        }
        HttpUriRequest request = Mockito.mock(HttpUriRequest.class);
        Mockito.when(request.getFirstHeader()).thenReturn("yoohoo");
        System.out.println(request.getFirstHeader());

    }
}
