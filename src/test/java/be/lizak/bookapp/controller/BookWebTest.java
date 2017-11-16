package be.lizak.bookapp.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class BookWebTest {

    //Server has to be working
    private static final String URL = "http://localhost:8085/books";

    private RestTemplate template;

    @Before
    public void init() {
        template = new RestTemplate();
    }

    public void testAddBook() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        //todo jsonBook via Postman paste in between the ""
        String jsonBook = "";

        HttpEntity<String> data = new HttpEntity<>(jsonBook, headers);

        ResponseEntity<Integer> responseEntity = template.postForEntity(URL, data, Integer.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(1);

    }

    @Test
    public void testFindAllBooks() {
        ResponseEntity<List> responseEntity = template.getForEntity(URL, List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        //todo
        ResponseEntity<String> jsonArray = template.getForEntity(URL, String.class);
        try {
            List<Book> allBooks = newArraylist<>();
            JSONArray array = new JSONArray(jsonArray.getBody());
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonBook = array.getJSONObject(i);
                Book javaBook = new Book();
                javaBook.setT

            }

            assertThat(allBooks).isNotEmpty();

            Book myFirstBook = allBooks.get(0);
            assertThat(myFirstBook.getId()).isEqualTo(4);
            assertThat(myFirstBook.getAuthor()).isEqualTo("Radek");
            assertThat(MyFirstbook.getTitel()).isEqualTo("titel");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        //todo
    }
}
