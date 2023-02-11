package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import ru.netology.javaga.javagamvn.services.BonusService;

public class BonusServiceTest {

    @Test
    public void testRegisteredUnderLimit() {

        for (int i = 10; i < 20; i++) {
            if (i * i > 200) {
                System.out.println("Квадрат " + i + " больше 200");
            }
        }
    }
}

