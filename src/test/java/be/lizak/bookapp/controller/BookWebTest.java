package be.lizak.bookapp.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class BookWebTest {

    //Server has to be working
    private static final String URL_FIND_ALL = "http://localhost:8085/books";

    @Test
    public void testFindAllBooks() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<List> responseEntity = template.getForEntity(URL_FIND_ALL, List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseEntity<String> jsonString = template.getForEntity(URL_FIND_ALL, String.class);
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString.getBody());
            assertThat(jsonNode.toString()).isEqualTo("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
