package com.adriano.codigo_morse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CodigoMorseTest {

    private CodigoMorse codigoMorse;

    @Before
    public void init(){
        this.codigoMorse = new CodigoMorse();
    }

    @Test
    public void convertParaMorse (){
        List<String> resultado = this.codigoMorse.convertSOS("SOS");
        List<String> expected = Arrays.asList("-", ".", "-");
        Assert.assertEquals(expected, resultado);
    }
}