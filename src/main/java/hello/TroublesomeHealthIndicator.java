package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractReactiveHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class TroublesomeHealthIndicator extends AbstractReactiveHealthIndicator {

    private final TroublesomeService someService;

    @Autowired
    TroublesomeHealthIndicator(TroublesomeService someService) {
        this.someService = someService;
    }

    @Override
    protected Mono<Health> doHealthCheck(Health.Builder builder) {
        someService.foo();
        return Mono.just(Health.down().build());
    }
}
