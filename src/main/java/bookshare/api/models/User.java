package bookshare.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {

    @JsonProperty("_id")
    private String id;

    private String login;

    private List<Book> wanted;

    private List<Book> offered;
}
