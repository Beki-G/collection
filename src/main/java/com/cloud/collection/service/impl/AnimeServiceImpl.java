package com.cloud.collection.service.impl;

import com.cloud.collection.dto.request.CreateAnime;
import com.cloud.collection.models.item.Anime;
import com.cloud.collection.service.AnimeService;
import com.cloud.collection.service.generic.impl.ItemGenericServiceImpl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AnimeServiceImpl extends ItemGenericServiceImpl<Anime>  implements AnimeService {
    Logger log = LogManager.getLogger(AnimeServiceImpl.class);

    public Anime saveAnime(CreateAnime animeInfo) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Anime animeMapped = mapper.convertValue(animeInfo, Anime.class);
        log.info("AnimeMapped: {}", animeMapped);
        return save(animeMapped);
    }

}
