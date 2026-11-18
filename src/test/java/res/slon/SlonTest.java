package res.slon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlonTest {
    @Test
    void teasesBackWithUsersOwnLine() {
        Slon slon = new Slon();
        String response = slon.respond("Привет");
        assertTrue(response.contains("\"Привет\""));
        assertTrue(response.contains("А ты купи слона!"));
    }

    @Test
    void helpCommandReturnsGreeting() {
        Slon slon = new Slon();
        assertTrue(slon.greeting().contains("Привет!"));
        assertTrue(slon.greeting().contains("\\help"));
        assertTrue(slon.greeting().contains("\\exit"));
    }

    @Test
    void helpCommandReturnsHelp() {
        Slon slon = new Slon();
        assertEquals(slon.help(), slon.respond("\\help"));
    }

    @Test
    void exitCommandIsRecognized() {
        Slon slon = new Slon();
        assertTrue(slon.isExitCommand("\\exit"));
        assertFalse(slon.isExitCommand("Привет"));
    }
}