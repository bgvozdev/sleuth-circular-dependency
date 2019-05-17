package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

    private final RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public SomeService(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplateBuilder = restTemplateBuilder;
        this.restTemplateBuilder.build();
    }


    public void foo() {
        this.restTemplateBuilder.build();
    }
}
