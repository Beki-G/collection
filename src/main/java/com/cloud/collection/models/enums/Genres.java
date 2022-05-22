package com.cloud.collection.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Genres {
    FANTASY(Genre.FANTASY),
    SCIENCE_FICTION(Genre.SCIENCE_FICTION),
    DYSTOPIAN(Genre.DYSTOPIAN),
    ACTION_AND_ADVENTURE(Genre.ACTION_AND_ADVENTURE),
    MYSTERY(Genre.MYSTERY),
    HORROR(Genre.HORROR),
    THRILLER_AND_SUSPENSE(Genre.THRILLER_AND_SUSPENSE),
    HISTORICAL_FICTION(Genre.HISTORICAL_FICTION),
    ROMANCE(Genre.ROMANCE),
    WOMANS_FICTION(Genre.WOMANS_FICTION),
    LGBTQ(Genre.LGBTQ),
    CONTEMPORARY_FICTION(Genre.CONTEMPORARY_FICTION),
    LITERARY_FICTION(Genre.LITERARY_FICTION),
    MAGICAL_REALISM(Genre.MAGICAL_REALISM),
    MAGIC(Genre.MAGIC),
    GRAPHIC_NOVEL(Genre.GRAPHIC_NOVEL),
    MANGA(Genre.MANGA),
    SHORT_STORY(Genre.SHORT_STORY),
    YOUNG_ADULT(Genre.YOUNG_ADULT),
    NEW_ADULT(Genre.NEW_ADULT),
    CHILDRENS(Genre.CHILDRENS),
    MEMOIR_AND_AUTOBIOGRAPHY(Genre.MEMOIR_AND_AUTOBIOGRAPHY),
    BIOGRAPHY(Genre.BIOGRAPHY),
    FOOD_AND_DRINK(Genre.FOOD_AND_DRINK),
    ART_AND_PHOTOGRAPHY(Genre.ART_AND_PHOTOGRAPHY),
    SELF_HELP(Genre.SELF_HELP),
    HISTORY(Genre.HISTORY),
    TRAVEL(Genre.TRAVEL),
    TRUE_CRIME(Genre.TRUE_CRIME),
    HUMOR(Genre.HUMOR),
    ESSAYS(Genre.ESSAYS),
    HOW_TO(Genre.HOW_TO),
    RELIGION_AND_SPIRITUALITY(Genre.RELIGION_AND_SPIRITUALITY),
    HUMANITIES_AND_SOCIAL_SCIENCES(Genre.HUMANITIES_AND_SOCIAL_SCIENCES),
    PARENTING_AND_FAMILIES(Genre.PARENTING_AND_FAMILIES),
    SCIENCES_AND_TECHNOLOGY(Genre.SCIENCES_AND_TECHNOLOGY),
    SPORTS(Genre.SPORTS),
    COMING_OF_AGE(Genre.COMING_OF_AGE),
    FAIRY_TAIL(Genre.FAIRY_TALE),
    POETRY(Genre.POETRY),
    ISEKAI(Genre.ISEKAI);


    public final String type;

    public static final class Genre {
        public static final String FANTASY = "fantasy";
        public static final String SCIENCE_FICTION = "science fiction";
        public static final String DYSTOPIAN= "dystopian";
        public static final String ACTION_AND_ADVENTURE = "action & adventure";
        public static final String MYSTERY = "mystery";
        public static final String HORROR = "horror";
        public static final String THRILLER_AND_SUSPENSE= "thriller & suspense";
        public static final String HISTORICAL_FICTION = "historical fiction";
        public static final String ROMANCE = "romance";
        public static final String WOMANS_FICTION = "woman's fiction";
        public static final String LGBTQ = "lgbtq+";
        public static final String CONTEMPORARY_FICTION = "contemporary fiction";
        public static final String LITERARY_FICTION = "literary fiction";
        public static final String MAGICAL_REALISM = "magical realism";
        public static final String MAGIC = "magic";
        public static final String GRAPHIC_NOVEL = "graphic novel";
        public static final String MANGA = "manga";
        public static final String SHORT_STORY = "short story";
        public static final String YOUNG_ADULT = "young adult";
        public static final String NEW_ADULT = "new adult";
        public static final String CHILDRENS = "childrens";
        public static final String MEMOIR_AND_AUTOBIOGRAPHY = "memoir & autobiography";
        public static final String BIOGRAPHY = "biography";
        public static final String FOOD_AND_DRINK = "food & drink";
        public static final String ART_AND_PHOTOGRAPHY = "art & photography";
        public static final String SELF_HELP = "self help";
        public static final String HISTORY = "history";
        public static final String TRAVEL = "travel";
        public static final String TRUE_CRIME = "true crime";
        public static final String HUMOR = "humor";
        public static final String ESSAYS = "essays";
        public static final String HOW_TO = "how to";
        public static final String RELIGION_AND_SPIRITUALITY = "religion & spirituality";
        public static final String HUMANITIES_AND_SOCIAL_SCIENCES = "humanities & social sciences";
        public static final String PARENTING_AND_FAMILIES = "parenting & families";
        public static final String SCIENCES_AND_TECHNOLOGY = "sciences and technology";
        public static final String SPORTS = "sports";
        public static final String COMING_OF_AGE = "coming of age";
        public static final String FAIRY_TALE = "fairy tale";
        public static final String POETRY = "poetry";
        public static final String ISEKAI = "isekai";
    }
}
