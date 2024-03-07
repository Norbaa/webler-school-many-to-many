package hu.webler.weblerschoolmanytomany.bootstrap;

import hu.webler.weblerschoolmanytomany.entity.base.YourEntity;
import hu.webler.weblerschoolmanytomany.persistence.YourEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final YourEntityRepository yourEntityRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // You can create and save example entities here
        YourEntity exampleEntity1 = new YourEntity();
        exampleEntity1.setName("Example 1");
        yourEntityRepository.save(exampleEntity1);

        YourEntity exampleEntity2 = new YourEntity();
        exampleEntity2.setName("Example 2");
        yourEntityRepository.save(exampleEntity2);

        YourEntity exampleEntity3 = new YourEntity();
        exampleEntity2.setName("Example 3");
        yourEntityRepository.save(exampleEntity3);
    }
}
