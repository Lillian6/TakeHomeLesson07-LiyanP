package com.example.pengbuding.takehomelesson07_liyanp;

/**
 * Created by pengbuding on 24/03/2018.
 */

public class Animal {
    public String name;
    public String averageAge;
    public int imageId;

    public Animal (String name, String averageAge, int imageId){
        this.name = name;
        this.averageAge = averageAge;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getAverageAge() {
        return averageAge;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageAge(String averageAge) {
        this.averageAge = averageAge;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
