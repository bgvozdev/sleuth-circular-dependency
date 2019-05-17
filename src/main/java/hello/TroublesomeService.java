package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class TroublesomeService {

    private final RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public TroublesomeService(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplateBuilder = restTemplateBuilder;
        this.restTemplateBuilder.build();
    }


    public void foo() {
        this.restTemplateBuilder.build();
    }
}
