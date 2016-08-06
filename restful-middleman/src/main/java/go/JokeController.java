package go;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JokeController {

    @RequestMapping("/")
    public String showJoke() {
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject("http://api.icndb.com/jokes/random", Joke.class);
        return joke.toString();
    }
}
