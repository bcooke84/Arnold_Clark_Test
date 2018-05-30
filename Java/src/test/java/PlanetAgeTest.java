import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetAgeTest {
    
    PlanetAge planetAge;

    @Before
    public void before() {
        planetAge = new PlanetAge();
    }

    @Test
    public void canCalculateEarthAgeInSeconds() {
        assertEquals(1041400800, planetAge.calculateEarthAgeInSeconds(33), 0.0001);
    }

    @Test
    public void canGetEarthAgeFromSeconds() {
        assertEquals(33, planetAge.getEarthAgeFromSeconds(1041400800), 0.01);
    }

    @Test
    public void canGetAllAgesInYears() {
        assertEquals(8,planetAge.getAllAgesFromYears(33).size());
    }

    @Test
    public void canGetAllAgesInSeconds() {
        assertEquals(9, planetAge.getAllAgesFromSeconds(100000000).size());
    }

    //
//    @Test
//    public void canGetMercuryAge() {
//        assertEquals(137.01, planetAge.canGetEarthAgeInSeconds(), 0.01);
//    }
//
//    @Test
//    public void canGetVenusAge() {
//        assertEquals(53.64, planetAge.getVenusAge(), 0.01);
//    }
//
//    @Test
//    public void canGetMarsAge() {
//        assertEquals(17.55, planetAge.getMarsAge(), 0.01);
//    }
//
//    @Test
//    public void canGetJupiterAge() {
//        assertEquals(2.78, planetAge.getJupiterAge(), 0.01);
//    }
//
//    @Test
//    public void canGetSaturnAge() {
//        assertEquals(1.12, planetAge.getSaturnAge(), 0.01);
//    }
//
//    @Test
//    public void canGetUranusAge() {
//        assertEquals(0.39, planetAge.getUranusAge(), 0.01);
//    }
//
//    @Test
//    public void canGetNeptuneAge() {
//        assertEquals(0.20, planetAge.getNeptuneAge(), 0.01);
//    }
//
//    @Test
//    public void canGetPlutoAge() {
//        assertEquals(0.13, planetAge.getPlutoAge(), 0.01);
//    }

}
