package com.ibtihal.crmtool;

import com.ibtihal.crmtool.model.Customer;
import com.ibtihal.crmtool.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
<<<<<<< HEAD
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
=======
>>>>>>> 0b0bfc3 (Updated project files and configurations)

import java.time.LocalDateTime;

@SpringBootTest
@AutoConfigureMockMvc
class CrmtoolApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CustomerService customerService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateCustomer() throws Exception {
<<<<<<< HEAD
=======
        
>>>>>>> 0b0bfc3 (Updated project files and configurations)
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Ibtihal Ibrahim");
        customer.setEmail("ibtihal.ibra@example.com");
        customer.setPhoneNo("1234567890");
        customer.setAddress("Muscat");
        customer.setCreatedAt(LocalDateTime.of(2024, 9, 4, 12, 0));
        customer.setStatus("Active");

<<<<<<< HEAD
        when(customerService.createCustomer(any(Customer.class))).thenReturn(customer);

=======
        
        when(customerService.createCustomer(any(Customer.class))).thenReturn(customer);

       
>>>>>>> 0b0bfc3 (Updated project files and configurations)
        mockMvc.perform(post("/api/customers")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"name\": \"Ibtihal Ibrahim\", \"email\": \"ibtihal.ibra@example.com\", " +
                        "\"phoneNo\": \"1234567890\", \"address\": \"Muscat\", " +
                        "\"createdAt\": \"2024-09-04T12:00:00\", \"status\": \"Active\" }"))
<<<<<<< HEAD
                .andExpect(status().isOk())
                .andExpect(content().json("{ \"id\": 1, \"name\": \"Ibtihal Ibrahim\", " +
                        "\"email\": \"ibtihal.ibra@example.com\", \"phoneNo\": \"1234567890\", " +
                        "\"address\": \"Muscat\", \"createdAt\": \"2024-09-04T12:00:00\", \"status\": \"Active\" }"));
    }
}

=======
                .andExpect(status().isOk());
    }
}
>>>>>>> 0b0bfc3 (Updated project files and configurations)
