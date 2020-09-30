package org.example.mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @Mock
    private TrajectNaarTrajectEenhedenService trajectNaarTrajectEenhedenService;
    @Mock
    private TrajectEenhedenNaarPrijsService trajectEenhedenNaarPrijsService;

    private TrajectPrijsService service;

    @BeforeEach
    void Setup(){
        this.service = new TrajectPrijsService();
      //  service.setTrajectEenhedenNaarPrijsService(this.trajectEenhedenNaarPrijsService);
     //   service.setTrajectNaarTrajectEenhedenService(this.trajectNaarTrajectEenhedenService);
       }

    @Test
        void getTrajectPrijs() {
            when(trajectNaarTrajectEenhedenService.getTrajectEenheden(eq("Zwolle"), eq("Groningen"))).thenReturn(5);
            when(trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eq(5))).thenReturn(4);

          //  int trajectPrijs = service.getTrajectPrijs("Zwolle", "Groningen");
            //assertThat(trajectPrijs, is(0));
        }
}
