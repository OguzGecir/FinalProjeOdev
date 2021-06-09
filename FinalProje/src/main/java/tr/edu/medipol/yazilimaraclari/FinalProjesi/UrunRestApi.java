package tr.edu.medipol.yazilimaraclari.FinalProjesi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urunler")
public class UrunRestApi {
	@GetMapping("/listele")
	public List <Urun> listele(){
		
		return UrunDepo.urunleriGetir();
		
	}
	
	@PostMapping("/ekle")
	public Urun ekle (@RequestBody Urun urun) {	
		UrunDepo.urunEkle(urun);
		return urun;
		
	}

}
