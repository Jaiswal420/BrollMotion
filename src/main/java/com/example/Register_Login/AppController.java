package com.example.Register_Login;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class AppController 
{
//	@Bean
//	@Autowiredl
//    public BCryptPasswordEncoder bCryptPasswordEncoder;	
//	
//  @Autowired
//  private UserRepository repo;
  
   @Autowired
   private UserRepository repo;

   @Autowired
   private InfluencerRepository influencerRepository;

//  @Autowired
//  private EmailService emailService;
   
   @GetMapping("/index.html")
   public String showIndexPage()
   {
//	   model.addAttribute("user", new User());
	   return "index.html";
	   
	   
   }
   
   @GetMapping("/about.html")
   public String showAboutPage()
   {
//	   model.addAttribute("user", new User());
	   return "about.html";
	   
	   
   }
   
   @GetMapping("/service.html")
   public String showServicePage()
   {
//	   model.addAttribute("user", new User());
	   return "service.html";
	   
	   
   }
   
   @GetMapping("/project.html")
   public String showProjectPage()
   {
//	   model.addAttribute("user", new User());
	   return "project.html";
	   
	   
   }
   
   @GetMapping("/feature.html")
   public String showBlogPage()
   {
//	   model.addAttribute("user", new User());
	   return "feature.html";
	   
	   
   }
   
   @GetMapping("/contact.html")
   public String showContactPage(Model model)
   {
	   model.addAttribute("user", new User());
	   return "contact.html";
	   
	   
   }
   @GetMapping("/microinfluencer.html")
   public String showInfluencerForm(Model model) {
       model.addAttribute("influencer", new Influencer());
       return "microinfluencer"; // name of your HTML file (without .html)
   }

   @GetMapping("/microinfluencer")
   public String showMicroInfluencerPage(Model model) {
       model.addAttribute("influencer", new Influencer());
       return "microinfluencer";
   }
   
   @PostMapping("/process_register")
   public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException
   {
       repo.save(user);
       return "contact.html";
   }     
   @PostMapping("/process_influencer")
   public String registerInfluencer(@ModelAttribute("influencer") Influencer influencer) {
       influencerRepository.save(influencer);
       return "redirect:/"; // Or a thank-you page
   }
   
   
   
   
}
