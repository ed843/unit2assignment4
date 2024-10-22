package com.solvd.eduncan.models;

import com.fasterxml.jackson.annotation.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

@JsonRootName(value = "movie")
@XmlRootElement(name = "movie")
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {
    @JsonProperty("movie_id")
    @XmlElement(name = "movie_id")
    private int movieId;

    @XmlElement
    @JsonProperty("title")
    private String title;

    @XmlElement
    @JsonProperty("duration")
    private int duration;

    @XmlElement
    @JsonProperty("genre")
    private String genre;

    @JsonProperty("release_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @XmlElement(name = "release_date")
    @XmlSchemaType(name = "date")
    private Date releaseDate;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}