package pkg1.holidays;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolidaysController {
	
	@Autowired
	HolidaysRepo hr1;
	
	@PostMapping("/holidays/loaddata/{fname}")
	public String loadData(@PathVariable String fname) throws IOException {
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			hr1.save(new HolidaysEntity(arr1[1],arr1[2],arr1[3]));
		}
		return "Success";
	}
	
	@GetMapping("/holidays/2024")
	public List<HolidaysEntity> findAllHolidays() {
		return hr1.findAll();
	}
	@GetMapping("/holidays/2024/{month}")
	public List<HolidaysEntity> findAllHolidays(@PathVariable int month) {
		List<HolidaysEntity>list1=hr1.findAll();
		List<HolidaysEntity>list2=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			String temp1=list1.get(i).getDate().substring(3,5);
			if(month==Integer.parseInt(temp1)) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}
}
