package br.com.caelum.vraptor.converter;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class PrimitiveFloatConverterTest {
    
    private PrimitiveFloatConverter converter;

    @Before
    public void setup() {
        this.converter = new PrimitiveFloatConverter();
    }
    
    @Test
    public void shouldBeAbleToConvertNumbers(){
        assertThat((Float) converter.convert("2.2", float.class), is(equalTo(2.2f)));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void shouldComplainAboutInvalidNumber() {
        converter.convert("---", float.class);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void shouldComplainAboutNull() {
        converter.convert(null, float.class);
    }

}