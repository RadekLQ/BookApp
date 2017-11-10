package be.lizak.bookapp.mapper;

import be.lizak.bookapp.model.Genre;
import be.lizak.bookapp.model.Language;

import java.util.Arrays;

public class EnumMapper {

    public static Genre mapToGenre(int genre) {
        for(Genre g : Genre.values()) {
            if(g.ordinal() == genre)
                return g;
        }

        throw new RuntimeException("genre not found");
    }

    public static Language mapToLanguage (int language) {
        return Arrays.stream(Language.values())
                .filter(l-> l.ordinal() == language)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Language not found"));
    }
}
