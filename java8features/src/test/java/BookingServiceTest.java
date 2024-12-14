import org.example.bo.PaymentService;
import org.example.bo.TicketBookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class BookingServiceTest {


    @Mock
    PaymentService paymentService;


    @InjectMocks
    TicketBookingService bookingService;


    @BeforeEach
    public void executeBeforeMain() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testBookTicketForMovie() throws InterruptedException {
        when(paymentService.processPayment()).thenReturn(true);
        bookingService.bookTicketForMovie();
        verify(paymentService, atLeastOnce()).processPayment();
    }

}
