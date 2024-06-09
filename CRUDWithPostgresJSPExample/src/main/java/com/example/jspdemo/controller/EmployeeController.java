package com.example.jspdemo.controller;

import com.example.jspdemo.model.Employee;
import com.example.jspdemo.service.EmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService animeService;

    @GetMapping({"/", "/viewAnimeList"})
    public String viewAnimeList(@ModelAttribute("message") String message, Model model) throws Exception{
       
    	String apiUrl="http://localhost:8066/emp";
    	
    	
    	RestTemplate rt =new RestTemplate();
    	
    	//ResponseEntity<Employee[]> postForEntity =rt.getForEntity(apiUrl, Employee[].class);
    	List<Employee> empArra= rt.getForObject(apiUrl, ArrayList.class);
    	System.out.println(empArra);
    	
    //	System.out.println(postForEntity.getBody());
    	
   // 	Employee[] emp= postForEntity.getBody();
   // 	for(Employee emp1:emp) {
    //		System.out.println(emp1);
    	
    	
    	    	for(int i=0;i<empArra.size();i++) {
    	    		System.out.println(empArra.get(i));
    	
    	
    		
    	}
    	    	System.out.println("--------------------------------------------------");
    	    	for(Object emp1: empArra) {
    	    		System.out.println(emp1);
    	
    	
    		
    	}   	
    	    	
    	
    	
    	model.addAttribute("animeList", animeService.getAllEmployee());
        model.addAttribute("message", message);

        return "ViewAnimeList";
    }

    @GetMapping("/addmodal")
    public void addmodal(@ModelAttribute("message") String message, Model model) {
       
    	
    	
        model.addAttribute("message", "Hello");
        model.addAttribute("ViewAnimeList");
        
    }

    
     @GetMapping("/addAnime")
    public String addAnime(@ModelAttribute("message") String message, Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("message", message);

        return "AddAnime";
    }

    @PostMapping("/saveAnime")
    public String saveAnime(Employee anime, RedirectAttributes redirectAttributes) {
        if (animeService.saveOrUpdateAnime(anime)) {
        	
        	String apiUrl="http://localhost:8066/emp";
        	Employee emp=new Employee();
        	emp.setId(anime.getId());
        	emp.setEmp_name(anime.getEmp_name());
        	emp.setEmp_email(anime.getEmp_email());
        	emp.setEmp_phone(anime.getEmp_phone());
        	emp.setEmp_address(anime.getEmp_address());
        	
        	RestTemplate rt =new RestTemplate();
        	
        	ResponseEntity<String> postForEntity =rt.postForEntity(apiUrl, emp, String.class);
        	
        	System.out.println(postForEntity.getBody());
        	
            redirectAttributes.addFlashAttribute("message", "Save Success");
            return "redirect:/viewAnimeList";
        }

        redirectAttributes.addFlashAttribute("message", "Save Failure");
        return "redirect:/addAnime";
    }

    @GetMapping("/editAnime/{id}")
    public String editAnime(@PathVariable Long id, Model model) {
        
    	
    	
    	model.addAttribute("employee", animeService.getAnimeById(id));

        return "EditAnime";
    }

    @PostMapping("/editSaveAnime")
    public String editSaveAnime(Employee anime, RedirectAttributes redirectAttributes) {
        if (animeService.saveOrUpdateAnime(anime)) {
        	
        	String apiUrl="http://localhost:8066/emp";
        	Employee emp=new Employee();
        	emp.setId(anime.getId());
        	emp.setEmp_name(anime.getEmp_name());
        	emp.setEmp_email(anime.getEmp_email());
        	emp.setEmp_phone(anime.getEmp_phone());
        	emp.setEmp_address(anime.getEmp_address());
        	
        	RestTemplate rt =new RestTemplate();
        	
        	ResponseEntity<String> postForEntity =rt.postForEntity(apiUrl, emp, String.class);
        	
        	System.out.println(postForEntity.getBody());
        	
            redirectAttributes.addFlashAttribute("message", "Edit Success");
            return "redirect:/viewAnimeList";
        }

        redirectAttributes.addFlashAttribute("message", "Edit Failure");
        return "redirect:/editAnime/" + anime.getId();
    }

    @GetMapping("/deleteAnime/{id}")
    public String deleteAnime(@PathVariable Long id, RedirectAttributes redirectAttributes) {
    	if (animeService.deleteAnime(id)) {
        	
        	/*Delete Using REST API*/
        	
        	String apiUrl="http://localhost:8066/emp/{empid}";
        	RestTemplate rt =new RestTemplate();
        	
        	Map<String, Long> param=new HashMap<String, Long>();
        	param.put("empid", id);
        	rt.delete(apiUrl, param);
        	
            redirectAttributes.addFlashAttribute("message", "Delete Success");
        } else {
            redirectAttributes.addFlashAttribute("message", "Delete Failure");
        }

        return "redirect:/viewAnimeList";
    }

}
