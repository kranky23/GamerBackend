//-----------------------------------com.example.gamerbackend.Response.Appid.java-----------------------------------

package com.example.gamerbackend.Response;

import javax.annotation.Generated;
import java.util.List;

//-----------------------------------com.example.gamerbackend.Response.Category.java-----------------------------------



@Generated("jsonschema2pojo")
class Category {

    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Category.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return (((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.ContentDescriptors.java-----------------------------------


@Generated("jsonschema2pojo")
class ContentDescriptors {

    private List<Object> ids = null;
    private Object notes;

    public List<Object> getIds() {
        return ids;
    }

    public void setIds(List<Object> ids) {
        this.ids = ids;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContentDescriptors.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ids");
        sb.append('=');
        sb.append(((this.ids == null)?"<null>":this.ids));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.ids == null)? 0 :this.ids.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContentDescriptors) == false) {
            return false;
        }
        ContentDescriptors rhs = ((ContentDescriptors) other);
        return (((this.ids == rhs.ids)||((this.ids!= null)&&this.ids.equals(rhs.ids)))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Data.java-----------------------------------


@Generated("jsonschema2pojo")
class Data {

    private String type;
    private String name;
    private Integer steamAppid;
    private Integer requiredAge;
    private Boolean isFree;
    private String detailedDescription;
    private String aboutTheGame;
    private String shortDescription;
    private String supportedLanguages;
    private String headerImage;
    private Object website;
    private PcRequirements pcRequirements;
    private List<Object> macRequirements = null;
    private List<Object> linuxRequirements = null;
    private List<String> developers = null;
    private List<String> publishers = null;
    private PriceOverview priceOverview;
    private List<Integer> packages = null;
    private List<PackageGroup> packageGroups = null;
    private Platforms platforms;
    private Metacritic metacritic;
    private List<Category> categories = null;
    private List<Genre> genres = null;
    private List<Screenshot> screenshots = null;
    private Recommendations recommendations;
    private ReleaseDate releaseDate;
    private SupportInfo supportInfo;
    private String background;
    private String backgroundRaw;
    private ContentDescriptors contentDescriptors;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSteamAppid() {
        return steamAppid;
    }

    public void setSteamAppid(Integer steamAppid) {
        this.steamAppid = steamAppid;
    }

    public Integer getRequiredAge() {
        return requiredAge;
    }

    public void setRequiredAge(Integer requiredAge) {
        this.requiredAge = requiredAge;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String getAboutTheGame() {
        return aboutTheGame;
    }

    public void setAboutTheGame(String aboutTheGame) {
        this.aboutTheGame = aboutTheGame;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(String supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public PcRequirements getPcRequirements() {
        return pcRequirements;
    }

    public void setPcRequirements(PcRequirements pcRequirements) {
        this.pcRequirements = pcRequirements;
    }

    public List<Object> getMacRequirements() {
        return macRequirements;
    }

    public void setMacRequirements(List<Object> macRequirements) {
        this.macRequirements = macRequirements;
    }

    public List<Object> getLinuxRequirements() {
        return linuxRequirements;
    }

    public void setLinuxRequirements(List<Object> linuxRequirements) {
        this.linuxRequirements = linuxRequirements;
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<String> developers) {
        this.developers = developers;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public PriceOverview getPriceOverview() {
        return priceOverview;
    }

    public void setPriceOverview(PriceOverview priceOverview) {
        this.priceOverview = priceOverview;
    }

    public List<Integer> getPackages() {
        return packages;
    }

    public void setPackages(List<Integer> packages) {
        this.packages = packages;
    }

    public List<PackageGroup> getPackageGroups() {
        return packageGroups;
    }

    public void setPackageGroups(List<PackageGroup> packageGroups) {
        this.packageGroups = packageGroups;
    }

    public Platforms getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }

    public Metacritic getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(Metacritic metacritic) {
        this.metacritic = metacritic;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Screenshot> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<Screenshot> screenshots) {
        this.screenshots = screenshots;
    }

    public Recommendations getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Recommendations recommendations) {
        this.recommendations = recommendations;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ReleaseDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public SupportInfo getSupportInfo() {
        return supportInfo;
    }

    public void setSupportInfo(SupportInfo supportInfo) {
        this.supportInfo = supportInfo;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackgroundRaw() {
        return backgroundRaw;
    }

    public void setBackgroundRaw(String backgroundRaw) {
        this.backgroundRaw = backgroundRaw;
    }

    public ContentDescriptors getContentDescriptors() {
        return contentDescriptors;
    }

    public void setContentDescriptors(ContentDescriptors contentDescriptors) {
        this.contentDescriptors = contentDescriptors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("steamAppid");
        sb.append('=');
        sb.append(((this.steamAppid == null)?"<null>":this.steamAppid));
        sb.append(',');
        sb.append("requiredAge");
        sb.append('=');
        sb.append(((this.requiredAge == null)?"<null>":this.requiredAge));
        sb.append(',');
        sb.append("isFree");
        sb.append('=');
        sb.append(((this.isFree == null)?"<null>":this.isFree));
        sb.append(',');
        sb.append("detailedDescription");
        sb.append('=');
        sb.append(((this.detailedDescription == null)?"<null>":this.detailedDescription));
        sb.append(',');
        sb.append("aboutTheGame");
        sb.append('=');
        sb.append(((this.aboutTheGame == null)?"<null>":this.aboutTheGame));
        sb.append(',');
        sb.append("shortDescription");
        sb.append('=');
        sb.append(((this.shortDescription == null)?"<null>":this.shortDescription));
        sb.append(',');
        sb.append("supportedLanguages");
        sb.append('=');
        sb.append(((this.supportedLanguages == null)?"<null>":this.supportedLanguages));
        sb.append(',');
        sb.append("headerImage");
        sb.append('=');
        sb.append(((this.headerImage == null)?"<null>":this.headerImage));
        sb.append(',');
        sb.append("website");
        sb.append('=');
        sb.append(((this.website == null)?"<null>":this.website));
        sb.append(',');
        sb.append("pcRequirements");
        sb.append('=');
        sb.append(((this.pcRequirements == null)?"<null>":this.pcRequirements));
        sb.append(',');
        sb.append("macRequirements");
        sb.append('=');
        sb.append(((this.macRequirements == null)?"<null>":this.macRequirements));
        sb.append(',');
        sb.append("linuxRequirements");
        sb.append('=');
        sb.append(((this.linuxRequirements == null)?"<null>":this.linuxRequirements));
        sb.append(',');
        sb.append("developers");
        sb.append('=');
        sb.append(((this.developers == null)?"<null>":this.developers));
        sb.append(',');
        sb.append("publishers");
        sb.append('=');
        sb.append(((this.publishers == null)?"<null>":this.publishers));
        sb.append(',');
        sb.append("priceOverview");
        sb.append('=');
        sb.append(((this.priceOverview == null)?"<null>":this.priceOverview));
        sb.append(',');
        sb.append("packages");
        sb.append('=');
        sb.append(((this.packages == null)?"<null>":this.packages));
        sb.append(',');
        sb.append("packageGroups");
        sb.append('=');
        sb.append(((this.packageGroups == null)?"<null>":this.packageGroups));
        sb.append(',');
        sb.append("platforms");
        sb.append('=');
        sb.append(((this.platforms == null)?"<null>":this.platforms));
        sb.append(',');
        sb.append("metacritic");
        sb.append('=');
        sb.append(((this.metacritic == null)?"<null>":this.metacritic));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("genres");
        sb.append('=');
        sb.append(((this.genres == null)?"<null>":this.genres));
        sb.append(',');
        sb.append("screenshots");
        sb.append('=');
        sb.append(((this.screenshots == null)?"<null>":this.screenshots));
        sb.append(',');
        sb.append("recommendations");
        sb.append('=');
        sb.append(((this.recommendations == null)?"<null>":this.recommendations));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("supportInfo");
        sb.append('=');
        sb.append(((this.supportInfo == null)?"<null>":this.supportInfo));
        sb.append(',');
        sb.append("background");
        sb.append('=');
        sb.append(((this.background == null)?"<null>":this.background));
        sb.append(',');
        sb.append("backgroundRaw");
        sb.append('=');
        sb.append(((this.backgroundRaw == null)?"<null>":this.backgroundRaw));
        sb.append(',');
        sb.append("contentDescriptors");
        sb.append('=');
        sb.append(((this.contentDescriptors == null)?"<null>":this.contentDescriptors));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.aboutTheGame == null)? 0 :this.aboutTheGame.hashCode()));
        result = ((result* 31)+((this.requiredAge == null)? 0 :this.requiredAge.hashCode()));
        result = ((result* 31)+((this.developers == null)? 0 :this.developers.hashCode()));
        result = ((result* 31)+((this.metacritic == null)? 0 :this.metacritic.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.recommendations == null)? 0 :this.recommendations.hashCode()));
        result = ((result* 31)+((this.screenshots == null)? 0 :this.screenshots.hashCode()));
        result = ((result* 31)+((this.platforms == null)? 0 :this.platforms.hashCode()));
        result = ((result* 31)+((this.steamAppid == null)? 0 :this.steamAppid.hashCode()));
        result = ((result* 31)+((this.pcRequirements == null)? 0 :this.pcRequirements.hashCode()));
        result = ((result* 31)+((this.isFree == null)? 0 :this.isFree.hashCode()));
        result = ((result* 31)+((this.supportedLanguages == null)? 0 :this.supportedLanguages.hashCode()));
        result = ((result* 31)+((this.headerImage == null)? 0 :this.headerImage.hashCode()));
        result = ((result* 31)+((this.genres == null)? 0 :this.genres.hashCode()));
        result = ((result* 31)+((this.publishers == null)? 0 :this.publishers.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.macRequirements == null)? 0 :this.macRequirements.hashCode()));
        result = ((result* 31)+((this.website == null)? 0 :this.website.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.shortDescription == null)? 0 :this.shortDescription.hashCode()));
        result = ((result* 31)+((this.packages == null)? 0 :this.packages.hashCode()));
        result = ((result* 31)+((this.linuxRequirements == null)? 0 :this.linuxRequirements.hashCode()));
        result = ((result* 31)+((this.detailedDescription == null)? 0 :this.detailedDescription.hashCode()));
        result = ((result* 31)+((this.background == null)? 0 :this.background.hashCode()));
        result = ((result* 31)+((this.priceOverview == null)? 0 :this.priceOverview.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.backgroundRaw == null)? 0 :this.backgroundRaw.hashCode()));
        result = ((result* 31)+((this.contentDescriptors == null)? 0 :this.contentDescriptors.hashCode()));
        result = ((result* 31)+((this.packageGroups == null)? 0 :this.packageGroups.hashCode()));
        result = ((result* 31)+((this.supportInfo == null)? 0 :this.supportInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((((((((((((((((((((((((((((((this.aboutTheGame == rhs.aboutTheGame)||((this.aboutTheGame!= null)&&this.aboutTheGame.equals(rhs.aboutTheGame)))&&((this.requiredAge == rhs.requiredAge)||((this.requiredAge!= null)&&this.requiredAge.equals(rhs.requiredAge))))&&((this.developers == rhs.developers)||((this.developers!= null)&&this.developers.equals(rhs.developers))))&&((this.metacritic == rhs.metacritic)||((this.metacritic!= null)&&this.metacritic.equals(rhs.metacritic))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.recommendations == rhs.recommendations)||((this.recommendations!= null)&&this.recommendations.equals(rhs.recommendations))))&&((this.screenshots == rhs.screenshots)||((this.screenshots!= null)&&this.screenshots.equals(rhs.screenshots))))&&((this.platforms == rhs.platforms)||((this.platforms!= null)&&this.platforms.equals(rhs.platforms))))&&((this.steamAppid == rhs.steamAppid)||((this.steamAppid!= null)&&this.steamAppid.equals(rhs.steamAppid))))&&((this.pcRequirements == rhs.pcRequirements)||((this.pcRequirements!= null)&&this.pcRequirements.equals(rhs.pcRequirements))))&&((this.isFree == rhs.isFree)||((this.isFree!= null)&&this.isFree.equals(rhs.isFree))))&&((this.supportedLanguages == rhs.supportedLanguages)||((this.supportedLanguages!= null)&&this.supportedLanguages.equals(rhs.supportedLanguages))))&&((this.headerImage == rhs.headerImage)||((this.headerImage!= null)&&this.headerImage.equals(rhs.headerImage))))&&((this.genres == rhs.genres)||((this.genres!= null)&&this.genres.equals(rhs.genres))))&&((this.publishers == rhs.publishers)||((this.publishers!= null)&&this.publishers.equals(rhs.publishers))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.macRequirements == rhs.macRequirements)||((this.macRequirements!= null)&&this.macRequirements.equals(rhs.macRequirements))))&&((this.website == rhs.website)||((this.website!= null)&&this.website.equals(rhs.website))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.shortDescription == rhs.shortDescription)||((this.shortDescription!= null)&&this.shortDescription.equals(rhs.shortDescription))))&&((this.packages == rhs.packages)||((this.packages!= null)&&this.packages.equals(rhs.packages))))&&((this.linuxRequirements == rhs.linuxRequirements)||((this.linuxRequirements!= null)&&this.linuxRequirements.equals(rhs.linuxRequirements))))&&((this.detailedDescription == rhs.detailedDescription)||((this.detailedDescription!= null)&&this.detailedDescription.equals(rhs.detailedDescription))))&&((this.background == rhs.background)||((this.background!= null)&&this.background.equals(rhs.background))))&&((this.priceOverview == rhs.priceOverview)||((this.priceOverview!= null)&&this.priceOverview.equals(rhs.priceOverview))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.backgroundRaw == rhs.backgroundRaw)||((this.backgroundRaw!= null)&&this.backgroundRaw.equals(rhs.backgroundRaw))))&&((this.contentDescriptors == rhs.contentDescriptors)||((this.contentDescriptors!= null)&&this.contentDescriptors.equals(rhs.contentDescriptors))))&&((this.packageGroups == rhs.packageGroups)||((this.packageGroups!= null)&&this.packageGroups.equals(rhs.packageGroups))))&&((this.supportInfo == rhs.supportInfo)||((this.supportInfo!= null)&&this.supportInfo.equals(rhs.supportInfo))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.GameResponse.java-----------------------------------


@Generated("jsonschema2pojo")
public
class GameResponse {

    private Appid appid;

    public Appid getAppid() {
        return appid;
    }

    public void setAppid(Appid appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GameResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appid");
        sb.append('=');
        sb.append(((this.appid == null)?"<null>":this.appid));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.appid == null)? 0 :this.appid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameResponse) == false) {
            return false;
        }
        GameResponse rhs = ((GameResponse) other);
        return ((this.appid == rhs.appid)||((this.appid!= null)&&this.appid.equals(rhs.appid)));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Genre.java-----------------------------------


@Generated("jsonschema2pojo")
class Genre {

    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Genre.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Genre) == false) {
            return false;
        }
        Genre rhs = ((Genre) other);
        return (((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Metacritic.java-----------------------------------


@Generated("jsonschema2pojo")
class Metacritic {

    private Integer score;
    private String url;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metacritic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metacritic) == false) {
            return false;
        }
        Metacritic rhs = ((Metacritic) other);
        return (((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.PackageGroup.java-----------------------------------



@Generated("jsonschema2pojo")
class PackageGroup {

    private String name;
    private String title;
    private String description;
    private String selectionText;
    private String saveText;
    private Integer displayType;
    private String isRecurringSubscription;
    private List<Sub> subs = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSelectionText() {
        return selectionText;
    }

    public void setSelectionText(String selectionText) {
        this.selectionText = selectionText;
    }

    public String getSaveText() {
        return saveText;
    }

    public void setSaveText(String saveText) {
        this.saveText = saveText;
    }

    public Integer getDisplayType() {
        return displayType;
    }

    public void setDisplayType(Integer displayType) {
        this.displayType = displayType;
    }

    public String getIsRecurringSubscription() {
        return isRecurringSubscription;
    }

    public void setIsRecurringSubscription(String isRecurringSubscription) {
        this.isRecurringSubscription = isRecurringSubscription;
    }

    public List<Sub> getSubs() {
        return subs;
    }

    public void setSubs(List<Sub> subs) {
        this.subs = subs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PackageGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("selectionText");
        sb.append('=');
        sb.append(((this.selectionText == null)?"<null>":this.selectionText));
        sb.append(',');
        sb.append("saveText");
        sb.append('=');
        sb.append(((this.saveText == null)?"<null>":this.saveText));
        sb.append(',');
        sb.append("displayType");
        sb.append('=');
        sb.append(((this.displayType == null)?"<null>":this.displayType));
        sb.append(',');
        sb.append("isRecurringSubscription");
        sb.append('=');
        sb.append(((this.isRecurringSubscription == null)?"<null>":this.isRecurringSubscription));
        sb.append(',');
        sb.append("subs");
        sb.append('=');
        sb.append(((this.subs == null)?"<null>":this.subs));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.isRecurringSubscription == null)? 0 :this.isRecurringSubscription.hashCode()));
        result = ((result* 31)+((this.displayType == null)? 0 :this.displayType.hashCode()));
        result = ((result* 31)+((this.subs == null)? 0 :this.subs.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.saveText == null)? 0 :this.saveText.hashCode()));
        result = ((result* 31)+((this.selectionText == null)? 0 :this.selectionText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PackageGroup) == false) {
            return false;
        }
        PackageGroup rhs = ((PackageGroup) other);
        return (((((((((this.isRecurringSubscription == rhs.isRecurringSubscription)||((this.isRecurringSubscription!= null)&&this.isRecurringSubscription.equals(rhs.isRecurringSubscription)))&&((this.displayType == rhs.displayType)||((this.displayType!= null)&&this.displayType.equals(rhs.displayType))))&&((this.subs == rhs.subs)||((this.subs!= null)&&this.subs.equals(rhs.subs))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.saveText == rhs.saveText)||((this.saveText!= null)&&this.saveText.equals(rhs.saveText))))&&((this.selectionText == rhs.selectionText)||((this.selectionText!= null)&&this.selectionText.equals(rhs.selectionText))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.PcRequirements.java-----------------------------------


@Generated("jsonschema2pojo")
class PcRequirements {

    private String minimum;

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PcRequirements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minimum");
        sb.append('=');
        sb.append(((this.minimum == null)?"<null>":this.minimum));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.minimum == null)? 0 :this.minimum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PcRequirements) == false) {
            return false;
        }
        PcRequirements rhs = ((PcRequirements) other);
        return ((this.minimum == rhs.minimum)||((this.minimum!= null)&&this.minimum.equals(rhs.minimum)));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Platforms.java-----------------------------------


@Generated("jsonschema2pojo")
class Platforms {

    private Boolean windows;
    private Boolean mac;
    private Boolean linux;

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getMac() {
        return mac;
    }

    public void setMac(Boolean mac) {
        this.mac = mac;
    }

    public Boolean getLinux() {
        return linux;
    }

    public void setLinux(Boolean linux) {
        this.linux = linux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Platforms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("windows");
        sb.append('=');
        sb.append(((this.windows == null)?"<null>":this.windows));
        sb.append(',');
        sb.append("mac");
        sb.append('=');
        sb.append(((this.mac == null)?"<null>":this.mac));
        sb.append(',');
        sb.append("linux");
        sb.append('=');
        sb.append(((this.linux == null)?"<null>":this.linux));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.windows == null)? 0 :this.windows.hashCode()));
        result = ((result* 31)+((this.mac == null)? 0 :this.mac.hashCode()));
        result = ((result* 31)+((this.linux == null)? 0 :this.linux.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Platforms) == false) {
            return false;
        }
        Platforms rhs = ((Platforms) other);
        return ((((this.windows == rhs.windows)||((this.windows!= null)&&this.windows.equals(rhs.windows)))&&((this.mac == rhs.mac)||((this.mac!= null)&&this.mac.equals(rhs.mac))))&&((this.linux == rhs.linux)||((this.linux!= null)&&this.linux.equals(rhs.linux))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.PriceOverview.java-----------------------------------


@Generated("jsonschema2pojo")
class PriceOverview {

    private String currency;
    private Integer initial;
    private Integer _final;
    private Integer discountPercent;
    private String initialFormatted;
    private String finalFormatted;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getInitial() {
        return initial;
    }

    public void setInitial(Integer initial) {
        this.initial = initial;
    }

    public Integer getFinal() {
        return _final;
    }

    public void setFinal(Integer _final) {
        this._final = _final;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getInitialFormatted() {
        return initialFormatted;
    }

    public void setInitialFormatted(String initialFormatted) {
        this.initialFormatted = initialFormatted;
    }

    public String getFinalFormatted() {
        return finalFormatted;
    }

    public void setFinalFormatted(String finalFormatted) {
        this.finalFormatted = finalFormatted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriceOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("initial");
        sb.append('=');
        sb.append(((this.initial == null)?"<null>":this.initial));
        sb.append(',');
        sb.append("_final");
        sb.append('=');
        sb.append(((this._final == null)?"<null>":this._final));
        sb.append(',');
        sb.append("discountPercent");
        sb.append('=');
        sb.append(((this.discountPercent == null)?"<null>":this.discountPercent));
        sb.append(',');
        sb.append("initialFormatted");
        sb.append('=');
        sb.append(((this.initialFormatted == null)?"<null>":this.initialFormatted));
        sb.append(',');
        sb.append("finalFormatted");
        sb.append('=');
        sb.append(((this.finalFormatted == null)?"<null>":this.finalFormatted));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.discountPercent == null)? 0 :this.discountPercent.hashCode()));
        result = ((result* 31)+((this.initial == null)? 0 :this.initial.hashCode()));
        result = ((result* 31)+((this.initialFormatted == null)? 0 :this.initialFormatted.hashCode()));
        result = ((result* 31)+((this.finalFormatted == null)? 0 :this.finalFormatted.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this._final == null)? 0 :this._final.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriceOverview) == false) {
            return false;
        }
        PriceOverview rhs = ((PriceOverview) other);
        return (((((((this.discountPercent == rhs.discountPercent)||((this.discountPercent!= null)&&this.discountPercent.equals(rhs.discountPercent)))&&((this.initial == rhs.initial)||((this.initial!= null)&&this.initial.equals(rhs.initial))))&&((this.initialFormatted == rhs.initialFormatted)||((this.initialFormatted!= null)&&this.initialFormatted.equals(rhs.initialFormatted))))&&((this.finalFormatted == rhs.finalFormatted)||((this.finalFormatted!= null)&&this.finalFormatted.equals(rhs.finalFormatted))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this._final == rhs._final)||((this._final!= null)&&this._final.equals(rhs._final))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Recommendations.java-----------------------------------


@Generated("jsonschema2pojo")
class Recommendations {

    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Recommendations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Recommendations) == false) {
            return false;
        }
        Recommendations rhs = ((Recommendations) other);
        return ((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)));
    }

}
//-----------------------------------com.example.gamerbackend.Response.ReleaseDate.java-----------------------------------


@Generated("jsonschema2pojo")
class ReleaseDate {

    private Boolean comingSoon;
    private String date;

    public Boolean getComingSoon() {
        return comingSoon;
    }

    public void setComingSoon(Boolean comingSoon) {
        this.comingSoon = comingSoon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReleaseDate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comingSoon");
        sb.append('=');
        sb.append(((this.comingSoon == null)?"<null>":this.comingSoon));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.comingSoon == null)? 0 :this.comingSoon.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReleaseDate) == false) {
            return false;
        }
        ReleaseDate rhs = ((ReleaseDate) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.comingSoon == rhs.comingSoon)||((this.comingSoon!= null)&&this.comingSoon.equals(rhs.comingSoon))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Screenshot.java-----------------------------------



@Generated("jsonschema2pojo")
class Screenshot {

    private Integer id;
    private String pathThumbnail;
    private String pathFull;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPathThumbnail() {
        return pathThumbnail;
    }

    public void setPathThumbnail(String pathThumbnail) {
        this.pathThumbnail = pathThumbnail;
    }

    public String getPathFull() {
        return pathFull;
    }

    public void setPathFull(String pathFull) {
        this.pathFull = pathFull;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Screenshot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("pathThumbnail");
        sb.append('=');
        sb.append(((this.pathThumbnail == null)?"<null>":this.pathThumbnail));
        sb.append(',');
        sb.append("pathFull");
        sb.append('=');
        sb.append(((this.pathFull == null)?"<null>":this.pathFull));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.pathFull == null)? 0 :this.pathFull.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pathThumbnail == null)? 0 :this.pathThumbnail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Screenshot) == false) {
            return false;
        }
        Screenshot rhs = ((Screenshot) other);
        return ((((this.pathFull == rhs.pathFull)||((this.pathFull!= null)&&this.pathFull.equals(rhs.pathFull)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pathThumbnail == rhs.pathThumbnail)||((this.pathThumbnail!= null)&&this.pathThumbnail.equals(rhs.pathThumbnail))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.Sub.java-----------------------------------


@Generated("jsonschema2pojo")
class Sub {

    private Integer packageid;
    private String percentSavingsText;
    private Integer percentSavings;
    private String optionText;
    private String optionDescription;
    private String canGetFreeLicense;
    private Boolean isFreeLicense;
    private Integer priceInCentsWithDiscount;

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

    public String getPercentSavingsText() {
        return percentSavingsText;
    }

    public void setPercentSavingsText(String percentSavingsText) {
        this.percentSavingsText = percentSavingsText;
    }

    public Integer getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Integer percentSavings) {
        this.percentSavings = percentSavings;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }

    public String getCanGetFreeLicense() {
        return canGetFreeLicense;
    }

    public void setCanGetFreeLicense(String canGetFreeLicense) {
        this.canGetFreeLicense = canGetFreeLicense;
    }

    public Boolean getIsFreeLicense() {
        return isFreeLicense;
    }

    public void setIsFreeLicense(Boolean isFreeLicense) {
        this.isFreeLicense = isFreeLicense;
    }

    public Integer getPriceInCentsWithDiscount() {
        return priceInCentsWithDiscount;
    }

    public void setPriceInCentsWithDiscount(Integer priceInCentsWithDiscount) {
        this.priceInCentsWithDiscount = priceInCentsWithDiscount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sub.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("packageid");
        sb.append('=');
        sb.append(((this.packageid == null)?"<null>":this.packageid));
        sb.append(',');
        sb.append("percentSavingsText");
        sb.append('=');
        sb.append(((this.percentSavingsText == null)?"<null>":this.percentSavingsText));
        sb.append(',');
        sb.append("percentSavings");
        sb.append('=');
        sb.append(((this.percentSavings == null)?"<null>":this.percentSavings));
        sb.append(',');
        sb.append("optionText");
        sb.append('=');
        sb.append(((this.optionText == null)?"<null>":this.optionText));
        sb.append(',');
        sb.append("optionDescription");
        sb.append('=');
        sb.append(((this.optionDescription == null)?"<null>":this.optionDescription));
        sb.append(',');
        sb.append("canGetFreeLicense");
        sb.append('=');
        sb.append(((this.canGetFreeLicense == null)?"<null>":this.canGetFreeLicense));
        sb.append(',');
        sb.append("isFreeLicense");
        sb.append('=');
        sb.append(((this.isFreeLicense == null)?"<null>":this.isFreeLicense));
        sb.append(',');
        sb.append("priceInCentsWithDiscount");
        sb.append('=');
        sb.append(((this.priceInCentsWithDiscount == null)?"<null>":this.priceInCentsWithDiscount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.canGetFreeLicense == null)? 0 :this.canGetFreeLicense.hashCode()));
        result = ((result* 31)+((this.optionDescription == null)? 0 :this.optionDescription.hashCode()));
        result = ((result* 31)+((this.packageid == null)? 0 :this.packageid.hashCode()));
        result = ((result* 31)+((this.priceInCentsWithDiscount == null)? 0 :this.priceInCentsWithDiscount.hashCode()));
        result = ((result* 31)+((this.optionText == null)? 0 :this.optionText.hashCode()));
        result = ((result* 31)+((this.isFreeLicense == null)? 0 :this.isFreeLicense.hashCode()));
        result = ((result* 31)+((this.percentSavingsText == null)? 0 :this.percentSavingsText.hashCode()));
        result = ((result* 31)+((this.percentSavings == null)? 0 :this.percentSavings.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sub) == false) {
            return false;
        }
        Sub rhs = ((Sub) other);
        return (((((((((this.canGetFreeLicense == rhs.canGetFreeLicense)||((this.canGetFreeLicense!= null)&&this.canGetFreeLicense.equals(rhs.canGetFreeLicense)))&&((this.optionDescription == rhs.optionDescription)||((this.optionDescription!= null)&&this.optionDescription.equals(rhs.optionDescription))))&&((this.packageid == rhs.packageid)||((this.packageid!= null)&&this.packageid.equals(rhs.packageid))))&&((this.priceInCentsWithDiscount == rhs.priceInCentsWithDiscount)||((this.priceInCentsWithDiscount!= null)&&this.priceInCentsWithDiscount.equals(rhs.priceInCentsWithDiscount))))&&((this.optionText == rhs.optionText)||((this.optionText!= null)&&this.optionText.equals(rhs.optionText))))&&((this.isFreeLicense == rhs.isFreeLicense)||((this.isFreeLicense!= null)&&this.isFreeLicense.equals(rhs.isFreeLicense))))&&((this.percentSavingsText == rhs.percentSavingsText)||((this.percentSavingsText!= null)&&this.percentSavingsText.equals(rhs.percentSavingsText))))&&((this.percentSavings == rhs.percentSavings)||((this.percentSavings!= null)&&this.percentSavings.equals(rhs.percentSavings))));
    }

}
//-----------------------------------com.example.gamerbackend.Response.SupportInfo.java-----------------------------------


@Generated("jsonschema2pojo")
class SupportInfo {

    private String url;
    private String email;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportInfo) == false) {
            return false;
        }
        SupportInfo rhs = ((SupportInfo) other);
        return (((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url)))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
