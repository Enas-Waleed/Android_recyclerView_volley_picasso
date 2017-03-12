package com.dixit.shlok.buzzfeed;

/**
 * Created by ShlokDixit on 3/11/17.
 */

public class ListItem {

    private String heading;
    private String imageUrl;
    private String description;

    public ListItem(String heading, String description, String imageUrl) {
        this.heading = heading;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getHeading() {
        return heading;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}
