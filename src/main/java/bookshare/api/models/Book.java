package bookshare.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    @JsonProperty("_id")
    private String id;

    private String title;

}
