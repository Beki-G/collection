package com.cloud.collection.controllers.impl;

import com.cloud.collection.controllers.AnimeController;
import com.cloud.collection.controllers.generic.impl.ItemGenericControllerImpl;
import com.cloud.collection.dto.request.CreateAnime;
import com.cloud.collection.models.item.Anime;
import com.cloud.collection.service.impl.AnimeServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/anime")
@Tag(name = "Anime Controller", description = "For Anime item")
@RequiredArgsConstructor
public class AnimeControllerImpl extends ItemGenericControllerImpl<Anime> implements AnimeController {
    Logger log = LogManager.getLogger(AnimeControllerImpl.class);
    public AnimeServiceImpl animeService;

    @PostMapping
    public Anime addAnime(@RequestBody CreateAnime anime){
        log.info("Reached post: {}", anime);
        try {
            return animeService.saveAnime(anime);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Anime();
    }
}
