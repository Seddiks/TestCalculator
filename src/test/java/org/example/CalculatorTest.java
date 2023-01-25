package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Mock
    CalculatorService service ;
    @Rule public MockitoRule rule = MockitoJUnit.rule();
    Calculator calculator = null;

   @Before
    public void setup(){
       calculator = new Calculator(service);
   }

   @Test
    public void itCalculCorrect(){

       when(service.add(2,3)).thenReturn(5);
       assertEquals(10, calculator.perform(2,3));
       verify(service).add(2,3);
   }


}
