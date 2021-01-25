package springboot.web;


import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import springboot.web.api.getUser;
import springboot.web.dto.HelloResponseDto;

import java.util.ArrayList;
import java.util.StringTokenizer;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }


    @GetMapping("/api/getUser")
    private static Object getUser(@RequestParam("handle") String handle)
    {
        String baseUrl = "https://codeforces.com/api/user.info?handles=";
        String url=baseUrl+handle;
        String str = new getUser(url).getStr();
        str.replaceAll(" ","");
        StringTokenizer tokens = new StringTokenizer(str, "{}[]=\",");
        ArrayList<String> strArr = new ArrayList<String>();
        String rating = null;
        while(tokens.hasMoreTokens()) {
            String tmp = tokens.nextToken();
            strArr.add(tmp);
        }
        rating=strArr.get(8);
        return rating;
    }

}
