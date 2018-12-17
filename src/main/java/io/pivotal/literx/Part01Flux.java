package io.pivotal.literx;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	Flux<String> fooBarFluxFromList() {
		List<String> foobarList = new ArrayList<>();
		foobarList.add("foo");
		foobarList.add("bar");
		return Flux.fromIterable(foobarList);
	}

//========================================================================================

	Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException("Illegal State"));
	}

//========================================================================================

	Flux<Long> counter() {
		return Flux.interval(Duration.ofMillis(100)).take(10);
	}

}
