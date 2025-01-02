import org.example.bo.ALLInOneBookingService;
import org.example.bo.UpiPaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ALLInONeBookingServiceTest {


    @Mock
    UpiPaymentService upiPaymentService;

    @InjectMocks
    ALLInOneBookingService allInOneBookingService;

    @BeforeEach
    public void executeBeforeEach() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testBookBusTicketsWithUpiPayment() throws InterruptedException {
        // Mock UPI payment service behavior
        when(upiPaymentService.processPayment(anyInt())).thenReturn(true);

        // Execute the method
        boolean result = allInOneBookingService.bookBusTickets();

        // Assert and verify
        assertTrue(result);
        verify(upiPaymentService, atLeast(1)).processPayment(500);
    }
}
