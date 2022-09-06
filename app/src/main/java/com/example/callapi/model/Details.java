package com.example.callapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Details {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("breeds")
    @Expose
    private List<Breed> breeds = null;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public class Breed {
        @SerializedName("weight")
        @Expose
        private Weight weight;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("cfa_url")
        @Expose
        private String cfaUrl;
        @SerializedName("vetstreet_url")
        @Expose
        private String vetstreetUrl;
        @SerializedName("vcahospitals_url")
        @Expose
        private String vcahospitalsUrl;
        @SerializedName("temperament")
        @Expose
        private String temperament;
        @SerializedName("origin")
        @Expose
        private String origin;
        @SerializedName("country_codes")
        @Expose
        private String countryCodes;
        @SerializedName("country_code")
        @Expose
        private String countryCode;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("life_span")
        @Expose
        private String lifeSpan;
        @SerializedName("indoor")
        @Expose
        private Integer indoor;
        @SerializedName("lap")
        @Expose
        private Integer lap;
        @SerializedName("adaptability")
        @Expose
        private Integer adaptability;
        @SerializedName("affection_level")
        @Expose
        private Integer affectionLevel;
        @SerializedName("child_friendly")
        @Expose
        private Integer childFriendly;
        @SerializedName("cat_friendly")
        @Expose
        private Integer catFriendly;
        @SerializedName("dog_friendly")
        @Expose
        private Integer dogFriendly;
        @SerializedName("energy_level")
        @Expose
        private Integer energyLevel;
        @SerializedName("grooming")
        @Expose
        private Integer grooming;
        @SerializedName("health_issues")
        @Expose
        private Integer healthIssues;
        @SerializedName("intelligence")
        @Expose
        private Integer intelligence;
        @SerializedName("shedding_level")
        @Expose
        private Integer sheddingLevel;
        @SerializedName("social_needs")
        @Expose
        private Integer socialNeeds;
        @SerializedName("stranger_friendly")
        @Expose
        private Integer strangerFriendly;
        @SerializedName("vocalisation")
        @Expose
        private Integer vocalisation;
        @SerializedName("bidability")
        @Expose
        private Integer bidability;
        @SerializedName("experimental")
        @Expose
        private Integer experimental;
        @SerializedName("hairless")
        @Expose
        private Integer hairless;
        @SerializedName("natural")
        @Expose
        private Integer natural;
        @SerializedName("rare")
        @Expose
        private Integer rare;
        @SerializedName("rex")
        @Expose
        private Integer rex;
        @SerializedName("suppressed_tail")
        @Expose
        private Integer suppressedTail;
        @SerializedName("short_legs")
        @Expose
        private Integer shortLegs;
        @SerializedName("wikipedia_url")
        @Expose
        private String wikipediaUrl;
        @SerializedName("hypoallergenic")
        @Expose
        private Integer hypoallergenic;
        @SerializedName("reference_image_id")
        @Expose
        private String referenceImageId;

        public Weight getWeight() {
            return weight;
        }

        public void setWeight(Weight weight) {
            this.weight = weight;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCfaUrl() {
            return cfaUrl;
        }

        public void setCfaUrl(String cfaUrl) {
            this.cfaUrl = cfaUrl;
        }

        public String getVetstreetUrl() {
            return vetstreetUrl;
        }

        public void setVetstreetUrl(String vetstreetUrl) {
            this.vetstreetUrl = vetstreetUrl;
        }

        public String getVcahospitalsUrl() {
            return vcahospitalsUrl;
        }

        public void setVcahospitalsUrl(String vcahospitalsUrl) {
            this.vcahospitalsUrl = vcahospitalsUrl;
        }

        public String getTemperament() {
            return temperament;
        }

        public void setTemperament(String temperament) {
            this.temperament = temperament;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getCountryCodes() {
            return countryCodes;
        }

        public void setCountryCodes(String countryCodes) {
            this.countryCodes = countryCodes;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLifeSpan() {
            return lifeSpan;
        }

        public void setLifeSpan(String lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public Integer getIndoor() {
            return indoor;
        }

        public void setIndoor(Integer indoor) {
            this.indoor = indoor;
        }

        public Integer getLap() {
            return lap;
        }

        public void setLap(Integer lap) {
            this.lap = lap;
        }

        public Integer getAdaptability() {
            return adaptability;
        }

        public void setAdaptability(Integer adaptability) {
            this.adaptability = adaptability;
        }

        public Integer getAffectionLevel() {
            return affectionLevel;
        }

        public void setAffectionLevel(Integer affectionLevel) {
            this.affectionLevel = affectionLevel;
        }

        public Integer getChildFriendly() {
            return childFriendly;
        }

        public void setChildFriendly(Integer childFriendly) {
            this.childFriendly = childFriendly;
        }

        public Integer getCatFriendly() {
            return catFriendly;
        }

        public void setCatFriendly(Integer catFriendly) {
            this.catFriendly = catFriendly;
        }

        public Integer getDogFriendly() {
            return dogFriendly;
        }

        public void setDogFriendly(Integer dogFriendly) {
            this.dogFriendly = dogFriendly;
        }

        public Integer getEnergyLevel() {
            return energyLevel;
        }

        public void setEnergyLevel(Integer energyLevel) {
            this.energyLevel = energyLevel;
        }

        public Integer getGrooming() {
            return grooming;
        }

        public void setGrooming(Integer grooming) {
            this.grooming = grooming;
        }

        public Integer getHealthIssues() {
            return healthIssues;
        }

        public void setHealthIssues(Integer healthIssues) {
            this.healthIssues = healthIssues;
        }

        public Integer getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(Integer intelligence) {
            this.intelligence = intelligence;
        }

        public Integer getSheddingLevel() {
            return sheddingLevel;
        }

        public void setSheddingLevel(Integer sheddingLevel) {
            this.sheddingLevel = sheddingLevel;
        }

        public Integer getSocialNeeds() {
            return socialNeeds;
        }

        public void setSocialNeeds(Integer socialNeeds) {
            this.socialNeeds = socialNeeds;
        }

        public Integer getStrangerFriendly() {
            return strangerFriendly;
        }

        public void setStrangerFriendly(Integer strangerFriendly) {
            this.strangerFriendly = strangerFriendly;
        }

        public Integer getVocalisation() {
            return vocalisation;
        }

        public void setVocalisation(Integer vocalisation) {
            this.vocalisation = vocalisation;
        }

        public Integer getBidability() {
            return bidability;
        }

        public void setBidability(Integer bidability) {
            this.bidability = bidability;
        }

        public Integer getExperimental() {
            return experimental;
        }

        public void setExperimental(Integer experimental) {
            this.experimental = experimental;
        }

        public Integer getHairless() {
            return hairless;
        }

        public void setHairless(Integer hairless) {
            this.hairless = hairless;
        }

        public Integer getNatural() {
            return natural;
        }

        public void setNatural(Integer natural) {
            this.natural = natural;
        }

        public Integer getRare() {
            return rare;
        }

        public void setRare(Integer rare) {
            this.rare = rare;
        }

        public Integer getRex() {
            return rex;
        }

        public void setRex(Integer rex) {
            this.rex = rex;
        }

        public Integer getSuppressedTail() {
            return suppressedTail;
        }

        public void setSuppressedTail(Integer suppressedTail) {
            this.suppressedTail = suppressedTail;
        }

        public Integer getShortLegs() {
            return shortLegs;
        }

        public void setShortLegs(Integer shortLegs) {
            this.shortLegs = shortLegs;
        }

        public String getWikipediaUrl() {
            return wikipediaUrl;
        }

        public void setWikipediaUrl(String wikipediaUrl) {
            this.wikipediaUrl = wikipediaUrl;
        }

        public Integer getHypoallergenic() {
            return hypoallergenic;
        }

        public void setHypoallergenic(Integer hypoallergenic) {
            this.hypoallergenic = hypoallergenic;
        }

        public String getReferenceImageId() {
            return referenceImageId;
        }

        public void setReferenceImageId(String referenceImageId) {
            this.referenceImageId = referenceImageId;
        }



    }

}
