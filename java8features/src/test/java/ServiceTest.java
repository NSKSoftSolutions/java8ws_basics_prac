import org.example.bo.MyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void testServiceMethod() {
        MyService serviceMock = mock(MyService.class);
        when(serviceMock.getData()).thenReturn("Mock Data");
        String result = serviceMock.getData();
        assertEquals("Mock Data", result);
        verify(serviceMock).getData();
    }
}