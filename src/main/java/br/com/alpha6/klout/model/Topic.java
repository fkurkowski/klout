package br.com.alpha6.klout.model;

/**
 * Information about a topic.
 */
public class Topic {

	public String id;
	public String displayName;
	public String name;
	public String slug;
	public String imageUrl;
	public String displayType;
	public String topicType;

	/**
	 * Creates a new instance of this class
	 */
	public Topic() {}
	
	/**
	 * Creates a new instance of this class with topic information
	 * associated to an user
	 * 
	 * @param id the topic id.
	 * @param displayName the topic display name.
	 * @param name the topic name.
	 * @param slug the topic slug.
	 * @param imageUrl the topic image url.
	 * @param displayType the topic display type.
	 * @param topicType the topic type.
	 */
	public Topic(String id, String displayName, String name, String slug,
			String imageUrl, String displayType, String topicType) {
		this.id = id;
		this.displayName = displayName;
		this.name = name;
		this.slug = slug;
		this.imageUrl = imageUrl;
		this.displayType = displayType;
		this.topicType = topicType;
	}
	
	/**
	 * Returns the topic id.
	 *
	 * @return topic id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Defines the topic id.
	 * @param id the topic id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the topic display name.
	 *
	 * @return topic display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Defines the topic display name.
	 * 
	 * @param displayName the topic display name.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Returns the topic name.
	 *
	 * @return topic name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Defines the topic name.
	 * 
	 * @param name the topic name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the topic slug.
	 *
	 * @return topic slug.
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Defines the topic slug.
	 * 
	 * @param slug the topic slug.
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns the topic image url.
	 *
	 * @return topic image url.
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Defines the topic image url.
	 * 
	 * @param imageUrl the topic image url.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Returns the topic display type.
	 *
	 * @return topic display type
	 */
	public String getDisplayType() {
		return displayType;
	}

	/**
	 * Defines the topic display type.
	 * 
	 * @param displayType the topic display type.
	 */
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	/**
	 * Returns the topic type.
	 *
	 * @return topic type
	 */
	public String getTopicType() {
		return topicType;
	}

	/**
	 * Defines the topic type.
	 * 
	 * @param topicType the topic type.
	 */
	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}

	@Override
	public String toString() {
		return "Topic{" +
				"id='" + id + '\'' +
				", displayName='" + displayName + '\'' +
				", name='" + name + '\'' +
				", slug='" + slug + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", displayType='" + displayType + '\'' +
				", topicType='" + topicType + '\'' +
				'}';
	}
}