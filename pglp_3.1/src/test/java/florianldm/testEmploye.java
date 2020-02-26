package florianldm;
import org.junit.Assert;
import org.junit.Test;

public class testEmploye {

    @Test
    public void testinstance(){
        Employe e = new Employe("Jo","3 rue des prunes");
        Assert.assertTrue(e != null);
    }
}
