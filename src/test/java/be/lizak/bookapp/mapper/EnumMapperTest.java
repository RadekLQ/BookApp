package be.lizak.bookapp.mapper;

import be.lizak.bookapp.model.Genre;
import be.lizak.bookapp.model.Language;
import org.junit.Before;
import org.junit.Test;

import static be.lizak.bookapp.model.Language.DUTCH;
import static org.junit.Assert.*;

//@Ignore
public class EnumMapperTest {

    @Before
    public void init() {
    }

    @Test
    public void testMapToGenre(){

        //0 = Thriller
        Genre g = EnumMapper.mapToGenre(0);
        assertThat(g).isEqualTo(Genre.THRILLER);
        assertThat(g.name()).isEqualTo("THRILLER");
        assertThat(g.ordinal()).isEqualTo(0);
    }

    @Test(expected = RuntimeException.class)
    public void testMapToGenreWithException(){
        Genre notFound = EnumMapper.mapToGenre(100);
        assertThat(notFound).isNull();
    }

    @Test
    public void testMapToLanguage() {
        Language dutch = EnumMapper.mapToLanguage(0);
        assertThat(dutch).isEqualTo(DUTCH) ;

    }

    @Test
    public void testMapToLanguageWithException() {
        EnumMapper.mapToGenre(100);
    }
}
