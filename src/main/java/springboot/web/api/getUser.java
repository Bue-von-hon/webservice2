package springboot.web.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.ArrayList;
import java.util.StringTokenizer;

@Getter
@RequiredArgsConstructor
public class getUser {
//    private final String handle;
    private String url;
    private String str;

    public getUser(String url) {
        this.url=url;
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(url);
        WebClient client = WebClient.builder().uriBuilderFactory(factory).build();

        Object trg = client.get().retrieve().bodyToMono(Object.class).block();
        str = trg.toString();
    }
}
