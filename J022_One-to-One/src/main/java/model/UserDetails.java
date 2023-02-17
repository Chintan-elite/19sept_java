package model;

import jakarta.persistence.*;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="udid")
	int udid;
	
	@Column(name="youtube")
	String youtube_channel;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	User user;

	public int getUdid() {
		return udid;
	}

	public void setUdid(int udid) {
		this.udid = udid;
	}

	public String getYoutube_channel() {
		return youtube_channel;
	}

	public void setYoutube_channel(String youtube_channel) {
		this.youtube_channel = youtube_channel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
