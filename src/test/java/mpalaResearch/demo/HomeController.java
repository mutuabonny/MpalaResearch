/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpalaResearch.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author mutub
 */
@Controller
public class HomeController {
    @GetMapping("/")
 public RedirectView main(){
 return new RedirectView("swagger-ui.html");
 }   
}
