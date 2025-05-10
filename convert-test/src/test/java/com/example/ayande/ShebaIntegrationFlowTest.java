package com.example.ayande;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ShebaIntegrationFlowTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void validAyandeShebaNoTest1() throws Exception {
        String validSheba = "IR120626789012345678901234";

        mockMvc.perform(get("/ayande/sheba/" + validSheba))
                .andExpect(jsonPath("$.referenceId").exists())
                .andExpect(jsonPath("$.referenceId").isString())
                .andExpect(jsonPath("$.status").value("OK"))
                .andExpect(jsonPath("$.code").value("0"))
                .andExpect(jsonPath("$.errorMessage").doesNotExist())
                .andExpect(jsonPath("$.ayandeDto").exists())
                .andExpect(jsonPath("$.ayandeDto.accountNumber").value("2345678901234"))
                .andExpect(jsonPath("$.ayandeDto.shebaNumber").value("IR120626789012345678901234"));
    }

    @Test
    public void validAyandeShebaNoTest2() throws Exception {
        String validSheba = "IR120620000001234567890123";

        mockMvc.perform(get("/ayande/sheba/" + validSheba))
                .andExpect(jsonPath("$.referenceId").exists())
                .andExpect(jsonPath("$.referenceId").isString())
                .andExpect(jsonPath("$.status").value("OK"))
                .andExpect(jsonPath("$.code").value("0"))
                .andExpect(jsonPath("$.errorMessage").doesNotExist())
                .andExpect(jsonPath("$.ayandeDto").exists())
                .andExpect(jsonPath("$.ayandeDto.accountNumber").value("1234567890123"))
                .andExpect(jsonPath("$.ayandeDto.shebaNumber").value("IR120620000001234567890123"));
    }

    @Test
    public void invalidUrlTest() throws Exception {

        mockMvc.perform(get("/ayande/sheba"))
                .andExpect(jsonPath("$.referenceId").exists())
                .andExpect(jsonPath("$.referenceId").isString())
                .andExpect(jsonPath("$.status").value("INVALID_URL"))
                .andExpect(jsonPath("$.code").value("1"));
    }

    @Test
    public void invalidShebaNoTest() throws Exception {
        String invalidSheba = "IR120626789012345678901234567";

        mockMvc.perform(get("/ayande/sheba/" + invalidSheba))
                .andExpect(jsonPath("$.referenceId").exists())
                .andExpect(jsonPath("$.referenceId").isString())
                .andExpect(jsonPath("$.status").value("INVALID_SHEBA_NUMBER"))
                .andExpect(jsonPath("$.code").value("33"))
                .andExpect(jsonPath("$.errorMessage").exists())
                .andExpect(jsonPath("$.ayandeDto").doesNotExist());
    }

    @Test
    public void shebaDoesNotBelongToAyandeBankTest() throws Exception {
        String anotherBankShebaNo = "IR123456789012345678901234";

        mockMvc.perform(get("/ayande/sheba/" + anotherBankShebaNo))
                .andExpect(jsonPath("$.referenceId").exists())
                .andExpect(jsonPath("$.referenceId").isString())
                .andExpect(jsonPath("$.status").value("SHEBA_DOES_NOT_BELONG_TO_AYANDEH_BANK"))
                .andExpect(jsonPath("$.code").value("44"))
                .andExpect(jsonPath("$.errorMessage").exists())
                .andExpect(jsonPath("$.ayandeDto").doesNotExist());
    }

}