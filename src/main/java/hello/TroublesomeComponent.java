package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractReactiveHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class TroublesomeComponent extends AbstractReactiveHealthIndicator {

    private final SomeService someService;

    @Autowired
    TroublesomeComponent(SomeService someService) {
        this.someService = someService;
    }

    @Override
    protected Mono<Health> doHealthCheck(Health.Builder builder) {
        someService.foo();
        return Mono.just(Health.down().build());
    }
}
