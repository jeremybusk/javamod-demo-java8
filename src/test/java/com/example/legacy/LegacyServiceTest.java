package com.example.legacy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LegacyServiceTest {
    @Test
    void filtersNames() {
        LegacyService service = new LegacyService();
        assertEquals(Arrays.asList("Ada", "Grace"),
                service.activeNames(Arrays.asList(" Ada ", null, "", "Grace")));
        assertTrue(service.supported("alpha"));
    }
}
