package florianldm;
import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de test de Employe.
 */
public class testEmploye {

    /**
     * Méthode de test instance de classe Employe.
     */
    @Test
    public void testinstance() {
        Employe e = new Employe("Jo", "3 rue des prunes");
        Assert.assertTrue(e != null);
    }
}
