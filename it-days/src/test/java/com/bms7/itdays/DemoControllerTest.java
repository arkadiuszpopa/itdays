package com.bms7.itdays;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author BMS
 */

public class DemoControllerTest {
    @Test
    public void shouldReturnIndexTemplate() {
        // given
        DemoController objectUnderTests = new DemoController();

        // when
        String result = objectUnderTests.index(new ExtendedModelMap());

        // then
        assertThat(result).isEqualTo("index");
    }
}
