package com.example.Register_Login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "influencers")
public class Influencer {


	    @Id
	    @Column(name = "instagram_handle")
	    private String instagramHandle;

	    @Column(name = "average_view")
	    private Integer averageView;

	    @Column(name = "collab_type")
	    private String collabType;

	    @Column(name = "contact_info")
	    private String contactInfo;

	    @Column(name = "follower_count")
	    private Integer followerCount;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "niche")
	    private String niche;

    // Getters and Setters

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getinstagramHandle() {
        return instagramHandle;
    }

    public void setinstagramHandle(String instagramHandle) {
        this.instagramHandle = instagramHandle;
    }

    public int getfollowerCount() {
        return followerCount;
    }

    public void setfollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public String getniche() {
        return niche;
    }

    public void setniche(String niche) {
        this.niche = niche;
    }

    public int getaverageView() {
        return averageView;
    }

    public void setaverageView(int averageView) {
        this.averageView = averageView;
    }

    public String getcontactInfo() {
        return contactInfo;
    }

    public void setcontactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getcollabType() {
        return collabType;
    }

    public void setcollabType(String collabType) {
        this.collabType = collabType;
    }
}
