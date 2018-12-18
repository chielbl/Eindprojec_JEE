package ehb.be.eindproject.Controller;

import ehb.be.eindproject.model.Artikel;
import ehb.be.eindproject.model.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private ArtikelRepository artikelRepository;

    @ModelAttribute("all")
    public Iterable<Artikel> findAll(){
        return artikelRepository.findAll();
    }

    @ModelAttribute("voeding")
    public Iterable<Artikel> findByVoeding(){
        return artikelRepository.findByCat("voeding");
    }

    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String showHome(ModelMap map){
        return "home";
    }
}
