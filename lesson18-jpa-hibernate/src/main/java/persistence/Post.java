package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T14_POST")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C14_POST_ID")
	private Long id;

	@Column(name = "C14_POST_TITLE")
	private String title;

	public Post() {
	}

	public Post(String title) {
		this.title = title;
	}

	// Khi tag liên quan đến post mà chưa tồn tại trong database
	// --> Thực hiện thêm tag vào luôn
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "T15_POST_TAG", 
			joinColumns = @JoinColumn(name = "C15_POST_ID"), 
			inverseJoinColumns = @JoinColumn(name = "C15_TAG_ID")
	)
	private List<Tag> tags = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	// helper methods
	
	public void addTag(Tag tag) {
		tags.add(tag);
		tag.getPosts().add(this);
	}

	public void removeTag(Tag tag) {
		tags.remove(tag);
		tag.getPosts().remove(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
			
		if (!(o instanceof Post that)) {
			return false;
		}
			
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + "]";
	}
}