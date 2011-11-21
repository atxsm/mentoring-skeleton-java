package org.atxsm.archetype;


import org.junit.Test;


import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class AppTest {

    @Test
    public void true_is_true() {
        assertThat(new App(), notNullValue());
    }

}
