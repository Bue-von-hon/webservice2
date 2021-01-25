package springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexContoroller {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
