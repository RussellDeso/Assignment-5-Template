import edu.wpi.cs3733.entity.CaesarCipher;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    @Test
    public void testCaesarCipher(){
        CaesarCipher cipher = new CaesarCipher();
        assertEquals(cipher.encode("AbkjfgdosuhnjAFGJDKFSGfjgoldksfjodinkldmsfhdgofjmJUTYHRGREFDSGF"),"VwfeabyjnpcieVABEYFANBaebjgyfnaejydifgyhnacybjaehEPOTCMBMZAYNBA");
        assertEquals(cipher.encode(".,.343,.5"), "INVALID INPUT");
        assertEquals(cipher.encode("This is a message"), "Ocdn dn v hznnvbz");
        assertEquals(cipher.encode("qKKQxsQClhQxzwbsmgQeBAgRTZnTwbxKLIUkKFWmDMxzCLztqeSoXFJPmcPEbTdPNZnwVKotcMYqqjuZupUGxdioqNQYAHFnwrGtqqfktBaoKbolFogYnYAYeqpachnjbxQnoixLYHRiAKZG"), "INVALID INPUT");
    }
}
