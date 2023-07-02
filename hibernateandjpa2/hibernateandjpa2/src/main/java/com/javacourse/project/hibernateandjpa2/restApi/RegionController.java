package com.javacourse.project.hibernateandjpa2.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateandjpa2.Business.IRegionService;
import com.javacourse.project.hibernateandjpa2.Entities.Region;

@RestController
@RequestMapping("/api") 
public class RegionController {
	
	private IRegionService ıregionService;

	@Autowired()////otomatik olarak git bak icityservice ye uygun birşey varsa onu ver
	public RegionController(IRegionService iregionService) {
		//super();
		this.ıregionService = iregionService;
	}
	
	@GetMapping("/regions") //Kullanıcımızın nasıl çağıracağını öğrenebiliriz
	//GetMapping veritabanında bi işlem yapmak istemiyorsam kullanırım bana data verir.
	public List<Region>get(){
		return this.ıregionService.GetAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Region region){//Burdaki parametreye yapılan isteğin body sinden alırım
		this.ıregionService.add(region);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Region region){
		this.ıregionService.update(region);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Region region){
		this.ıregionService.delete(region);
	}
	
	@GetMapping("/regions/{id}")
	public Region getById(@PathVariable int id){ //pathvariable kullanarak yukardaki süslü parantezin içiyle burdaki id nin eşit olması lazım
		
		return ıregionService.getById(id);
	}
}
