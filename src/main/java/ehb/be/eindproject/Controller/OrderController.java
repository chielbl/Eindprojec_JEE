package ehb.be.eindproject.Controller;

import ehb.be.eindproject.model.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    @Autowired
    private ArtikelRepository artikelRepository;

    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public String showOrder(){
        return "order";
    }
}
