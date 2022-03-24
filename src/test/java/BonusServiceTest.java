import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void ShouldCalculateRegisteredAndBonusNotLimited() {
        BonusService service = new BonusService();

        boolean registered = true;
        long amount = 1000_60;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
    @Test
    void ShouldCalculateRegisteredAndBonusLimited() {
        BonusService service = new BonusService();

        boolean registered = true;
        long amount = 1_000_000_60;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
    @Test
    void ShouldCalculateNotRegisteredAndBonusNotLimited() {
        BonusService service = new BonusService();

        boolean registered = false;
        long amount = 1000_60;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
    @Test
    void ShouldCalculateNotRegisteredAndBonusLimited() {
        BonusService service = new BonusService();

        boolean registered = false;
        long amount = 1_000_000_60;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
}