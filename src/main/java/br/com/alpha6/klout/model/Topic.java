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
	 * Returns the topic id.
	 *
	 * @return topic id
	 */
	public String getId() {
		return id;
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
	 * Returns the topic name.
	 *
	 * @return topic name
	 */
	public String getName() {
		return name;
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
	 * Returns the topic image url.
	 *
	 * @return topic image url.
	 */
	public String getImageUrl() {
		return imageUrl;
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
	 * Returns the topic type.
	 *
	 * @return topic type
	 */
	public String getTopicType() {
		return topicType;
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