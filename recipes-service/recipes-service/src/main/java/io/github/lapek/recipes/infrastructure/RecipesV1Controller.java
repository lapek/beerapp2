package io.github.lapek.recipes.infrastructure;

import com.mongodb.reactivestreams.client.MongoClient;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import reactor.core.publisher.Flux;

@Controller("/v1/recipes")
@RequiredArgsConstructor
public class RecipesV1Controller {

    private final MongoClient mongoClient;

    @Get
    public Flux<Document> a() {
        return Flux.from(mongoClient.getDatabase("recipes_db")
                .getCollection("recipes")
                .find());
    }
}
