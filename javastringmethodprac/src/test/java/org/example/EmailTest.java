package org.example;


import org.example.domain.Email;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmailTest {


    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Email email;

    @Test
    public void testvalidateEmailId() {
    }

}
