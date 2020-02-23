import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
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
    public void testElbonianCipher(){
        ElbonianCipher cipherE = new ElbonianCipher();
        assertEquals(cipherE.encode(".,.343,.5"), "INVALID INPUT");
        assertEquals(cipherE.encode("qKKQxsQClhQxzwbsmgQeBAgRTZnTwbxKLIUkKFWmDMxzCLztqeSoXFJPmcPEbTdPNZnwVKotcMYqqjuZupUGxdioqNQYAHFnwrGtqqfktBaoKbolFogYnYAYeqpachnjbxQnoixLYHRiAKZG"), "INVALID INPUT");
        assertEquals(cipherE.encode("!?&"), "INVALID INPUT");
        assertEquals(cipherE.encode("Hello World"), "0805121215S2315181204");
        assertEquals(cipherE.encode("The beauty of the sunset was obscured by the industrial cranes"), "200805S020501212025S1506S200805S192114190520S230119S1502190321180504S0225S200805S09140421192018090112S031801140519");

    }
}
