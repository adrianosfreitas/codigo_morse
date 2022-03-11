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
    public void convertLetraS (){
        List<String> resultado = this.codigoMorse.convertWordToMorse("S");
        List<String> expected = Arrays.asList("...");

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void convertLetraO (){
        List<String> resultado = this.codigoMorse.convertWordToMorse("O");
        List<String> expected = Arrays.asList("---");

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void convertPalavraSOSMaiusculo (){
        List<String> resultado = this.codigoMorse.convertWordToMorse("SOS");
        List<String> expected = Arrays.asList("...","---","...");

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void convertPalavraSOSMinusculo (){
        List<String> resultado = this.codigoMorse.convertWordToMorse("sos");
        List<String> expected = Arrays.asList("...","---","...");

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void convertPalavraVazia (){
        List<String> resultado = this.codigoMorse.convertWordToMorse("");
        List<String> expected = Arrays.asList();

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void convertPalavraNula (){
        List<String> resultado = this.codigoMorse.convertWordToMorse(null);
        List<String> expected = Arrays.asList();

        Assert.assertEquals(expected, resultado);
    }
}