import org.example.bo.AirtellServices;
import org.example.bo.WalletPaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class AirtellServiceTest {

    @Mock
    WalletPaymentService walletPaymentService;


    @InjectMocks
    AirtellServices airtellService;


    @BeforeEach
    public void executeBefore() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testProcessPayments() throws InterruptedException {
        when(walletPaymentService.processPayments(anyLong(), anyString(), anyDouble())).thenReturn("success");
        //doing the actual call to check
        airtellService.rechargeSim(7016228L, 500.00, "500PLAN");
        verify(walletPaymentService, atLeastOnce()).processPayments(anyLong(), anyString(), anyDouble());
    }

    @Test
    public void testProcessPaymentsService() throws InterruptedException {

        walletPaymentService = Mockito.mock(WalletPaymentService.class);
        airtellService = new AirtellServices(walletPaymentService);

        when(walletPaymentService.processPayments(anyLong(), anyString(), anyDouble())).thenReturn("success");
        airtellService.rechargeSim(770848L, 499.99, "499PLAN");

        verify(walletPaymentService, atLeastOnce()).processPayments(anyLong(), anyString(), anyDouble());

    }

}
