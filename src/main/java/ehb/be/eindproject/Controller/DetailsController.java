package ehb.be.eindproject.Controller;

import ehb.be.eindproject.model.Artikel;
import ehb.be.eindproject.model.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
    public class DetailsController {
        @Autowired
        ArtikelRepository artikelRepository;

        @RequestMapping(value = {"/details/{id}"}, method = RequestMethod.GET)
        public String showDetails(@PathVariable(name ="id") int identifier, ModelMap map) {

            Artikel detailArtikel = artikelRepository.findById(identifier).get();
            map.addAttribute("artikel",detailArtikel);

            return "details";
        }
}
