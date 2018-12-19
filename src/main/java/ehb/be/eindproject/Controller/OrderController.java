package ehb.be.eindproject.Controller;

import ehb.be.eindproject.model.Artikel;
import ehb.be.eindproject.model.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    @Autowired
    private ArtikelRepository artikelRepository;

    @ModelAttribute("all")
    public Iterable<Artikel> findAll() {
        return artikelRepository.findAll();
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String showOrder(ModelMap map) {

        return "order";
    }



    @RequestMapping(value = "/order/{id}",method = RequestMethod.GET)
    public String showInfo(ModelMap map, @PathVariable(value = "id") int id){
        Artikel a = artikelRepository.findById(id).get();
        map.addAttribute("artikel", a);
        return "order";
    }

}
