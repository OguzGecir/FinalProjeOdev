package tr.edu.medipol.yazilimaraclari.FinalProjesi;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.*;


class FinalTest {
	@Test
	public void urunEkleTest() {
		UrunDepo urun = new UrunDepo();
		
		
        String[] array = {"Iphone Apple","Samsung Galaxy S21"};
      // assertEquals("",urun.urunEkle(urun));
      assertNotEquals("",urun.urunEkle(null));
		
		

       

	

}
}
