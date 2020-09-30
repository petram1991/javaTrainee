package org.example.mocking;


public class TrajectPrijsService implements TrajectEenhedenNaarPrijsService, TrajectNaarTrajectEenhedenService {


    public int getPriceTrajectEenheden(int aantalTrajectEenheden) {
        return aantalTrajectEenheden;
    }


    public int getTrajectEenheden(String from, String to) {
        return getTrajectEenheden(from, to);
    }
}
